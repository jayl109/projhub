package com.company; /**
 * Created by Alex on 7/16/17.
 *
 * projHub object
 */
import java.io.*;
import org.apache.commons.io.*;

public class projHub {


    public projHub() {
        System.out.println("projHub ctor");
    }
    public void tryload(){
        System.out.println("not yet implemented tryload");
    }

    /*
     * Initializes folders + files
     */
    public static void delete() throws IOException {
        try {
            FileUtils.deleteDirectory(new File(System.getProperty("user.dir") + "/.projhub"));
            System.out.println("success");
        } catch (IOException e) {
            System.out.println("delete failed");
        }
    }
    public static void init() throws IOException {
        String filepath = System.getProperty("user.dir")+"/.projhub";
        if (new File(filepath).mkdir()) {
            System.out.println("Initialized hub");
        } else {
            System.out.println("ProjHub directory already exists");
        }
    }
    public static String execute(String line, Database d) throws IOException {
        if (line.equals("projhub init")) {
            try {
                init();
                return "Initialized";
            } catch (IOException e) {
                return ("An error occurred. Maybe its already initialized?");
            }
        }

        else if (line.equals("projhub delete")) {
            delete();

        } else if (line.contains("projhub add")) {
            d.add(line);
        }

        return ("should never get here");
    }


}
