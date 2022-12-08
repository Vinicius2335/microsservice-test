package com.viniciusvieira.orderservice.api.representation.model.request;

import com.viniciusvieira.orderservice.api.representation.model.response.OrderLineItensResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class OrderRequest {
    private List<OrderLineItensResponse> orderLineItensResponseList;
}
