package com.sboot.api.sales.sboot.adapters.out.repository;

import com.sboot.api.sales.sboot.adapters.out.repository.entities.SaleEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SaleRepository extends MongoRepository<SaleEntity, Long> {
}
