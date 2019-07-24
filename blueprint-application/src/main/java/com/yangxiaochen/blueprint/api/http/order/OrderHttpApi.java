package com.yangxiaochen.blueprint.api.http.order;


import com.yangxiaochen.blueprint.api.dubbo.order.dto.OrderDTO;
import com.yangxiaochen.blueprint.api.dubbo.order.dto.param.OrderCreateParam;
import com.yangxiaochen.blueprint.api.http.ApiResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
public class OrderHttpApi {

    /**
     * GET /api/order?orderId=1001
     *
     * @param orderId
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ApiResult<OrderDTO> getByOrderId(@RequestParam("orderId") Long orderId) {
        return ApiResult.<OrderDTO>success().data(new OrderDTO());
    }

    /**
     * GET /api/order/1001
     *
     * @param orderId
     * @return
     */
    @RequestMapping(value = "/{orderId}", method = RequestMethod.GET)
    public ApiResult<OrderDTO> getByOrderId2(@PathVariable Long orderId) {
        return getByOrderId(orderId);
    }


    /**
     * POST /api/order/create
     *
     * {orderCreateParamJson...}
     *
     * {@literal
     *
     * code: 1 - 成功
     * code:
     *
     *
     * }
     * @param orderCreateParam
     * @return
     *
     */
    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = "application/json")
    public ApiResult<Long> createOrder(@RequestBody OrderCreateParam orderCreateParam) {
        // do create
        return ApiResult.<Long>success().data(1L);
    }

}
