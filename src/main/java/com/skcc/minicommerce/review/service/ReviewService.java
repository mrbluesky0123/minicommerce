package com.skcc.minicommerce.review.service;

import com.skcc.minicommerce.goods.vo.GoodsVo;
import com.skcc.minicommerce.review.vo.ReviewVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class ReviewService {

    private RestTemplate restTemplate;

    @Autowired
    public ReviewService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<ReviewVo> getReview(Long goodsId) {

        ReviewVo[] reviews = restTemplate.getForObject("http://198.13.47.188:8888/goodsreview/" + goodsId,
                ReviewVo[].class);
        List<ReviewVo> reviewList = Arrays.asList(reviews);
        return reviewList;
    }

    public String postReview(ReviewVo reviewVo) {

        HttpHeaders headers = new HttpHeaders();
        log.error(reviewVo.toString());
        headers.set("headerTest", "headerValue");
        HttpEntity<ReviewVo> request = new HttpEntity<>(reviewVo, headers);
        String result = restTemplate.postForObject("http://198.13.47.188:8888/goodsreview", request, String.class);

        return result;
    }

}
