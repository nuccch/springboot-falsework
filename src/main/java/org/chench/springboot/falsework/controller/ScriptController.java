package org.chench.springboot.falsework.controller;

import org.chench.springboot.falsework.model.Instance;
import org.chench.springboot.falsework.script.InstanceScriptHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.script.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 在Java中执行脚本语言
 * @author chench9@lenovo.com
 * @desc org.chench.springboot.falsework.controller.ScriptController
 * @date 6/3/19 2:21 PM
 */
@RestController
@RequestMapping("/script")
public class ScriptController {

    @PostMapping("/execute")
    public Object execute(HttpServletRequest req, HttpServletResponse resp,
                          @RequestParam("scripts") String scripts) {
        try {
            //scripts = URLDecoder.decode(scripts, "UTF-8");
            System.out.println(scripts);
            ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
            // 引入第三方js脚本
            engine.eval(scripts);
            Invocable invocable = (Invocable)engine;
            InstanceScriptHandler handler = invocable.getInterface(InstanceScriptHandler.class);
            Object result = handler.execute(new Instance(" 温度感应器"));
            System.out.println("result: " + result);
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
        } catch (ScriptException e) {
            e.printStackTrace();
        }

        //TODO
        return "success";
    }


}
