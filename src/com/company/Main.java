package com.company;
import java.io.*;
public class Main {


    private static final String EXIT   = "exit";
    private static final String PROMPT = "> ";




    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ProjHub projhub = new ProjHub();
        Database database = new Database(null);
        database.serialize();
        System.out.println("tried to serialize");

        projhub.tryload();
        System.out.print(PROMPT);
        String line = "";
        while ((line = in.readLine()) != null) {
            if (EXIT.equals(line)) {
                break;
            }

            if (!line.trim().isEmpty()) {
                String result = projhub.execute(line, database);
                if (result.length() > 0) {
                    System.out.println(result);
                }
            }
            System.out.print(PROMPT);
        }

        in.close();
    }

    /*private static void parseArgs(String[] args) {
        String cmd = (args.length >= 1) ? args[0] : null;
        String cmdarg1 = (args.length >= 2) ? args[1] : null;
        String cmdarg2 = (args.length >= 3) ? args[2] : null;

        switch (cmd) {
            case "init":
                // init
                // calls some init function that makes folders
                System.out.println("Command is 'init'");
                ProjHub.init();
                break;
            case "add":
                System.out.println("Command is 'add'");
                break;
            case "commit":
                System.out.println("Command is 'commit'");
                break;
            case "pull":
                System.out.println("Command is 'pull'");
                break;
            case "push":
                System.out.println("Command is 'push'");
                break;
            case "clone":
                System.out.println("Command is 'clone'");
                break;
            default:
                // Command doesn't exist
                System.out.println("Command doesn't exist");
        }
    }*/
}
