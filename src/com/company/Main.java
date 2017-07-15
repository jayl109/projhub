package com.company;

public class Main {

    public static void main(String[] args) {
        if (args.length <= 0) {
            // Error
            System.out.println("Usage message");
        } else {
            parseArgs(args);
        }
    }

    private static void parseArgs(String[] args) {
        String cmd = (args.length >= 1) ? args[0] : null;
        String cmdarg1 = (args.length >= 2) ? args[1] : null;
        String cmdarg2 = (args.length >= 3) ? args[2] : null;

        switch (cmd) {
            case "init":
                // init
                System.out.println("Command is 'init' ");
                break;
            default:
                // Command doesn't exist
                System.out.println("Command doesn't exist");
        }
    }
}
