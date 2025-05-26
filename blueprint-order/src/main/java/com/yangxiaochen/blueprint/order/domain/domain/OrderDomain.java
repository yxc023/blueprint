package com.yangxiaochen.blueprint.order.domain.domain;

import com.yangxiaochen.blueprint.order.domain.value.OrderItem;
import com.yangxiaochen.blueprint.order.repo.OrderRepository;
import com.yangxiaochen.blueprint.order.service.OrderService;
import lombok.Data;

import java.util.List;

@Data
public class OrderDomain {

    private Long orderId;
    List<OrderItem> orderItems;
    private Integer status;
    private Long createTime;

    private transient OrderService orderService;
    private transient OrderRepository orderRepository;

    public OrderDomain(Long orderId, OrderService orderService, OrderRepository orderRepository) {
        this.orderId = orderId;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public void create() {
        orderService.createOrder(this);
    }

    public List<OrderItem> getOrderItems() {
        if (orderItems == null) {
            orderItems = orderRepository.getOrderItems(orderId);
        }
        return orderItems;
    }
}
