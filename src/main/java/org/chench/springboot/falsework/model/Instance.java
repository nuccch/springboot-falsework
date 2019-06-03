package org.chench.springboot.falsework.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 实例
 * @author chench9@lenovo.com
 * @desc org.chench.springboot.falsework.model.Instance
 * @date 6/3/19 3:29 PM
 */
public class Instance {
    private String name = "";
    private List<InstanceAttribute> attributeList = null;

    public Instance(){}

    public Instance(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<InstanceAttribute> getAttributeList() {
        return attributeList;
    }

    public void setAttributeList(List<InstanceAttribute> attributeList) {
        this.attributeList = attributeList;
    }

    public void addAttribute(InstanceAttribute attribute) {
        if(this.attributeList == null) {
            this.attributeList = new ArrayList<InstanceAttribute>();
        }
        this.attributeList.add(attribute);
    }
}
