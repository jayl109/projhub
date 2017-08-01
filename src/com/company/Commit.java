package com.company;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Alex on 7/31/17.
 *
 *
 */


public class Commit implements Serializable {

    private final String parent;
    private final String message;
    private Date commitDate;
    private HashMap<String, String> contents = new HashMap<>();

    public Commit(String parentId, String msg) {
        parent = parentId;
        message = msg;
    }

    public String toString();
    String getParent();
    void finalize();
}
