package com.sboot.api.sales.sboot.application.core.domain;

public class Sale {

    private String id;
    private Long saleCode;
    private Product product;

    private boolean isValidSale;

    public Sale() {
        this.isValidSale = false;
    }

    public Sale(String id, Long saleCode, Product product, boolean isValidSale) {
        this.id = id;
        this.saleCode = saleCode;
        this.product = product;
        this.isValidSale = isValidSale;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getSaleCode() {
        return saleCode;
    }

    public void setSaleCode(Long saleCode) {
        this.saleCode = saleCode;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public boolean isValidSale() {
        return isValidSale;
    }

    public void setValidSale(boolean validSale) {
        isValidSale = validSale;
    }
}
