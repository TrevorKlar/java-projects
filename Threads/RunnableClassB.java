//This class will sort integers
//constructor to initialize member variables
//run() method
//calls generate()
//calls sort()
//calls write()
//start() method

import java.io.*;
import java.util.Scanner;

class RunnableClassB implements Runnable {
    private String[] strArray;
    Thread t;

    RunnableClassB(){}

    public void read() {
      String wholefile ="";
      System.out.print("reading strs...");
      try {
        Scanner s = new Scanner( new File("dictionary.txt") );
      	while (s.hasNextLine()) {
          wholefile += s.nextLine()+"\n";
      	}
        strArray = wholefile.split("\n");
        System.out.print("\n");
      }
      catch (IOException e) { System.out.println(e); }
    }

    private void sort() {
        System.out.print("sorting strs");
        Algo.sort(strArray);
    }

    private void write() {
        System.out.print("writing strs");
        try {
            PrintStream writer = new PrintStream( new File("outputB.txt"));
     	    for(int i = 0; i < strArray.length; i++) {
                writer.println(strArray[i]);
                if (i%10000==0) System.out.print(".");
   	        }
            System.out.print("\n");
            writer.close();
        }
      catch (IOException e) { System.out.println(e); }
    }

    public void run() {
        read();
        sort();
        write();
    }

    public void start() {
        if(t == null) {
            t = new Thread(this, "\t\t\tSort Strings");
            t.start(); // this will invoke the run() method
        }
    }


}
