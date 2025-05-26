package com.yangxiaochen.blueprint.order.query;

import lombok.Data;

import java.util.List;

@Data
public class OrderVo {
    private Long orderId;
    private String orderNo;
    private String orderStatus;
    private String orderType;
    private List<OrderItemVo> items;

    private DiscountVo discount;


    @Data
    public static class OrderItemVo {
        private String productCode;
        private String productName;

        private Long skuId;
        private String skuName;
        private List<String> skuProperties;
        private int count;
    }

    @Data
    public static class DiscountVo {
        private String discountCode;
        private String discountName;
        private int discountAmount;
    }

}
