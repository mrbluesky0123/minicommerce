package com.skcc.minicommerce.goods.dto;

import com.skcc.minicommerce.goods.vo.GoodsVo;
import com.skcc.minicommerce.review.service.ReviewService;
import com.skcc.minicommerce.review.vo.ReviewVo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GoodsDto {

  private GoodsVo goodsVo;
  private List<ReviewVo> reviewVoList;

}
