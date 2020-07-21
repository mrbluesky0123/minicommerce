package com.skcc.minicommerce.goods.dto;

import com.skcc.minicommerce.goods.vo.GoodsVo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GoodsDto {

  private GoodsVo goodsVo;

}
