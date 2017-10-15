
package com.bbwebhook.models;

import java.io.Serializable;

public class BBWebHookData implements Serializable
{

    private Pullrequest pullrequest;
    private Repository repository;
    private final static long serialVersionUID = -4822199873726013970L;

    public Pullrequest getPullrequest() {
        return pullrequest;
    }

    public void setPullrequest(Pullrequest pullrequest) {
        this.pullrequest = pullrequest;
    }

    public Repository getRepository() {
        return repository;
    }

    public void setRepository(Repository repository) {
        this.repository = repository;
    }

}
