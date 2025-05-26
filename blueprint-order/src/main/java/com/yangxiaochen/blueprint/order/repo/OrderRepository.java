package com.yangxiaochen.blueprint.order.repo;

import com.yangxiaochen.blueprint.order.domain.value.OrderItem;
import com.yangxiaochen.blueprint.order.exception.OrderException;
import com.yangxiaochen.exception.core.BaseExprRuntimeException;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository {

    DslContext dslContext;

    public List<OrderItem>  getOrderItems(Long orderId) {
        return dslContext.selectFrom(ORDER_ITEM)
                .where(ORDER_ITEM.ORDER_ID.eq(orderId))
                .fetch()
                .map(record -> {
                    OrderItem orderItem = new OrderItem();
                    orderItem.setGoodsId(record.getGoodsId());
                    orderItem.setGoodsCount(record.getGoodsCount());
                    return orderItem;
                });
    }

    public void updateOrderStatus(Long orderId, Integer expectStatus, Integer newStatus) {
        OrderRecord orderRecord = dslContext.selectFrom(ORDER)
                .where(ORDER.ORDER_ID.eq(orderId))
                .fetchOne();

        if (orderRecord.getStatus() != expectStatus) {
            throw new OrderException("order status is not expected", OrderException.Codes.ORDER_STATUS_NOT_EXPECTED);
        }
        orderRecord.setStatus(newStatus);
        orderRecord.store();

    }

    public Long updateOrderStatus2(Long orderId, Integer expectStatus, Integer newStatus) {
        Integer effectiveRows = dslContext.update(ORDER)
                .set(ORDER.STATUS, newStatus)
                .where(ORDER.ORDER_ID.eq(orderId))
                .and(ORDER.STATUS.eq(expectStatus))
                .execute();
        if (effectiveRows != 1) {
            throw new OrderException("order status is not expected", OrderException.Codes.ORDER_STATUS_NOT_EXPECTED);
        }
        return effectiveRows.longValue();
    }

}
