package com.sboot.api.sales.sboot.adapters.in.consumer.mapper;

import com.sboot.api.sales.sboot.adapters.in.consumer.message.SaleMessaging;
import com.sboot.api.sales.sboot.application.core.domain.Sale;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SaleMessagingMapper {

    @Mapping(target = "product", ignore = true)
    Sale toSale(SaleMessaging saleMessaging);
}
