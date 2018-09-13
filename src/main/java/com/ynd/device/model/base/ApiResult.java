package com.ynd.device.model.base;

import java.io.Serializable;

public class ApiResult<T>
        implements Serializable
{
    private int errorCode;
    private String errMsg;
    private long timestamp;
    private T data;

    public static ApiResult success()
    {
        return new ApiResult();
    }

    public static <T> ApiResult<T> success(T data) {
        return new ApiResult().data(data);
    }

    public static ApiResult error(int code, String message) {
        return new ApiResult(code, message);
    }

    public static <T> ApiResult<T> error(int code, String message, T data) {
        return new ApiResult(code, message).data(data);
    }

    public ApiResult()
    {
        this.timestamp = System.currentTimeMillis();
    }

    public ApiResult(int errorCode, String errMsg)
    {
        this.errorCode = errorCode;
        this.errMsg = errMsg;
    }

    public ApiResult(int errorCode)
    {
        this(errorCode, ErrorCode.getMsg(errorCode));
    }

    public ApiResult(ErrorCode errorCode)
    {
        this(errorCode.getErrorCode(), errorCode.getErrorMsg());
    }

    public ApiResult(String define)
    {
        this(ErrorCode.getCode(define), ErrorCode.getMsg(define));
    }

    public void setErrorCodeAndMsg(String define)
    {
        this.errorCode = ErrorCode.getCode(define);
        this.errMsg = ErrorCode.getMsg(define);
    }

    public void setSuccessReturn()
    {
        this.errorCode = 0;
    }

    public int getErrorCode()
    {
        return this.errorCode;
    }

    public void setErrorCode0(int errorCode) {
        this.errorCode = errorCode;
        this.errMsg = ErrorCode.getMsg(errorCode);
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode.getErrorCode();
        this.errMsg = errorCode.getErrorMsg();
    }

    public String getErrMsg()
    {
        return this.errMsg;
    }

    public void setErrMsg(String errMsg)
    {
        this.errMsg = errMsg;
    }

    public T getData() {
        return this.data;
    }

    public ApiResult data(T data) {
        setData(data);
        return this;
    }

    public void setData(T data) {
        this.data = data;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public ApiResult<T> throwIfError() {
        if (this.errorCode != 0) {
            throw new BusinessException(this.errorCode, this.errMsg);
        }
        return this;
    }
}
