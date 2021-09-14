//Name: Trevor Klar
//Date: 10-6-2018
//Application: Algo
//Purpose: To write some class methods in Java.

/*
max
odd
even
palindrome
find if char exists in a string (returns a boolean)
*/

class Algo {
  public static int max(int a, int b) {
    return (a>b) ? a : b;
  }

  public static int min(int a, int b) {
    return (a<b) ? a : b;
  }

  public static boolean isEven(int n) {
    return (n%2==0);
  }

  public static boolean isOdd(int n) {
    return (n%2==1);
  }

  public static boolean isCharInString(char inputChar, String inputString) {
    for (int i=0; i<inputString.length(); i++) {
      if (inputString.charAt(i)==inputChar) {return true;}
    }
    return false;
  }

  public static boolean isPalindrome(String inputString) {
    //madamimadam
    //poop
    for (int i=0; i<(inputString.length()/2); i++) {
      if (inputString.charAt(i) != inputString.charAt(inputString.length()-1-i)) {return false;}
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println("max(3,4)=" + max(3,4));
    System.out.println("max(4,4)=" + max(4,4));
    System.out.println("max(-3,4)=" + max(-3,4) +"\n");
    System.out.println("min(3,4)=" + min(3,4));
    System.out.println("min(4,4)=" + min(4,4));
    System.out.println("min(-3,4)=" + min(-3,4) +"\n");
    System.out.println("isEven(3)=" + isEven(3));
    System.out.println("isEven(0)=" + isEven(0));
    System.out.println("isEven(-3)=" + isEven(-3) +"\n");
    System.out.println("isOdd(3)=" + isOdd(3));
    System.out.println("isOdd(0)=" + isOdd(0));
    System.out.println("isOdd(-3)=" + isOdd(-3) +"\n");
    System.out.println("isCharInString('q', \"Quack\")=" + isCharInString('q', "Quack"));
    System.out.println("isCharInString('q', \"dodgers\")=" + isCharInString('q', "dodgers"));
    System.out.println("isCharInString('g', \"dodgers\")=" + isCharInString('g', "dodgers") +"\n");
    System.out.println("isPalindrome(\"dodgers\")=" + isPalindrome("dodgers"));
    System.out.println("isPalindrome(\"madamimadam\")=" + isPalindrome("madamimadam"));
    System.out.println("isPalindrome(\"poop\")=" + isPalindrome("poop") +"\n");
  }
}
