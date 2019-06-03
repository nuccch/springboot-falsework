package org.chench.springboot.falsework.script;

import org.chench.springboot.falsework.model.Instance;

/**
 * 定义脚本方法实现的接口
 * @author chench9@lenovo.com
 * @desc org.chench.springboot.falsework.script.InstanceScriptHandler
 * @date 6/3/19 3:29 PM
 */
public interface InstanceScriptHandler {
    public Object execute(Instance instance);
}
