package com.sboot.api.sales.sboot.application.core.usecase;

import com.sboot.api.sales.sboot.application.core.domain.Sale;
import com.sboot.api.sales.sboot.application.ports.in.InsertSaleInputPort;
import com.sboot.api.sales.sboot.application.ports.out.FindSaleByProductCodeOutpurPort;
import com.sboot.api.sales.sboot.application.ports.out.InsertSaleOutputPort;
import com.sboot.api.sales.sboot.application.ports.out.SendSaleForValidationOutputPort;

public class InsertSaleUseCase implements InsertSaleInputPort {

    private final FindSaleByProductCodeOutpurPort findSaleByProductCodeOutpurPort;
    private final InsertSaleOutputPort insertSaleOutputPort;

    private final SendSaleForValidationOutputPort sendSaleForValidationOutputPort;

    public InsertSaleUseCase(FindSaleByProductCodeOutpurPort
                             findSaleByProductCodeOutpurPort,
                             InsertSaleOutputPort insertSaleOutputPort,
                             SendSaleForValidationOutputPort sendSaleForValidationOutputPort) {
        this.findSaleByProductCodeOutpurPort = findSaleByProductCodeOutpurPort;
        this.insertSaleOutputPort = insertSaleOutputPort;
        this.sendSaleForValidationOutputPort = sendSaleForValidationOutputPort;
    }

    @Override
    public void insert(Sale sale, String productCode) {
        var product = findSaleByProductCodeOutpurPort.find(productCode);
        sale.setProduct(product);
        insertSaleOutputPort.insert(sale);

        sendSaleForValidationOutputPort.send(sale.getSaleCode());
    }
}
