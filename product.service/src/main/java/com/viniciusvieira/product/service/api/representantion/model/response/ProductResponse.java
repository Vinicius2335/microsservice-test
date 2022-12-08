package com.viniciusvieira.product.service.api.representantion.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ProductResponse {
    private Long idProduct;
    private String name;
    private String description;
    private BigDecimal price;
}
