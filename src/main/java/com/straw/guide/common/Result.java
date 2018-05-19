package com.straw.guide.common;

import java.util.List;

/**
 * @author straw(fengzy)
 * @description
 * @date {DATE}
 */
public class Result {
    private int count;
    private int code;
    private String msg;
    private List<Object> data;

    public Result success(int count, List data) {
        Result result = new Result();
        result.setCode(0);
        result.setCount(count);
        result.setData(data);
        return result;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }
}
