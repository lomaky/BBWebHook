
package com.bbwebhook.models;

import java.io.Serializable;

public class Commit implements Serializable
{

    private Object message;
    private Object date;
    private String hash;
    private Integer authorTimestamp;
    private final static long serialVersionUID = -6511818048648413971L;

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public Integer getAuthorTimestamp() {
        return authorTimestamp;
    }

    public void setAuthorTimestamp(Integer authorTimestamp) {
        this.authorTimestamp = authorTimestamp;
    }

}
