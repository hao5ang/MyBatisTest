package com.gmail.waohao.model;

import java.io.Serializable;

public class DemoKey implements Serializable {
    private Long id;

    private Short type;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }
}