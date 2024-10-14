package com.sboot.api.sales.sboot.application.core.domain;

import java.math.BigDecimal;

public class Product {

    private String nameProduct;
    private String description;
    private BigDecimal productPrice;

    public Product() { }

    public Product(String nameProduct, String description, BigDecimal productPrice) {
        this.nameProduct = nameProduct;
        this.description = description;
        this.productPrice = productPrice;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }
}
