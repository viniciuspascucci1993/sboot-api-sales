package com.sboot.api.sales.sboot.adapters.in.controller;

import com.sboot.api.sales.sboot.adapters.in.controller.mapper.SaleMapper;
import com.sboot.api.sales.sboot.adapters.in.controller.request.SaleRequest;
import com.sboot.api.sales.sboot.application.ports.in.InsertSaleInputPort;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/sales")
public class SaleController {

    @Autowired
    private InsertSaleInputPort insertSaleInputPort;

    @Autowired
    private SaleMapper saleMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody SaleRequest saleRequest) {
        var sale = saleMapper.toSale(saleRequest);
        insertSaleInputPort.insert(sale, String.valueOf(saleRequest.getProductCode()));
        return ResponseEntity.ok().build();
    }
}
