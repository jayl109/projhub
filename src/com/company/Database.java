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
        test = 10;
        head = h;
        stage = new Stage();
    }
    public void add (String command) {
        return;
    }
    public static Database deserialize(){
        Database db=null ;
        try
        {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/database.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            db = (Database)ois.readObject();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace(); }
        return db;
    }

    public void serialize(){
        try
        {
            System.out.println(System.getProperty("user.dir"));
            FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir")+"/database.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this);
            oos.close();
            //fos.close();
        }
        catch (Exception e)
        { e. printStackTrace(); }
    }

}
