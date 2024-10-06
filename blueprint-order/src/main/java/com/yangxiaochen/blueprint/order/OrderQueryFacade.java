package com.yangxiaochen.blueprint.order;

import com.yangxiaochen.blueprint.order.exception.OrderException;
import org.springframework.stereotype.Service;

@Service
public class OrderQueryFacade {

    public Long createOrder() {
        throw new OrderException("No permission to buy this goods").code(OrderException.Codes.NO_BUY_PERMISSION)
                .tip("你没有购买该商品的权限")
                .serviceLevel();
    }
}
