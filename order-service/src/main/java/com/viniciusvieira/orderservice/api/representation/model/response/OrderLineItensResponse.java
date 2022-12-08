package com.viniciusvieira.orderservice.api.representation.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class OrderLineItensResponse {
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}
