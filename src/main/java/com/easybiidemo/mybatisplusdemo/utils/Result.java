package com.easybiidemo.mybatisplusdemo.utils;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result<T> implements Serializable {

    private static final long serialVersionUID = -5876274825677709598L;

    private int code;

    private T resultData;

    private String desc;

    private String reqId;

    public static <T> Result<T> fail(int code, String desc, T flag) {
        Result<T> result = new Result<>();
        result.code = code;
        result.desc = desc;
        result.resultData = flag;
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static <T> Result<T> success(T object) {
        Result<T> result = new Result<>();
        result.desc = ReturnCode.SUCCESS.getDesc();
        result.resultData = object;
        result.code = ReturnCode.SUCCESS.getCode();
        return result;
    }

    public static <T> Result<T> fail(ReturnCode returnCode, T flag) {
        return fail(returnCode.getCode(), returnCode.getDesc(), flag);
    }

    public int getCode() {
        return code;
    }

    public String getDesc(){return desc;}

    public void setDesc(String desc){
        this.desc = desc;
    }

    public T getResultData() {
        return resultData;
    }

    public void setResultData(T resultData) {
        this.resultData = resultData;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
