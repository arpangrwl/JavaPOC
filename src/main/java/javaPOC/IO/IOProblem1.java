package javaPOC.IO;

import java.io.File;

/**
 * Form a base folder recursively check each folder and print the contect having data as Subject
 */
public class IOProblem1 {

    public static void printFilePathAndContent(File f){

        if(f.getAbsoluteFile().isFile())
            System.out.printf(String.valueOf(f.getAbsoluteFile()));


        //return null;
    }

    public static void main(String[] args) {

    File f = new File("/Users/Arpan/data");

        printFilePathAndContent(f);

    }
}
