package org.chench.springboot.falsework.controller;

import org.chench.springboot.falsework.util.JsonResp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * 模拟在Spring Boot应用触发RuntimeException和OOM,验证是否触发关闭钩子
 * 结论：不会触发关闭钩子
 * @author chench9@lenovo.com
 * @desc org.chench.springboot.falsework.controller.MockController
 * @date 5/22/19 10:44 AM
 */
@RestController
@RequestMapping("/mock")
public class MockController {

    /**
     * 模拟在应用运行过程中抛出RuntimeException,触发在JVM中注册的关闭钩子执行
     * @param req
     * @param resp
     * @return
     */
    @GetMapping("/re")
    public Object re(HttpServletRequest req, HttpServletResponse resp) {
        mockRuntimeException();
        return JsonResp.success();
    }


    @GetMapping("/oom")
    public Object oom(HttpServletRequest req, HttpServletResponse resp) {
        mockOOM();
        return JsonResp.success();
    }


    // 模拟在应用中抛出运行时异常,触发关闭钩子执行
    private void mockRuntimeException() {
        throw new RuntimeException("This is a mock runtime exception.");
    }

    // 模拟在应用中抛出OOM错误,触发关闭钩子执行
    // -Xms10m -Xmx10m
    private void mockOOM() {
        List<Object> list = new ArrayList<Object>();
        for(int i = 0; i < 10000000; i++) {
            list.add(new Object());
        }
    }

}
