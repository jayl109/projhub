package com.company; /**
 * Created by Alex on 7/16/17.
 *
 * projHub object
 */
import java.io.*;

public class projHub {

    public projHub() {
        System.out.println("projHub ctor")
    }

    /*
     * Initializes folders + files
     */
    public static void init() throws IOException {
        if (new File(".projhub").mkdirs()) {
            System.out.println("Make more directories inside .projhub like details of projects, commits, etc.");
        } else {
            System.out.println("ProjHub directory already exists");
        }
    }
}
