
package com.bbwebhook.models;

import java.io.Serializable;

public class Repository implements Serializable
{

    private String scmId;
    private Project project;
    private String slug;
    private Boolean _public;
    private Owner owner;
    private String fullName;
    private String ownerName;
    private final static long serialVersionUID = -5027921483046093120L;

    public String getScmId() {
        return scmId;
    }

    public void setScmId(String scmId) {
        this.scmId = scmId;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Boolean getPublic() {
        return _public;
    }

    public void setPublic(Boolean _public) {
        this._public = _public;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

}
