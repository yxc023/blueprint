package com.yangxiaochen.blueprint.api.dubbo.order;

import com.yangxiaochen.blueprint.api.dubbo.order.dto.OrderDTO;
import com.yangxiaochen.blueprint.api.dubbo.order.dto.param.OrderCreateParam;
import com.yangxiaochen.blueprint.order.service.exception.OrderException;

public interface OrderFacade {

    /**
     * 获取订单
     * @param orderId
     * @return
     */
    OrderDTO getByOrderId(Long orderId);


    /**
     * 创建订单
     * @param orderCreateParam
     * @return orderId
     * @throws OrderException
     */
    Long createOrder(OrderCreateParam orderCreateParam) throws OrderException;
}
