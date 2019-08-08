package com.yangxiaochen.blueprint.api.dubbo.order;

import com.yangxiaochen.blueprint.api.dubbo.ApiException;
import com.yangxiaochen.blueprint.api.dubbo.order.dto.OrderDTO;
import com.yangxiaochen.blueprint.api.dubbo.order.dto.param.OrderCreateParam;
import com.yangxiaochen.blueprint.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderFacadeImpl implements OrderFacade {

    @Autowired
    private OrderService orderService;

    @Override
    public OrderDTO getByOrderId(Long orderId) {
        OrderDTO orderDTO = new OrderDTO();
        return orderDTO;
    }

    @Override
    public Long createOrder(OrderCreateParam orderCreateParam) throws ApiException {
        return orderService.createOrder();
    }
}
