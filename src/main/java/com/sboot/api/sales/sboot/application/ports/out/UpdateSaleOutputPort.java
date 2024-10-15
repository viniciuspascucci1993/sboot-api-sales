package com.sboot.api.sales.sboot.application.ports.out;

import com.sboot.api.sales.sboot.application.core.domain.Sale;

public interface UpdateSaleOutputPort {

    void update(Sale sale);
}
