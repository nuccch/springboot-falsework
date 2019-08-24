package org.chench.springboot.falsework.controller;

import com.alibaba.fastjson.JSONArray;
import org.chench.springboot.falsework.model.JsonResp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;

/**
 * @author chench9@lenovo.com
 * @desc org.chench.springboot.falsework.controller.JsonRespController
 * @date 5/20/19 9:55 PM
 */
@RestController
@RequestMapping("/json")
public class JsonRespController {

    @GetMapping("/data")
    public Object data(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        DataInputStream dis = new DataInputStream(JsonRespController.class.getClassLoader().getResourceAsStream("data.json"));
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int count = -1;
        while((count = dis.read(buffer)) > 0) {
            bos.write(buffer, 0, count);
        }
        dis.close();
        Object obj = JSONArray.parse(new String(bos.toByteArray()));
        return JsonResp.httpCode(resp, HttpServletResponse.SC_OK).success(obj);
    }
}
