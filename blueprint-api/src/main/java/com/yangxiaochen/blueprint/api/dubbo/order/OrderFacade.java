package com.yangxiaochen.blueprint.api.dubbo.order;

import com.yangxiaochen.blueprint.api.dubbo.ApiException;
import com.yangxiaochen.blueprint.api.dubbo.order.dto.OrderDTO;
import com.yangxiaochen.blueprint.api.dubbo.order.dto.param.OrderCreateParam;

/**
 * = 订单相关业务操作 api
 * - 订单相关业务操作 api
 * 
 */
public interface OrderFacade {

    /**
     * = 获取订单
     *
     * - 读接口直接返回数据, 无需额外封装. 读接口不抛业务异常, 有异常就认为 bug.
     *
     * NOTE: 读接口直接返回数据, 无需额外封装. 读接口不抛业务异常, 有异常就认为 bug.
     *
     * .状态码说明
     * |===
     * |返回值|说明
     * |SUCCESS
     * |成功
     *
     * |REPEAT_REQUEST
     * |重复请求
     * |===
     * ----
     * return `null` if `orderId` not found
     * ----
     *
     * @param orderId 订单号
     * @return 订单信息, return `null` if `orderId` not found
     *
     * return `null` if `orderId` not found
     */
    OrderDTO getByOrderId(Long orderId);


    /**
     * 创建订单
     *
     * @param orderCreateParam
     * @return orderId
     * @throws ApiException
     */
    Long createOrder(OrderCreateParam orderCreateParam) throws ApiException;
}
