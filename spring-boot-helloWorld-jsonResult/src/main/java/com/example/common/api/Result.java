package com.example.common.api;


import java.io.Serializable;

/**
 * Api接口返回数据格式
 * @author lwh
 */

public class Result implements Serializable {

    private static final long serialVersionUID = 4657439332301085202L;

    /**
     * 成功消息
     */
    private static final String successMsg = "操作成功!";

    /**
     * 失败消息
     */
    private static final String errorMsg   = "操作失败!";

    /**
     * 消息
     */
    private String message;

    /**
     * 成功标志
     */
    private boolean success   = true;

    /**
     * 返回状态码
     */
    private Integer code    = 0;

    /**
     * 返回数据对象
     */
    private Object  data;

    /**
     * 系统当前时间戳
     */
    private long timestamps  =System.currentTimeMillis();


    public Result() {
    }

    public static Result success() {
        return Result.success(successMsg);
    }

    public static Result success(Object data) {
        return Result.success(successMsg, data);
    }

    public static Result success(String message) {
        return Result.success(message, null);
    }

    public static Result success(String message, Object data) {
        Result result = new Result();
        result.setCode(200);
        result.setMessage(message);
        result.setData(data);
        return result;
    }

    public static Result error() {
        return Result.error(errorMsg);
    }

    public static Result error(String errorMsg) {
        return Result.error(errorMsg, null);
    }

    public static Result error(Object data) {
        return Result.error(errorMsg, data);
    }

    public static Result error(String errorMsg, Object data) {
        Result result = new Result();
        result.setMessage(errorMsg);
        result.setCode(500);
        result.setSuccess(false);
        result.setData(data);
        return result;
    }


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static String getSuccessMsg() {
        return successMsg;
    }

    public static String getErrorMsg() {
        return errorMsg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public long getTimestamps() {
        return timestamps;
    }

    public void setTimestamps(long timestamps) {
        this.timestamps = timestamps;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
