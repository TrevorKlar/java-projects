//Name: Trevor Klar
//Date: 10-6-2018
//Application: IO
//Purpose: To write some class methods in Java.

import java.util.Scanner;
import java.io.*;

class IO {
  String[] arr;


  IO() {
    // I feel like these methods could all be static.
  }

  public void read() {
    String wholefile ="";
    try {
      Scanner s = new Scanner( new File("dictionary.txt") );
    	while (s.hasNextLine()) {
        wholefile += s.nextLine()+"\n";
    	}
      arr = wholefile.split("\n");
    }
    catch (IOException e) { System.out.println(e); }
  }

  public void write() {
    try {
   		PrintStream writer = new PrintStream( new File("output.txt"));
   	  for(int i = 0; i < arr.length; i++) {
    	   writer.println(arr[i]);
     	}
   		writer.close();
    }
    catch (IOException e) { System.out.println(e); }
  }

  private void swap(int j) {
    String temp = arr[j-1];
    arr[j-1] = arr[j];
    arr[j] = temp;
  }

  public void sort() {
    int n = arr.length;
    for(int i = 0; i < n; i++) {
      for(int j = 1; j < n-i; j++) {
         if(arr[j-1].compareTo(arr[j]) > 0) {
            swap(j);
         } // end if
      } // end inner loop
    }  // end outer loop
  } // end method
}
