
package com.bbwebhook.models.v2;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BBPREvent implements Serializable
{

    @SerializedName("eventKey")
    @Expose
    private String eventKey;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("actor")
    @Expose
    private Actor actor;
    @SerializedName("pullRequest")
    @Expose
    private PullRequest pullRequest;
    private final static long serialVersionUID = -340829785987155095L;

    public String getEventKey() {
        return eventKey;
    }

    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public PullRequest getPullRequest() {
        return pullRequest;
    }

    public void setPullRequest(PullRequest pullRequest) {
        this.pullRequest = pullRequest;
    }

}
