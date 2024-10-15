package com.sboot.api.sales.sboot.adapters.out.repository.mapper;

import com.sboot.api.sales.sboot.adapters.out.repository.entities.SaleEntity;
import com.sboot.api.sales.sboot.application.core.domain.Sale;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SaleEntityMapper {

    SaleEntity toSaleEntity(Sale sale);
}
