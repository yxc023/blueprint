package com.yangxiaochen.blueprint.trade;

import com.yangxiaochen.blueprint.inventory.InventoryFacade;
import com.yangxiaochen.blueprint.order.OrderDomainFactory;
import com.yangxiaochen.blueprint.order.OrderFacade;
import com.yangxiaochen.blueprint.order.domain.domain.CreatingOrderDomain;

public class TradeFacade {

    OrderFacade orderFacade;
    InventoryFacade inventoryFacade;
    OrderDomainFactory orderDomainFactory;

    public void createTrade(String params) {
        CreatingOrderDomain creatingOrderDomain = orderDomainFactory.getCreatingOrderDomain(params);
        creatingOrderDomain.create();
        inventoryFacade.adjustInventory(1L, 1, "reduce", "createTrade");
    }
}
