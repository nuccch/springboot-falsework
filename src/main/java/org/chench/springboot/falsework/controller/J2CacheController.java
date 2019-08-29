package org.chench.springboot.falsework.controller;

import net.oschina.j2cache.CacheChannel;
import net.oschina.j2cache.CacheObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 测试验证j2cache的本地缓存功能
 * @author chench9@lenovo.com
 * @desc org.chench.springboot.falsework.controller.J2CacheController
 * @date 8/29/19 11:48 AM
 */
@RestController
@RequestMapping("/j2cache")
public class J2CacheController {
    @Autowired
    private CacheChannel cacheChannel;

    @GetMapping("/set")
    public Object set(HttpServletRequest req, HttpServletResponse resp) {
        // 验证j2cache的本地缓存功能是否生效
        String region = "default";
        String key = "test_local_key";
        cacheChannel.set(region, key, 20);
        return "success";
    }

    @GetMapping("/get")
    public Object get(HttpServletRequest req, HttpServletResponse resp) {
        String region = "default";
        String key = "test_local_key";

        long start = System.nanoTime();
        CacheObject cacheObject = cacheChannel.get(region, key);
        System.out.println("interval: " + (System.nanoTime() - start) + " ns, cached object: " + cacheObject);

        start = System.nanoTime();
        cacheObject = cacheChannel.get(region, key);
        System.out.println("interval: " + (System.nanoTime() - start) + " ns, cached object: " + cacheObject);
        return "success";
    }

}
