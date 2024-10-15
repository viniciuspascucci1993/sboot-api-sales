package com.sboot.api.sales.sboot.application.ports.in;

import com.sboot.api.sales.sboot.application.core.domain.Sale;

public interface UpdateSaleInputPort {

    void update(Sale sale, String productCode);
}
