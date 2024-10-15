package com.sboot.api.sales.sboot.application.core.usecase;

import com.sboot.api.sales.sboot.application.core.domain.Sale;
import com.sboot.api.sales.sboot.application.ports.in.FindSaleByIdInputPort;
import com.sboot.api.sales.sboot.application.ports.in.UpdateSaleInputPort;
import com.sboot.api.sales.sboot.application.ports.out.FindSaleByProductCodeOutpurPort;
import com.sboot.api.sales.sboot.application.ports.out.UpdateSaleOutputPort;

public class UpdateSaleUseCase implements UpdateSaleInputPort {

    private final FindSaleByIdInputPort findSaleByIdInputPort;

    private final FindSaleByProductCodeOutpurPort findSaleByProductCodeOutpurPort;

    private final UpdateSaleOutputPort updateSaleOutputPort;

    public UpdateSaleUseCase(FindSaleByIdInputPort findSaleByIdInputPort,
                             FindSaleByProductCodeOutpurPort findSaleByProductCodeOutpurPort,
                             UpdateSaleOutputPort updateSaleOutputPort) {
        this.findSaleByIdInputPort = findSaleByIdInputPort;
        this.findSaleByProductCodeOutpurPort = findSaleByProductCodeOutpurPort;
        this.updateSaleOutputPort = updateSaleOutputPort;
    }

    @Override
    public void update(Sale sale, String productCode) {
        findSaleByIdInputPort.find(sale.getId());
        var product = findSaleByProductCodeOutpurPort.find(productCode);
        sale.setProduct(product);
        updateSaleOutputPort.update(sale);
    }
}
