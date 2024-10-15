package com.sboot.api.sales.sboot.adapters.out;

import com.sboot.api.sales.sboot.adapters.out.repository.SaleRepository;
import com.sboot.api.sales.sboot.adapters.out.repository.mapper.SaleEntityMapper;
import com.sboot.api.sales.sboot.application.core.domain.Sale;
import com.sboot.api.sales.sboot.application.ports.out.UpdateSaleOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateSaleAdapter implements UpdateSaleOutputPort {

    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private SaleEntityMapper saleEntityMapper;

    @Override
    public void update(Sale sale) {
        var saleEntity = saleEntityMapper.toSaleEntity(sale);
        saleRepository.save(saleEntity);
    }
}
