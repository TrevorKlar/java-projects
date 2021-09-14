//This class will sort integers
//constructor to initialize member variables
//run() method
//calls generate()
//calls sort()
//calls write()
//start() method

import java.io.*;

class RunnableClassA implements Runnable {
    private int[] numArray;
    Thread t;

    RunnableClassA(){}

    private void generate() {
        numArray = new int[100000];
        System.out.print("generating ints");
        for (int i=0; i<numArray.length; i++) {
            numArray[i] = (int) Math.floor(Math.random() * (100001));
            if (i%10000==0) System.out.print(".");
        }
        System.out.print("\n");
    }

    private void sort() {
        System.out.print("sorting ints");
        Algo.sort(numArray);
    }

    private void write() {
        System.out.print("writing ints");
        try {
            PrintStream writer = new PrintStream( new File("outputA.txt"));
     	    for(int i = 0; i < numArray.length; i++) {
                writer.println(numArray[i]);
                if (i%10000==0) System.out.print(".");
   	        }
            System.out.print("\n");
            writer.close();
        }
      catch (IOException e) { System.out.println(e); }
    }

    public void run() {
        generate();
        sort();
        write();
    }

    public void start() {
        if(t == null) {
            t = new Thread(this, "Sort Integers");
            t.start(); // this will invoke the run() method
        }
    }


}
