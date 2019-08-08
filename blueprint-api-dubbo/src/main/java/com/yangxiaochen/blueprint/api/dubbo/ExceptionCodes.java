package com.yangxiaochen.blueprint.api.dubbo;

public interface ExceptionCodes {

    interface Common {
        String SUCCESS = "SUCCESS";
        String FAILURE = "FAILURE";
        String REPEATE_REQUEST = "REPEATE_REQUEST";
        String INVALID_ARGS = "INVALID_ARGS";
    }

    interface Order {
        String NO_BUY_PERMISSION = "NO_BUY_PERMISSION";
    }
}
