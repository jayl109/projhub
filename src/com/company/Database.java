package com.company;
import java.io.*;
/**
 * Created by Jason on 7/15/17.
 */

//where we add byte stream blobs
public class Database implements Serializable {
    Commit head;
    Stage stage;
    int test;
    public Database(Commit h){
        test = 9;
        head = h;
        stage = new Stage();
    }
    public void add (String command) {
        return;
    }
    public static Database deserialize(){
        //if database.ser !exists, return null
        //else somehow make it
        return null;
    }
    public void serialize(){
        try
        {
            FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir")+"database.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this);
            oos.close();
            fos.close();
        }
        catch (Exception e)
        { e. printStackTrace(); }
    }

}
