import java.io.File;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;

/**
 * Created by Jason on 7/15/17.
 */
/*
 */

public class Stage implements Serializable {
    HashSet<File> files;
    String filepath;

    public Stage() {
        filepath = System.getProperty("user.dir")+"/.projhub/staged";
    }

    //add filepaths to staging area
    public boolean add(String[] filepaths) {
        for (String filepath : filepaths) {
            files.add(new File(filepath));
        }
        return true;
    }
    //remove filepaths from staging area;
    public boolean remove(String[] filepaths) {
        for (String filepath : filepaths) {
            files.remove(new File(filepath));
        }
        return true;
    }

    //clears staging area after commit
    public void clear() {
        files = new HashSet<>();
    }

    public HashSet<File> getFiles() {
        return files;
    }
}
