package com.smart.coach.entity;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
public class DevData {
    private Long devId;
    private Date timestamp;
    private Double speed;
    private Double distance;
    private BigDecimal latitude;
    private BigDecimal longitude;
}
