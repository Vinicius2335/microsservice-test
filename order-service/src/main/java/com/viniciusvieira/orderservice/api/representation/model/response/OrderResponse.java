package com.viniciusvieira.orderservice.api.representation.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class OrderResponse {
    private String orderNumber;
    private List<OrderLineItensResponse> orderLineItensResponseList;
}
