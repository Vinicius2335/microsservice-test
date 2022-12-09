package com.viniciusvieira.orderservice.domain.service;

import com.viniciusvieira.orderservice.api.mapper.OrderMapper;
import com.viniciusvieira.orderservice.api.representation.model.request.OrderRequest;
import com.viniciusvieira.orderservice.api.representation.model.response.OrderResponse;
import com.viniciusvieira.orderservice.domain.model.Order;
import com.viniciusvieira.orderservice.domain.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    public void placeOrder(OrderRequest orderRequest){
        Order order = orderMapper.toDomainOrder(orderRequest);
        order.setOrderNumber(UUID.randomUUID().toString());

        orderRepository.save(order);
    }

    public List<OrderResponse> getAllOrders() {
        List<Order> orders = orderRepository.findAll();
        return orderMapper.toOrderResponseList(orders);
    }
}
