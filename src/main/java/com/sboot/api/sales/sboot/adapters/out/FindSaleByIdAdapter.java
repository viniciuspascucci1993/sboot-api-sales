package com.sboot.api.sales.sboot.adapters.out;

import com.sboot.api.sales.sboot.adapters.out.repository.SaleRepository;
import com.sboot.api.sales.sboot.adapters.out.repository.mapper.SaleEntityMapper;
import com.sboot.api.sales.sboot.application.core.domain.Sale;
import com.sboot.api.sales.sboot.application.ports.out.FindSaleByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindSaleByIdAdapter implements FindSaleByIdOutputPort {

    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private SaleEntityMapper saleEntityMapper;

    @Override
    public Optional<Sale> find(String id) {
        var saleEntity = saleRepository.findById(id);
        return saleEntity.map(entity -> saleEntityMapper.toSale(entity));
    }
}
