package com.skcc.minicommerce.review.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Slf4j
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReviewVo {

    private Long goodsId;
    private int reviewSeq;
    private String userId;
    private int reviewScore;
    private String reviewCmmnt;
    private String regDt;
    private String regrId;
    private String updDt;
    private String updrId;

}
