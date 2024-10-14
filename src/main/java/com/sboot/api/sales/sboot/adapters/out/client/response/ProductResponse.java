package com.sboot.api.sales.sboot.adapters.out.client.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {

    private String nameProduct;
    private String description;
    private BigDecimal productPrice;
}
