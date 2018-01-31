
package com.bbwebhook.models.v2;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ToRef implements Serializable
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
    private Repository_ repository;
    private final static long serialVersionUID = 4608988306677006139L;

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

    public Repository_ getRepository() {
        return repository;
    }

    public void setRepository(Repository_ repository) {
        this.repository = repository;
    }

}
