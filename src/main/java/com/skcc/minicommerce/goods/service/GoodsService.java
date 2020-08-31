package com.skcc.minicommerce.goods.service;

import com.skcc.minicommerce.goods.dao.GoodsDao;
import com.skcc.minicommerce.goods.dto.GoodsDto;
import com.skcc.minicommerce.goods.vo.GoodsVo;
import com.skcc.minicommerce.review.service.ReviewService;
import com.skcc.minicommerce.review.vo.ReviewVo;
import com.skcc.minicommerce.util.RequestScopeUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class GoodsService {

  public GoodsDao goodsDao;
  public ReviewService reviewService;

  public GoodsService() {}

  @Autowired
  public GoodsService(GoodsDao goodsDao, ReviewService reviewService) {
    this.goodsDao = goodsDao;
    this.reviewService = reviewService;
  }

  public GoodsDto getGoodsInfo(Long goodsId) {

    // Goods
    GoodsVo goodsInfo = this.goodsDao.selectOne(goodsId);
    log.error("#####" + goodsId);
    log.error("#####" + goodsInfo);

    // Reviews
//    List<ReviewVo> reviewVoList = this.reviewService.getReview(goodsId);

    log.error(RequestScopeUtil.getCurrentRequest().getHeader("UUID" ));

    return GoodsDto.builder().goodsVo(goodsInfo).reviewVoList(null).build();

  }

}
