
package com.bbwebhook.models;

import java.io.Serializable;

public class FromRef implements Serializable
{

    private Repository repository;
    private Commit commit;
    private Branch branch;
    private final static long serialVersionUID = 1388890515201687167L;

    public Repository getRepository() {
        return repository;
    }

    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public Commit getCommit() {
        return commit;
    }

    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

}
