package com.skcc.minicommerce.goods.controller;

import com.skcc.minicommerce.goods.dto.GoodsDto;
import com.skcc.minicommerce.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController {


  private GoodsService goodsService;

  @Autowired
  public GoodsController(GoodsService goodsService) {
    this.goodsService = goodsService;
  }

  @GetMapping("/goods/goodsinfo/{goodsId}")
  public GoodsDto getThingsInfo(@PathVariable Long goodsId){

    return this.goodsService.getGoodsInfo(goodsId);

  }

}
