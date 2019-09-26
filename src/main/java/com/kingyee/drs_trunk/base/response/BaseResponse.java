package com.kingyee.drs_trunk.base.response;

import java.io.Serializable;

/**
 * 接口消息返回基础类
 */
public class BaseResponse implements Serializable {
    private boolean success;
    private String msg;
    private String error;
    private Object obj;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
