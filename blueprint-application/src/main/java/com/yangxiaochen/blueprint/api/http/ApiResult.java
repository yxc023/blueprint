package com.yangxiaochen.blueprint.api.http;

public class ApiResult<T> {

    public final static String SUCCESS_RESULT_CODE = "SUCCESS";

    private String code = SUCCESS_RESULT_CODE;
    private String message = "SUCCESS";
    private T data;

    private ApiResult<T> withData(T data) {
        this.data = data;
        return this;
    }

    public static <T>ApiResult<T> success() {
        return new ApiResult<T>();
    }

    public ApiResult<T> message(String message) {
        this.message = message;
        return this;
    }

    public ApiResult<T> data(T data) {
        this.data = data;
        return this;
    }

}
