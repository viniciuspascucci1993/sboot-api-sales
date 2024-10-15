package com.sboot.api.sales.sboot.adapters.in.consumer.message;

import com.sboot.api.sales.sboot.application.core.domain.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleMessaging {

    private String id;
    private Long saleCode;
    private String productCode;

    private boolean isValidSale;
}
