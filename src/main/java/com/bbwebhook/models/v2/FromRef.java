
package com.bbwebhook.models.v2;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FromRef implements Serializable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("displayId")
    @Expose
    private String displayId;
    @SerializedName("latestCommit")
    @Expose
    private String latestCommit;
    @SerializedName("repository")
    @Expose
    private Repository repository;
    private final static long serialVersionUID = -3111127049453788906L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplayId() {
        return displayId;
    }

    public void setDisplayId(String displayId) {
        this.displayId = displayId;
    }

    public String getLatestCommit() {
        return latestCommit;
    }

    public void setLatestCommit(String latestCommit) {
        this.latestCommit = latestCommit;
    }

    public Repository getRepository() {
        return repository;
    }

    public void setRepository(Repository repository) {
        this.repository = repository;
    }

}
