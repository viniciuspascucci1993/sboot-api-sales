package com.sboot.api.sales.sboot.adapters.out;

import com.sboot.api.sales.sboot.application.ports.out.SendSaleForValidationOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class SendSaleValidationAdapter implements SendSaleForValidationOutputPort {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void send(String productCode) {
        kafkaTemplate.send("tp-sboot-api-sales", productCode);
    }
}
