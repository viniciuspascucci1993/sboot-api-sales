package com.sboot.api.sales.sboot.adapters.out;

import com.sboot.api.sales.sboot.adapters.out.client.FindSaleByProductCodeClient;
import com.sboot.api.sales.sboot.adapters.out.client.mapper.ProductResponseMapper;
import com.sboot.api.sales.sboot.application.core.domain.Product;
import com.sboot.api.sales.sboot.application.ports.out.FindSaleByProductCodeOutpurPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindSaleByProductCodeAdapter implements FindSaleByProductCodeOutpurPort {

    @Autowired
    private FindSaleByProductCodeClient findSaleByProductCodeClient;

    @Autowired
    private ProductResponseMapper productResponseMapper;
    @Override
    public Product find(String productCode) {

        var productResponse = findSaleByProductCodeClient.find(productCode);
        return productResponseMapper.toProductResponse(productResponse);
    }
}
