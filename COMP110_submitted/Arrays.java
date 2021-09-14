//Name: Trevor Klar
//Date: 09-22-2018
//Application: Arrays
//Purpose: To practice with arrays in Java

import java.util.Scanner;

class Arrays {
  public static int sumOfAnArray(int[] intArray) {
    int result = 0;
    for (int i = 0; i < intArray.length; i++) {
      result += intArray[i];
    } // end for
    return result;
  } // end sumOfAnArray

  public static int maxValueInArray(int[] intArray) {
    int result = Integer.MIN_VALUE;
    for (int i = 0; i < intArray.length; i++) {
      result = ((result>intArray[i]) ? result : intArray[i]);
    } // end for
    return result;
  } // end maxValueInArray

  public static boolean isStringInArray(String[] strArray) {
    for (int i = 0; i < strArray.length; i++) {
      if (!strArray[i].equals("")) {return true;}
    } // end for
    return false;
  } // end isStringInArray

  public static void main(String[] args) {
    int[] intArray0 = {1,3,2};
    int[] intArray1 = {1,-3,2};
    int[] intArray2 = {1,3,200};
    String[] foo = {"", "", ""};
    String[] bar = {"foo", "", ""};

    System.out.println("sum{1,3,2}=" + sumOfAnArray(intArray0));
    System.out.println("sum{1,-3,2}=" + sumOfAnArray(intArray1));
    System.out.println("sum{1,3,200}=" + sumOfAnArray(intArray2) + "\n");
    System.out.println("sum{1,3,2}=" + maxValueInArray(intArray0));
    System.out.println("sum{1,-3,2}=" + maxValueInArray(intArray1));
    System.out.println("sum{1,3,200}=" + maxValueInArray(intArray2) + "\n");
    System.out.println("isStringInArray{\"\", \"\", \"\"} = " + isStringInArray(foo));
    System.out.println("isStringInArray{\"foo\", \"\", \"\"} = " + isStringInArray(bar) + "\n");
  }
}
