package com.yangxiaochen.blueprint.inventory;

public interface InventoryFacade {

    void adjustInventory(Long skuId, int count, String type, String context);
}
