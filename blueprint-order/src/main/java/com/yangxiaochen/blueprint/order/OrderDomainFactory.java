package com.yangxiaochen.blueprint.order;

import com.yangxiaochen.blueprint.order.domain.domain.CreatingOrderDomain;
import com.yangxiaochen.blueprint.order.domain.domain.OrderDomain;
import com.yangxiaochen.blueprint.order.exception.OrderException;
import com.yangxiaochen.blueprint.order.repo.OrderRepository;
import com.yangxiaochen.blueprint.order.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderDomainFactory {

    private OrderService orderService;
    private OrderRepository orderRepository;

    public CreatingOrderDomain getCreatingOrderDomain(String params) {
        return new CreatingOrderDomain(params);
    }

    public OrderDomain getOrderDomain(Long orderId) {
        return new OrderDomain(orderId, orderService, orderRepository);
    }
}
