//Name: Trevor Klar
//Date: 09-08-2018
//Application: DataTypesAndOperators
//Purpose: Print every data type in Java, and use examples of the arithmetic operators covered in lecture.
class DataTypesAndOperators {
   public static void main(String args[]) {
      
      // declaration 
      boolean isSkyGreen;
      char aLetter;
      byte eightBitNum;
      short anInteger;
      int aBigInteger;
      long aReallyBigInteger;
      float aDecimal;
      double aReallyAccurateDecimal;
      String aSentence;
      int result;
      double resultd;

      // initialization
      isSkyGreen = false;
      aLetter = '\u00A7';
      eightBitNum = 64;
      anInteger = 10296;
      aBigInteger = (int) Math.pow(2,20);
      aReallyBigInteger = (long) Math.pow(2,40);
      aDecimal = (float) Math.sqrt(2);
      aReallyAccurateDecimal = Math.sqrt(5);
      aSentence = "Hello, World!";

      // do stuff
      System.out.println("This is a boolean: \t Is the sky green? " + isSkyGreen);
      System.out.println("This is a char: " + aLetter);
      System.out.println("This is a byte: " + eightBitNum);
      System.out.println("This is a short: " + anInteger);
      System.out.println("This is an int: " + aBigInteger);
      System.out.println("This is a long: " + aReallyBigInteger);
      System.out.println("This is a float: " + aDecimal);
      System.out.println("This is a double: " + aReallyAccurateDecimal);
      System.out.println("This is a String: " + aSentence);
      //more stuff
      result = 2 * 7;
      System.out.println("2 * 7 = " + result);
      resultd = 2.0 / 7.0;
      System.out.println("2.0 / 7.0 = " + resultd);
      result = 2 / 7;
      System.out.println("2 / 7 = " + result + " (for a float)");
      result = 2 % 7;
      System.out.println("2 % 7 = " + result);
      result = 2 + 7;
      System.out.println("2 + 7 = " + result);
      result = 2 - 7;
      System.out.println("2 - 7 = " + result);
      result = 2 * 7;
      System.out.println("2 * 7 = " + result);
      result = eightBitNum;
      System.out.println("eightBitNum = " + result);
      System.out.println("++eightBitNum = " + ++result);
      System.out.println("--eightBitNum = " + --result);
      result%=2;
      System.out.println("eightBitNum % 2 = " + result);
      
   }
}
