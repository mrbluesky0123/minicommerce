package com.skcc.minicommerce.goods.controller;

import com.skcc.minicommerce.goods.dto.GoodsDto;
import com.skcc.minicommerce.goods.service.GoodsService;
import com.skcc.minicommerce.goods.service.MailService;
import com.skcc.minicommerce.review.service.ReviewService;
import com.skcc.minicommerce.review.vo.ReviewVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="*")
@RestController
public class GoodsController {


  private GoodsService goodsService;
  private ReviewService reviewService;
  private MailService mailService;

  @Autowired
  public GoodsController(GoodsService goodsService, ReviewService reviewService, MailService mailService) {
    this.goodsService = goodsService;
    this.reviewService = reviewService;
    this.mailService = mailService;
  }

  @GetMapping("/goods/goodsinfo/{goodsId}")
  public GoodsDto getThingsInfo(@PathVariable Long goodsId){

    return this.goodsService.getGoodsInfo(goodsId);

  }

  @GetMapping("/mail")
  public String sendMail(){

    this.mailService.mailSend();
    return "Complete!";

  }

  @PostMapping("/goods/review")
  public String postReview(@RequestBody ReviewVo reviewVo) {

    return this.reviewService.postReview(reviewVo);

  }

}
