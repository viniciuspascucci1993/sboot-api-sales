package com.sboot.api.sales.sboot.application.ports.out;

import com.sboot.api.sales.sboot.application.core.domain.Sale;

import java.util.Optional;

public interface FindSaleByIdOutputPort {

    Optional<Sale> find(String id);
}
