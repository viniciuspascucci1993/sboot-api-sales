package com.sboot.api.sales.sboot.application.ports.out;

import com.sboot.api.sales.sboot.application.core.domain.Product;

public interface FindSaleByProductCodeOutpurPort {

    Product find(String productCode);
}
