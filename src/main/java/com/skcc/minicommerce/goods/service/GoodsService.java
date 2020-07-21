package com.skcc.minicommerce.goods.service;

import com.skcc.minicommerce.goods.dao.GoodsDao;
import com.skcc.minicommerce.goods.dto.GoodsDto;
import com.skcc.minicommerce.goods.vo.GoodsVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GoodsService {

  public GoodsDao goodsDao;

  public GoodsService() {}

  @Autowired
  public GoodsService(GoodsDao goodsDao) {
    this.goodsDao = goodsDao;
  }

  public GoodsDto getGoodsInfo(Long goodsId) {

    GoodsVo goodsInfo = this.goodsDao.selectOne(goodsId);
    log.error("#####" + goodsId);
    log.error("#####" + goodsInfo);
    GoodsDto goodsDto = new GoodsDto();
    return GoodsDto.builder().goodsVo(goodsInfo).build();

  }

}
