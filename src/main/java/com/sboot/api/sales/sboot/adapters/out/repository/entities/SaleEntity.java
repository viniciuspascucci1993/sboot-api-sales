package com.sboot.api.sales.sboot.adapters.out.repository.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "sales")
public class SaleEntity {

    @Id
    private String id;
    private Long saleCode;

    private ProductEntity productEntity;

    private boolean isValidSale;
}
