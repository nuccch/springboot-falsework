package org.chench.springboot.falsework.advice;

import org.chench.springboot.falsework.enums.CodeMessage;
import org.chench.springboot.falsework.util.JsonResp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 全局异常处理
 * @author: chench9@lenovo.com
 * @desc: org.chench.springboot.falsework.advice.GlobalExceptionAdvice
 * @date: 2019/12/10 15:04
 */
@ControllerAdvice
public class GlobalExceptionAdvice {
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionAdvice.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Object handleException(HttpServletRequest req, HttpServletResponse resp, Exception ex) {
        logger.error("handle ex: {}", ex.getMessage(), ex);
        return JsonResp.error(CodeMessage.UNKNOWN_ERROR);
    }
}
