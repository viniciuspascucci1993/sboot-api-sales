package com.sboot.api.sales.sboot.application.core.usecase;

import com.sboot.api.sales.sboot.application.core.domain.Sale;
import com.sboot.api.sales.sboot.application.ports.in.FindSaleByIdInputPort;
import com.sboot.api.sales.sboot.application.ports.out.FindSaleByIdOutputPort;

public class FindSaleBtIdUseCase implements FindSaleByIdInputPort {

    private final FindSaleByIdOutputPort findSaleByIdOutputPort;

    public FindSaleBtIdUseCase(FindSaleByIdOutputPort findSaleByIdOutputPort) {
        this.findSaleByIdOutputPort = findSaleByIdOutputPort;
    }

    @Override
    public Sale find(String id) {
        return findSaleByIdOutputPort.find(id).orElseThrow(
                () -> new RuntimeException("Sale Not Found"));
    }
}
