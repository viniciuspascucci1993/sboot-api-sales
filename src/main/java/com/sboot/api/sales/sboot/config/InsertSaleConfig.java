package com.sboot.api.sales.sboot.config;

import com.sboot.api.sales.sboot.adapters.out.FindSaleByProductCodeAdapter;
import com.sboot.api.sales.sboot.adapters.out.InsertSaleAdapter;
import com.sboot.api.sales.sboot.application.core.usecase.InsertSaleUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertSaleConfig {

    @Bean
    public InsertSaleUseCase insertSaleUseCase(
            FindSaleByProductCodeAdapter findSaleByProductCodeAdapter,
            InsertSaleAdapter insertSaleAdapter) {

        return new InsertSaleUseCase(findSaleByProductCodeAdapter, insertSaleAdapter);
    }
}
