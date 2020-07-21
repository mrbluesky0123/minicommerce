package com.skcc.minicommerce.goods.dao;

import com.skcc.minicommerce.goods.vo.GoodsVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface GoodsDao {

  GoodsVo selectOne(Long goodsId);

}
