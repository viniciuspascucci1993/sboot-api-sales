package com.sboot.api.sales.sboot.config;

import com.sboot.api.sales.sboot.application.core.usecase.FindSaleByIdUseCase;
import com.sboot.api.sales.sboot.application.core.usecase.UpdateSaleUseCase;
import com.sboot.api.sales.sboot.application.ports.out.FindSaleByProductCodeOutpurPort;
import com.sboot.api.sales.sboot.application.ports.out.UpdateSaleOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateSaleConfig {

    @Bean
    public UpdateSaleUseCase updateSaleUseCase(
            FindSaleByIdUseCase findSaleByIdUseCase,
            FindSaleByProductCodeOutpurPort findSaleByProductCodeOutpurPort,
            UpdateSaleOutputPort updateSaleOutputPort
    ) {
        return new UpdateSaleUseCase(findSaleByIdUseCase, findSaleByProductCodeOutpurPort, updateSaleOutputPort);
    }
}
