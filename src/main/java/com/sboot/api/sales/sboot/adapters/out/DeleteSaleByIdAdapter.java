package com.sboot.api.sales.sboot.adapters.out;

import com.sboot.api.sales.sboot.adapters.out.repository.SaleRepository;
import com.sboot.api.sales.sboot.application.ports.out.DeleteSaleByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteSaleByIdAdapter implements DeleteSaleByIdOutputPort {

    @Autowired
    private SaleRepository saleRepository;

    @Override
    public void delete(String id) {
        saleRepository.deleteById(id);
    }
}
