package com.viniciusvieira.orderservice.api.mapper;

import com.viniciusvieira.orderservice.api.representation.model.request.OrderRequest;
import com.viniciusvieira.orderservice.api.representation.model.response.OrderLineItensResponse;
import com.viniciusvieira.orderservice.domain.model.Order;
import com.viniciusvieira.orderservice.domain.model.OrderLineItens;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class OrderMapper {
    private ModelMapper modelMapper;

    public Order toDomainOrder(OrderRequest orderRequest){
        return modelMapper.map(orderRequest, Order.class);
    }

    public OrderLineItens toDomainOrderLineItens(OrderLineItensResponse orderLineItensResponse){
        return modelMapper.map(orderLineItensResponse, OrderLineItens.class);
    }

    public List<OrderLineItens> toOrderLineItensList(List<OrderLineItensResponse> orderLineItensResponses){
       return orderLineItensResponses.stream().map(this::toDomainOrderLineItens).toList();
    }
}
