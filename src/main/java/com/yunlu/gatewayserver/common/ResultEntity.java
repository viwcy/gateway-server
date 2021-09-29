package com.yunlu.gatewayserver.common;


import org.apache.commons.lang3.time.FastDateFormat;

/**
 * TODO //
 *
 * <p> Title: ResultEntity </p>
 * <p> Description: ResultEntity </p>
 * <p> History: 2020/9/4 23:02 </p>
 * <pre>
 *      Copyright: Create by FQ, ltd. Copyright(©) 2020.
 * </pre>
 * Author  FQ
 * Version 0.0.1.RELEASE
 */
public class ResultEntity<T> {

    private static final FastDateFormat FAST_DATE_FORMAT = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");

    private long timestamp = System.currentTimeMillis();
    private String date = FAST_DATE_FORMAT.format(timestamp);
    private int code;
    private String msg;
    private T data;

    public ResultEntity() {
    }

    public ResultEntity(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static <T> ResultEntity<T> success() {
        return new ResultEntity(ResultCode.RESULT_SUCCESS.getCode(), ResultCode.RESULT_SUCCESS.getMsg(), null);
    }

    public static <T> ResultEntity<T> success(T data) {
        return new ResultEntity(ResultCode.RESULT_SUCCESS.getCode(), ResultCode.RESULT_SUCCESS.getMsg(), data);
    }

    public static <T> ResultEntity<T> success(String msg) {
        return new ResultEntity(ResultCode.RESULT_SUCCESS.getCode(), msg, null);
    }

    public static <T> ResultEntity<T> success(String msg, T data) {
        return new ResultEntity(ResultCode.RESULT_SUCCESS.getCode(), msg, data);
    }

    public static <T> ResultEntity<T> fail(String msg) {
        return new ResultEntity(ResultCode.RESULT_FAIL.getCode(), msg, null);
    }

    public static <T> ResultEntity<T> hint(String msg) {
        return new ResultEntity(ResultCode.RESULT_HINT.getCode(), msg, null);
    }

    public static <T> ResultEntity<T> error(String msg) {
        return new ResultEntity(ResultCode.RESULT_ERROR.getCode(), msg, null);
    }

    public static <T> ResultEntity<T> warning(String msg) {
        return new ResultEntity(ResultCode.RESULT_WARNING.getCode(), msg, null);
    }
}
