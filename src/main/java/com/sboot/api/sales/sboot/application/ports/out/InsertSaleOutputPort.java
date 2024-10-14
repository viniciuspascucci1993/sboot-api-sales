package com.sboot.api.sales.sboot.application.ports.out;

import com.sboot.api.sales.sboot.application.core.domain.Sale;

public interface InsertSaleOutputPort {

    void insert(Sale sale);
}
