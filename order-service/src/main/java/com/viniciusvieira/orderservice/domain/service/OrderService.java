package com.viniciusvieira.orderservice.domain.service;

import com.viniciusvieira.orderservice.api.mapper.OrderMapper;
import com.viniciusvieira.orderservice.api.representation.model.request.OrderRequest;
import com.viniciusvieira.orderservice.api.representation.model.response.OrderLineItensResponse;
import com.viniciusvieira.orderservice.domain.model.Order;
import com.viniciusvieira.orderservice.domain.model.OrderLineItens;
import com.viniciusvieira.orderservice.domain.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    public void placeOrder(OrderRequest orderRequest){
        Order order = orderMapper.toDomainOrder(orderRequest);
        order.setOrderNumber(UUID.randomUUID().toString());

        //List<OrderLineItensResponse> orderLineItensResponseList = orderRequest.getOrderLineItensResponseList();
        //List<OrderLineItens> orderLineItens = orderMapper.toOrderLineItensList(orderLineItensResponseList);
        //order.setOrderLineItensList(orderLineItens);
        orderRepository.save(order);
    }
}
