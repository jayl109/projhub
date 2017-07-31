package com.company;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Alex on 7/31/17.
 *
 *
 */

/*
 class Commit implements Serializable:
    // Constructor
    public Commit(String parentId, String message)

    // Fields
    /** The SHA-1 identifier of my parent, or null if I am the initial commit.
    private final String parent;

    /** My log message.
    private final String message;

    /** My timestamp. (java.util.Date)
    private Date commitDate;

    /** A mapping of file names to the SHA-1's of their blobs.
    private HashMap<String, String> contents = new HashMap<>();

    // Methods
    public String toString()

    /** Get SHA-1 identifier of my parent, or null if I am the initial commit.
    String getParent()

    /** Finalize me and write me to my repository.
    void finalize()

    /* Assorted getters and setters for contents and other fields excluded.
    Methods supporting merge also excluded.
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
