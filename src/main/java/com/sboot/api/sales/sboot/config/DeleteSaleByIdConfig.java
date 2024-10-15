package com.sboot.api.sales.sboot.config;

import com.sboot.api.sales.sboot.adapters.out.DeleteSaleByIdAdapter;
import com.sboot.api.sales.sboot.application.core.usecase.DeleteSaLeByIdUseCase;
import com.sboot.api.sales.sboot.application.ports.out.DeleteSaleByIdOutputPort;
import com.sboot.api.sales.sboot.application.ports.out.FindSaleByIdOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteSaleByIdConfig {

    @Bean
    public DeleteSaLeByIdUseCase deleteSaLeByIdUseCase(
            FindSaleByIdOutputPort findSaleByIdOutputPort,
            DeleteSaleByIdAdapter deleteSaleByIdAdapter
    ) {
        return new DeleteSaLeByIdUseCase(findSaleByIdOutputPort, deleteSaleByIdAdapter);
    }
}
