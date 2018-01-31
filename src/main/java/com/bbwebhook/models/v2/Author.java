
package com.bbwebhook.models.v2;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Author implements Serializable
{

    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("role")
    @Expose
    private String role;
    @SerializedName("approved")
    @Expose
    private Boolean approved;
    @SerializedName("status")
    @Expose
    private String status;
    private final static long serialVersionUID = 6625857637893965380L;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
