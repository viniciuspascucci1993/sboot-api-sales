package com.sboot.api.sales.sboot.adapters.in.controller.response;

import com.sboot.api.sales.sboot.application.core.domain.Product;
import lombok.Data;

@Data
public class SaleResponse {

    private Long saleCode;
    private Product product;

    private boolean isValidSale;
}
