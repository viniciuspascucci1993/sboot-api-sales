package com.sboot.api.sales.sboot.application.core.usecase;

import com.sboot.api.sales.sboot.application.ports.in.DeleteSaleByIdInputPort;
import com.sboot.api.sales.sboot.application.ports.out.DeleteSaleByIdOutputPort;
import com.sboot.api.sales.sboot.application.ports.out.FindSaleByIdOutputPort;

public class DeleteSaLeByIdUseCase implements DeleteSaleByIdInputPort {

    private final FindSaleByIdOutputPort findSaleByIdOutputPort;

    private final DeleteSaleByIdOutputPort deleteSaleByIdOutputPort;

    public DeleteSaLeByIdUseCase(FindSaleByIdOutputPort findSaleByIdOutputPort,
                                 DeleteSaleByIdOutputPort deleteSaleByIdOutputPort) {
        this.findSaleByIdOutputPort = findSaleByIdOutputPort;
        this.deleteSaleByIdOutputPort = deleteSaleByIdOutputPort;
    }

    @Override
    public void delete(String id) {
        findSaleByIdOutputPort.find(id);
        deleteSaleByIdOutputPort.delete(id);
    }
}
