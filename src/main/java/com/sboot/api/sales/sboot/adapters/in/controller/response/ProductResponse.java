package com.sboot.api.sales.sboot.adapters.in.controller.response;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductResponse {

    private String nameProduct;
    private String description;
    private BigDecimal productPrice;
}
