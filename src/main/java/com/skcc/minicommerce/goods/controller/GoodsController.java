package com.skcc.minicommerce.goods.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController {

  @GetMapping("/things/thingsinfo")
  public String getThingsInfo(){
    return "Things information.";
  }

}
