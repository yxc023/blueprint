package com.yangxiaochen.blueprint.order.domain.value;

import lombok.Data;

@Data
public class OrderItem {
    private Long goodsId;
    private Integer goodsCount;
}
