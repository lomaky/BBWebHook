
package com.bbwebhook.models;

import java.io.Serializable;

public class Branch implements Serializable
{

    private String name;
    private String rawNode;
    private final static long serialVersionUID = 8612288587438492019L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRawNode() {
        return rawNode;
    }

    public void setRawNode(String rawNode) {
        this.rawNode = rawNode;
    }

}
