package com.sboot.api.sales.sboot.adapters.out.client.mapper;

import com.sboot.api.sales.sboot.adapters.out.client.response.ProductResponse;
import com.sboot.api.sales.sboot.application.core.domain.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductResponseMapper {

    Product toProductResponse(ProductResponse produceResponse);
}
