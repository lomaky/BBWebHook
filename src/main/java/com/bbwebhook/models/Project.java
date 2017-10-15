
package com.bbwebhook.models;

import java.io.Serializable;

public class Project implements Serializable
{

    private String key;
    private String name;
    private final static long serialVersionUID = -8948606628810918008L;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
