package org.chench.springboot.falsework.controller;

import org.chench.springboot.falsework.model.JsonResp;
import org.chench.springboot.falsework.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author chench9@lenovo.com
 * @desc org.chench.springboot.falsework.controller.KafkaContoller
 * @date 8/1/19 6:24 PM
 */
@RestController
@RequestMapping("/kafka")
public class KafkaContoller {
    @Autowired
    private KafkaService kafkaService;

    @GetMapping("/start/consumer/autocommit")
    public Object startAutoCommitConsumer(HttpServletRequest req, HttpServletResponse resp) {
        return JsonResp.httpCode(resp, HttpServletResponse.SC_OK).success();
    }
}
