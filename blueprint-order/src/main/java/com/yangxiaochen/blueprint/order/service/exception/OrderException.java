package com.yangxiaochen.blueprint.order.service.exception;

import com.yangxiaochen.exception.core.BaseExprRuntimeException;

public class OrderException extends BaseExprRuntimeException {

    public OrderException() {
    }

    public OrderException(String message) {
        super(message);
    }

    public OrderException(String message, Throwable cause) {
        super(message, cause);
    }

    public OrderException(Throwable cause) {
        super(cause);
    }

    public OrderException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public static interface Codes {
        String NO_BUY_PERMISSION = "NO_BUY_PERMISSION";
    }
}
