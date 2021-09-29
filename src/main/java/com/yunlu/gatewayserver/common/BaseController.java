package com.yunlu.gatewayserver.common;

/**
 * TODO //
 *
 * <p> Title: BaseController </p>
 * <p> Description: BaseController </p>
 * <p> History: 2020/9/4 23:02 </p>
 * <pre>
 *      Copyright: Create by FQ, ltd. Copyright(©) 2020.
 * </pre>
 * Author  FQ
 * Version 0.0.1.RELEASE
 */
public class BaseController {

    public BaseController() {
    }

    public ResultEntity success() {
        return new ResultEntity(ResultCode.RESULT_SUCCESS.getCode(), ResultCode.RESULT_SUCCESS.getMsg(), null);
    }

    public <T> ResultEntity<T> success(T data) {
        return new ResultEntity(ResultCode.RESULT_SUCCESS.getCode(), ResultCode.RESULT_SUCCESS.getMsg(), data);
    }

    public <T> ResultEntity<T> success(String msg) {
        return new ResultEntity(ResultCode.RESULT_SUCCESS.getCode(), msg, null);
    }

    public <T> ResultEntity<T> success(String msg, T data) {
        return new ResultEntity(ResultCode.RESULT_SUCCESS.getCode(), msg, data);
    }

    public <T> ResultEntity<T> fail() {
        return new ResultEntity(ResultCode.RESULT_FAIL.getCode(), ResultCode.RESULT_FAIL.getMsg(), null);
    }

    public <T> ResultEntity<T> fail(String msg) {
        return new ResultEntity(ResultCode.RESULT_FAIL.getCode(), msg, null);
    }

    public <T> ResultEntity<T> hint(String msg) {
        return new ResultEntity(ResultCode.RESULT_HINT.getCode(), msg, null);
    }

    public <T> ResultEntity<T> error(String msg) {
        return new ResultEntity(ResultCode.RESULT_ERROR.getCode(), msg, null);
    }

    public <T> ResultEntity<T> warning(String msg) {
        return new ResultEntity(ResultCode.RESULT_WARNING.getCode(), msg, null);
    }

}
