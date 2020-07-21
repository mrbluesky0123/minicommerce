package com.skcc.minicommerce.goods.vo;

import java.time.LocalDateTime;

import lombok.*;
import org.apache.ibatis.type.Alias;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Alias("goods")
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
