package com.sboot.api.sales.sboot.adapters.in.controller;

import com.sboot.api.sales.sboot.adapters.in.controller.mapper.SaleMapper;
import com.sboot.api.sales.sboot.adapters.in.controller.request.SaleRequest;
import com.sboot.api.sales.sboot.adapters.in.controller.response.SaleResponse;
import com.sboot.api.sales.sboot.application.core.domain.Sale;
import com.sboot.api.sales.sboot.application.ports.in.FindSaleByIdInputPort;
import com.sboot.api.sales.sboot.application.ports.in.InsertSaleInputPort;
import com.sboot.api.sales.sboot.application.ports.in.UpdateSaleInputPort;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/sales")
public class SaleController {

    @Autowired
    private InsertSaleInputPort insertSaleInputPort;

    @Autowired
    private FindSaleByIdInputPort findSaleByIdInputPort;

    @Autowired
    private UpdateSaleInputPort updateSaleInputPort;

    @Autowired
    private SaleMapper saleMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody SaleRequest saleRequest) {
        var sale = saleMapper.toSale(saleRequest);
        insertSaleInputPort.insert(sale, String.valueOf(saleRequest.getProductCode()));
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SaleResponse> findById(@PathVariable final String id) {
        var sale = findSaleByIdInputPort.find(id);
        var saleResponse = saleMapper.toSaleResponse(sale);
        return ResponseEntity.ok().body(saleResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable final String id, @Valid @RequestBody SaleRequest saleRequest ) {
        Sale sale = saleMapper.toSale(saleRequest);
        sale.setId(id);
        updateSaleInputPort.update(sale,  saleRequest.getSalesCode());
        return ResponseEntity.noContent().build();
    }
}
