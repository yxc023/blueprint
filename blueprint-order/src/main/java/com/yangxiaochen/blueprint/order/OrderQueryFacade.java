package com.yangxiaochen.blueprint.order;

import com.yangxiaochen.blueprint.order.exception.OrderException;
import com.yangxiaochen.blueprint.order.query.OrderVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderQueryFacade {

    DslContext dslContext;

    public List<OrderVo> queryOrderList() {
        return dslContext.selectFrom(ORDER)
                .leftJoin(ORDER_ITEM).on(ORDER.ORDER_ID.eq(ORDER_ITEM.ORDER_ID))
                .leftJoin(PRODUCT).on(ORDER_ITEM.PRODUCT_ID.eq(PRODUCT.PRODUCT_ID))
                .leftJoin(SKU).on(ORDER_ITEM.SKU_ID.eq(SKU.SKU_ID))
                .leftJoin(DISCOUNT).on(ORDER.DISCOUNT_ID.eq(DISCOUNT.DISCOUNT_ID))
                .fetch()
                .map(record -> {
                    OrderVo orderVo = new OrderVo();
                    orderVo.setOrderId(record.get(ORDER.ORDER_ID));
                    orderVo.setOrderNo(record.get(ORDER.ORDER_NO));
                    orderVo.setOrderStatus(record.get(ORDER.ORDER_STATUS));
                    orderVo.setOrderType(record.get(ORDER.ORDER_TYPE));
                    orderVo.setDiscount(new DiscountVo(record.get(DISCOUNT.DISCOUNT_CODE), record.get(DISCOUNT.DISCOUNT_NAME), record.get(DISCOUNT.DISCOUNT_AMOUNT));
                    orderVo.setItems(new OrderItemVo(record.get(PRODUCT.PRODUCT_CODE), record.get(PRODUCT.PRODUCT_NAME), record.get(SKU.SKU_ID), record.get(SKU.SKU_NAME), record.get(SKU.SKU_PROPERTIES), record.get(ORDER_ITEM.COUNT)));
                    return orderVo;
                });

    }
}
