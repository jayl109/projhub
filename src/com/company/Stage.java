/**
 * Created by Jason on 7/15/17.
 */
/*
 */

public class Stage {
    ArrayList<File> files;
    String filepath;
    public Stage() {
        filepath = = System.getProperty("user.dir")+"/.projhub/staged";
    }
    //add filepaths to staging area
    public boolean add(String[] filepaths) {
        return false;
    }
    //remove filepaths from staging area;
    public boolean remove(String[] filepaths) {
        return false;
    }
    //clears staging area after commit
    public void clear() {
        files = new ArrayList<File>;
    }
}
