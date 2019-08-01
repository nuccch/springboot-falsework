package org.chench.springboot.falsework.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 验证在日志中如何打印异常信息
 * @author chench9@lenovo.com
 * @desc org.chench.springboot.falsework.controller.TestExceptionController
 * @date 6/20/19 5:38 PM
 */
@RestController
public class TestExceptionController {
    private static final Logger logger = LoggerFactory.getLogger(TestExceptionController.class);

    @GetMapping("/ex/test")
    public Object test(HttpServletRequest req, HttpServletResponse resp) {
        try {
            throw new NullPointerException();
        } catch (Exception e) {
            logger.error("error: {}", e.getMessage(), e);
            //e.printStackTrace();
        }
        return "Done.";
    }

}
