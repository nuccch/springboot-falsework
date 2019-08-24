package org.chench.springboot.falsework.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

import java.util.Date;

/**
 * 使用Spring的STOMP实现WebSocket推送
 * @author chench9@lenovo.com
 * @desc org.chench.springboot.falsework.controller.StompController
 * @date 5/28/19 3:54 PM
 */
@Controller
public class StompController {

    @MessageMapping("/greeting")
    public String greeting(String greeting) {
        return "[" + new Date() + "]: " + greeting;
    }
}
