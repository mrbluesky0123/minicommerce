package com.skcc.minicommerce.goods.vo;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GoodsVo {
  private Long goodsId;
  private String goodsBrnd;
  private String goodsThmbnl;
  private String goodsNm;
  private String goodsDscrptn;
  private String goodsCtgry1;
  private String goodsCtgry2;
  private String goodsCtgry3;
  private Long goodsPrc;
  private LocalDateTime regDt;
  private String regrId;
  private LocalDateTime updDt;
  private String updrId;
}
