
package com.bbwebhook.models;

import java.io.Serializable;

public class Owner implements Serializable
{

    private String username;
    private String displayName;
    private final static long serialVersionUID = -3570075858690306566L;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

}
