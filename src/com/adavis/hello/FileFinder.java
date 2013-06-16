package com.adavis.hello;
import java.io.File;

public class FileFinder {

    public static void main(String[] args) {
        Util.print(findFile().toString());
    }

    public static File findFile() {
        String OS = System.getProperty("os.name").toLowerCase().substring(0,3);
        String home;
        Util.print(OS);
        if (OS.equals("win")) {
            home = System.getProperty("java.io.tmpdir");
        } else {
        home = System.getProperty("user.home");
        }
        Util.print("home = " + home);
        File myDir = new File(home);
        return myDir;
    }
}

class Util {
    public static void print(String s) {
        System.out.println(s);
    }
}
