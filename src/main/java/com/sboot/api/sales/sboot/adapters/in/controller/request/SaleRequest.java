package com.sboot.api.sales.sboot.adapters.in.controller.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class SaleRequest {

    @NotNull
    private Long salesCode;
    @NotBlank
    private String ownerName;
    @NotBlank
    private String supplier;

    private Long productCode;
}
