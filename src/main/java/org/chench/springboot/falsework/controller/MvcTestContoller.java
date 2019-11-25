package org.chench.springboot.falsework.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/mvctest")
public class MvcTestContoller {

    @GetMapping("/action")
    public Object action(HttpServletRequest req, HttpServletResponse resp) {
        return "Test is ok";
    }
}
