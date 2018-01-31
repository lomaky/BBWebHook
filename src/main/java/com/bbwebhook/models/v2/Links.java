
package com.bbwebhook.models.v2;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Links implements Serializable
{

    @SerializedName("self")
    @Expose
    private List<Object> self = null;
    private final static long serialVersionUID = -1973285733054356168L;

    public List<Object> getSelf() {
        return self;
    }

    public void setSelf(List<Object> self) {
        this.self = self;
    }

}
