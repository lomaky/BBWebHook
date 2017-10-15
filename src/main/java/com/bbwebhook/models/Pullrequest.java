
package com.bbwebhook.models;

import java.io.Serializable;

public class Pullrequest implements Serializable
{

    private String id;
    private String title;
    private String link;
    private String authorLogin;
    private FromRef fromRef;
    private ToRef toRef;
    private final static long serialVersionUID = -6396118264956679823L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getAuthorLogin() {
        return authorLogin;
    }

    public void setAuthorLogin(String authorLogin) {
        this.authorLogin = authorLogin;
    }

    public FromRef getFromRef() {
        return fromRef;
    }

    public void setFromRef(FromRef fromRef) {
        this.fromRef = fromRef;
    }

    public ToRef getToRef() {
        return toRef;
    }

    public void setToRef(ToRef toRef) {
        this.toRef = toRef;
    }

}
