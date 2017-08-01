package com.company;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by Alex on 7/31/17.
 *
 *
 */


public class Commit implements Serializable {

    private final String sha;
    private final String parent;
    private final String message;
    private Date commitDate = new Date();

    /* Mapping of filename to sha1 of blob */
    private HashMap<String, String> contents = new HashMap<>();

    public Commit(String parentId, String msg) {
        parent = parentId;
        message = msg;
        sha = Utils.sha1(parent, message, commitDate.toString());
    }

    public String toString() {
        return "commit " + sha;
    }

    /* Write to repo */
    // void finalize();


    public String getParent() {
        return parent;
    }

    public String getMessage() {
        return message;
    }

    public Date getCommitDate() {
        return commitDate;
    }

    public HashMap<String, String> getContents() {
        return contents;
    }

}
