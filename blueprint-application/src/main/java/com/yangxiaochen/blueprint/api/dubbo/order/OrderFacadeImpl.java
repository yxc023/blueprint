package com.yangxiaochen.blueprint.api.dubbo.order;

import com.yangxiaochen.blueprint.api.dubbo.ApiException;
import com.yangxiaochen.blueprint.api.dubbo.order.dto.OrderDTO;
import com.yangxiaochen.blueprint.api.dubbo.order.dto.param.OrderCreateParam;
import com.yangxiaochen.blueprint.order.OrderFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderFacadeImpl implements com.yangxiaochen.blueprint.api.dubbo.order.OrderFacade {

    @Autowired
    private OrderFacade orderFacade;

    @Override
    public OrderDTO getByOrderId(Long orderId) {
        OrderDTO orderDTO = new OrderDTO();
        return orderDTO;
    }

    @Override
    public Long createOrder(OrderCreateParam orderCreateParam) throws ApiException {
        return orderFacade.createOrder();
    }
}
