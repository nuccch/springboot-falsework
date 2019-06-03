package org.chench.springboot.falsework.model;

/**
 * 实例属性
 * @author chench9@lenovo.com
 * @desc org.chench.springboot.falsework.model.InstanceAttribute
 * @date 6/3/19 3:30 PM
 */
public class InstanceAttribute {
    private String name = "";
    private Object value = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
