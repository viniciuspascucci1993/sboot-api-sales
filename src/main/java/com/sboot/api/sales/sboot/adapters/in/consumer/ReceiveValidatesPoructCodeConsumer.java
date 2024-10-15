package com.sboot.api.sales.sboot.adapters.in.consumer;

import com.sboot.api.sales.sboot.adapters.in.consumer.mapper.SaleMessagingMapper;
import com.sboot.api.sales.sboot.adapters.in.consumer.message.SaleMessaging;
import com.sboot.api.sales.sboot.application.ports.in.UpdateSaleInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidatesPoructCodeConsumer {

    @Autowired
    private UpdateSaleInputPort updateSaleInputPort;

    @Autowired
    private SaleMessagingMapper saleMessagingMapper;

    @KafkaListener(topics = "tp-sboot-api-sales-validated", groupId = "sboot-api-dales-group-id")
    public void receive(SaleMessaging saleMessaging) {
        var sale = saleMessagingMapper.toSale(saleMessaging);
        updateSaleInputPort.update(sale, saleMessaging.getProductCode());
    }
}
