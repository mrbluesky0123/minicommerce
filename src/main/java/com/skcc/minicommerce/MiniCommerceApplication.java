package com.skcc.minicommerce;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.skcc.minicommerce.goods")
public class MiniCommerceApplication {

  public static void main(String[] args) {
    SpringApplication.run(MiniCommerceApplication.class, args);
  }

}
