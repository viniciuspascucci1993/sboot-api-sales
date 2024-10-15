package com.sboot.api.sales.sboot.config;

import com.sboot.api.sales.sboot.adapters.out.FindSaleByIdAdapter;
import com.sboot.api.sales.sboot.application.core.usecase.FindSaleByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindSaleByIdConfig {

    @Bean
    public FindSaleByIdUseCase findSaleBtIdUseCase(
            FindSaleByIdAdapter findSaleByIdAdapter) {

        return new FindSaleByIdUseCase(findSaleByIdAdapter);
    }
}
