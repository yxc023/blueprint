package com.yangxiaochen.blueprint.order.domain.domain;

import lombok.Data;

@Data
public class CreatingOrderDomain {

    private String params;

    public CreatingOrderDomain(String params) {
        this.params = params;
    }

    public void create() {
        // do something
    }
}
