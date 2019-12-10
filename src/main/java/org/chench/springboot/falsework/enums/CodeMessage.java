package org.chench.springboot.falsework.enums;

/*
 * 以枚举方式定义响应错误码
 * @author: chench9@lenovo.com
 * @desc: org.chench.springboot.falsework.enums.CodeMessage
 * @date: 2019/12/10 11:22
 */
public enum CodeMessage {
    // 仿照http状态码定义业务状态码
    // 2000: 请求执行成功
    // 4000-4999: 客户端错误，可以扩展具体的参数错误，如：参数错误，禁止访问等
    // 5000-5999: 服务端错误，可以扩展具体的执行错误，也可以统一使用50000表示服务端错误

    SUCCESS(2000, "Success"),                                   // 成功
    PARAM_ERROR(4000, "Param error"),                           // 参数错误
    UNAUTHORIZED(4001, "Unauthorized"),                         // 未授权
    PAYMENT_REQUIRED(4002, "User name or password error"),      // 用户名或密码错误
    FORBIDDEN(40003, "Forbidden"),                              // 禁止访问
    NOT_FOUND(40004, "Not Found"),                              // 资源未找到
    METHOD_NOT_ALLOWED(4005, "Method Not Allowed"),             // 访问不允许被访问
    INTERNAL_SERVER_ERROR(5000, "Internal Server Error"),       // 服务内部错误
    UNKNOWN_ERROR(5001, "Unknown Error");                       // 未知错误

    private int code = 0;
    private String message = "";

    private CodeMessage(int code, String message) {
        this.code = code;
        this.message = message;
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
}
