package com.company;

import java.io.Serializable;
import java.util.HashSet;

public class StagingArea implements Serializable {
    static HashSet<String> stagedFiles = new HashSet<>();

    static void addFile(String filename) {
        stagedFiles.add(filename);
    }

    static void removeFile(String filename) {
        stagedFiles.remove(filename);
    }
}
