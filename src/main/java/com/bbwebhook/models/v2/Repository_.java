
package com.bbwebhook.models.v2;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Repository_ implements Serializable
{

    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("scmId")
    @Expose
    private String scmId;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("statusMessage")
    @Expose
    private String statusMessage;
    @SerializedName("forkable")
    @Expose
    private Boolean forkable;
    @SerializedName("project")
    @Expose
    private Project_ project;
    @SerializedName("public")
    @Expose
    private Boolean _public;
    private final static long serialVersionUID = -5916262909952400412L;

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScmId() {
        return scmId;
    }

    public void setScmId(String scmId) {
        this.scmId = scmId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public Boolean getForkable() {
        return forkable;
    }

    public void setForkable(Boolean forkable) {
        this.forkable = forkable;
    }

    public Project_ getProject() {
        return project;
    }

    public void setProject(Project_ project) {
        this.project = project;
    }

    public Boolean getPublic() {
        return _public;
    }

    public void setPublic(Boolean _public) {
        this._public = _public;
    }

}
