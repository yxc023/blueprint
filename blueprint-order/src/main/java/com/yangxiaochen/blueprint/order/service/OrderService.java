package com.yangxiaochen.blueprint.order.service;

import com.yangxiaochen.blueprint.order.service.exception.OrderException;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public Long createOrder() {
        throw new OrderException("No permission to buy this goods").code(OrderException.Codes.NO_BUY_PERMISSION)
                .tip("你没有购买该商品的权限")
                .serviceLevel();
    }
}
