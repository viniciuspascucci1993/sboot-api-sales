package com.sboot.api.sales.sboot.adapters.in.controller.mapper;

import com.sboot.api.sales.sboot.adapters.in.controller.request.SaleRequest;
import com.sboot.api.sales.sboot.application.core.domain.Sale;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SaleMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "product", ignore = true)
    @Mapping(target = "isValidSale", ignore = true)
    Sale toSale(SaleRequest saleRequest);
}
