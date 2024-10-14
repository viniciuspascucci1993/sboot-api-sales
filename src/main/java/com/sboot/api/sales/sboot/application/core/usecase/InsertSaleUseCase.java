package com.sboot.api.sales.sboot.application.core.usecase;

import com.sboot.api.sales.sboot.application.core.domain.Sale;
import com.sboot.api.sales.sboot.application.ports.out.FindSaleByProductCodeOutpurPort;
import com.sboot.api.sales.sboot.application.ports.out.InsertSaleOutputPort;

public class InsertSaleUseCase {

    private final FindSaleByProductCodeOutpurPort findSaleByProductCodeOutpurPort;
    private final InsertSaleOutputPort insertSaleOutputPort;

    public InsertSaleUseCase(FindSaleByProductCodeOutpurPort
                             findSaleByProductCodeOutpurPort,
                             InsertSaleOutputPort insertSaleOutputPort) {
        this.findSaleByProductCodeOutpurPort = findSaleByProductCodeOutpurPort;
        this.insertSaleOutputPort = insertSaleOutputPort;
    }

    public void insert(Sale sale, String productCode) {
        var product = findSaleByProductCodeOutpurPort.find(productCode);
        sale.setProduct(product);
        insertSaleOutputPort.insert(sale);
    }
}
