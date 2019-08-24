package org.chench.springboot.falsework.model;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServletResponse;

/**
 * 返回的json数据格式封装
 * @author chench9@lenovo.com
 * @desc org.chench.springboot.falsework.model.JsonResp
 * @date 5/20/19 9:59 PM
 */
public class JsonResp {
    public static final int CODE_SUCCESS = 200;
    public static final int CODE_ERROR = 500;
    public static final String MSG_SUCCESS = "Success";
    public static final String MSG_ERROR = "Server internal error";

    public static JsonResp httpCode(HttpServletResponse resp, int code) {
        resp.setStatus(code);
        JsonResp jsonResp = new JsonResp(code, "",  new JSONObject());
        return jsonResp;
    }

    public JsonResp success(int code, String message, Object data) {
        this.setCode(code);
        this.setMessage(message);
        this.setData(data);
        return this;
    }

    public JsonResp success(String message, Object data) {
        this.setCode(CODE_SUCCESS);
        this.setMessage(message);
        this.setData(data);
        return this;
    }

    public JsonResp success(String message) {
        this.setCode(CODE_SUCCESS);
        this.setMessage(message);
        this.setData(new JSONObject());
        return this;
    }

    public JsonResp success(Object data) {
        this.setCode(CODE_SUCCESS);
        this.setMessage(MSG_SUCCESS);
        this.setData(data);
        return this;
    }

    public JsonResp success() {
        this.setCode(CODE_SUCCESS);
        this.setMessage(MSG_SUCCESS);
        this.setData(new JSONObject());
        return this;
    }

    public JsonResp error(int code, String message, Object data) {
        this.setCode(code);
        this.setMessage(message);
        this.setData(data);
        return this;
    }

    public JsonResp error(String message, Object data) {
        this.setCode(CODE_ERROR);
        this.setMessage(message);
        this.setData(data);
        return this;
    }

    public JsonResp error(String message) {
        this.setCode(CODE_ERROR);
        this.setMessage(message);
        this.setData(new JSONObject());
        return this;
    }

    public JsonResp error(Object data) {
        this.setCode(CODE_ERROR);
        this.setMessage(MSG_ERROR);
        this.setData(data);
        return this;
    }

    public JsonResp error() {
        this.setCode(CODE_ERROR);
        this.setMessage(MSG_ERROR);
        this.setData(new JSONObject());
        return this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    // 业务状态码
    private int code = 0;
    // 消息描述
    private String message = "";
    // 数据
    private Object data = null;

    private JsonResp(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
