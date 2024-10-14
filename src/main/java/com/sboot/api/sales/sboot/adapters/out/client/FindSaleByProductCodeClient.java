package com.sboot.api.sales.sboot.adapters.out.client;

import com.sboot.api.sales.sboot.adapters.out.client.response.ProductResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "FindSaleByProductCodeClient",
        url = "${api-sales.client.sales.url}"
)
public interface FindSaleByProductCodeClient {

    @GetMapping("/{productCode}")
    ProductResponse find(@PathVariable("productCode") String productCode);
}
