//Name: Trevor Klar
//Date: 12-1-18
//Application: FacebookLite
//Purpose: A collection of useful static methods. Note that Util.print() also calls writeLog(), so that devs can read the
//         log of recent inputs.

import java.io.*;
import java.util.Scanner;

public class Util {

    public static boolean isCommented(String str) {
        try { return (str.charAt(0)=='/' && str.charAt(1)=='/'); }
        catch (StringIndexOutOfBoundsException e) { return false; }
    }

    public static String[] readFile(String filename) {
      boolean skipCommented = true; //By default, skips any lines that begin with "//".
      String wholefile ="";
      String nextLine;
      final String[] NONE = {};
      String[] arr;
      try {
        Scanner sc = new Scanner( new File(filename) );
      	while (sc.hasNextLine()) {
          nextLine = sc.nextLine();
          if (!(isCommented(nextLine) && skipCommented)) {
              wholefile += nextLine+"\n";
          }
      	}
        arr = wholefile.split("\n");
      }
      catch (IOException e) {
          System.out.println(e);
          arr = NONE;
      }
      return arr;
    }

    public static void print(String s) {
        System.out.println(s);
        writeLog(s);
    }
    public static void print() {
        System.out.println("");
        writeLog("");
    }
    public static void clearScreen() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
            else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        }
        catch (final Exception e) { System.out.println(e); }
    }
    public static void iddqd() {
        print("GodMode enabled!\n"); //https://bit.ly/2B23NFv
    }
    public static void writeLog(String s){
        try {
            PrintStream writer = new PrintStream( new FileOutputStream("FacebookLite.log", true));
            writer.append(s);
            writer.append("\n");
            //writer.flush();
            writer.close();
        }
        catch (IOException e) { System.out.println(e); }
    }
    public static void reset(String[] s) {
        for(int i=0; i<s.length; i++) {
            s[i] = "";
        }
    }
    public static void print(String[] s) {
        for(int i=0; i<s.length; i++) {
            System.out.println(s[i]);
            writeLog(s[i]);
        }
    }
}
