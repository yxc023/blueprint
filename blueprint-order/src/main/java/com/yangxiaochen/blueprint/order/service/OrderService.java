package com.yangxiaochen.blueprint.order.service;

import com.yangxiaochen.blueprint.order.domain.domain.OrderDomain;

public interface OrderService {
    Long createOrder(OrderDomain orderDomain);
}
