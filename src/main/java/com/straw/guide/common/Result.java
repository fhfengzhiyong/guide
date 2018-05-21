package com.straw.guide.common;

import java.util.List;

/**
 * @author straw(fengzy)
 * @description
 * @date {DATE}
 */
public class Result {
    private long count;
    private int code;
    private String msg;
    private List<Object> data;

    public static Result success(Page page) {
        Result result = new Result();
        result.setCode(0);
        result.setCount(page.getTotal());
        result.setData(page.getList());
        return result;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
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
