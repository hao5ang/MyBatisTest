package com.gmail.waohao.model;

import java.io.Serializable;

public class Demo extends DemoKey implements Serializable {
    private String remark;

    private static final long serialVersionUID = 1L;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}