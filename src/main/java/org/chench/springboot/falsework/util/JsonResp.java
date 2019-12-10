package org.chench.springboot.falsework.util;

import com.alibaba.fastjson.JSONObject;
import org.chench.springboot.falsework.enums.CodeMessage;

/**
 * 返回的json数据格式封装
 * @author chench9@lenovo.com
 * @desc org.chench.springboot.falsework.util.JsonResp
 * @date 5/20/19 9:59 PM
 */
public class JsonResp {
    private int code = 0;           // 业务状态码
    private String message = "";    // 消息描述
    private Object data = null;     // 数据

    public static JsonResp success() {
        return new JsonResp(CodeMessage.SUCCESS, new JSONObject());
    }

    public static JsonResp success(Object data) {
        return new JsonResp(CodeMessage.SUCCESS, data);
    }

    public static JsonResp error() {
        return error(CodeMessage.ERROR, new JSONObject());
    }

    public static JsonResp error(CodeMessage cm) {
        return error(cm, new JSONObject());
    }

    public static JsonResp error(CodeMessage cm, Object data) {
        return new JsonResp(cm, data);
    }

    public JsonResp(CodeMessage cm, Object data) {
        this(cm.getCode(), cm.getMessage(), data);
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

    private JsonResp(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
