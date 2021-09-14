//Name: Trevor Klar
//Date: 10-6-2018
//Application: Algo
//Purpose: To write some class methods in Java.

import java.util.Arrays;

class Driver {
  public static void main(String[] args) {
    /*
    System.out.println("max(3,4)=" + algo.max(3,4));
    System.out.println("max(4,4)=" + algo.max(4,4));
    System.out.println("max(-3,4)=" + algo.max(-3,4) +"\n");
    System.out.println("min(3,4)=" + algo.min(3,4));
    System.out.println("min(4,4)=" + algo.min(4,4));
    System.out.println("min(-3,4)=" + algo.min(-3,4) +"\n");
    System.out.println("isEven(3)=" + algo.isEven(3));
    System.out.println("isEven(0)=" + algo.isEven(0));
    System.out.println("isEven(-3)=" + algo.isEven(-3) +"\n");
    System.out.println("isOdd(3)=" + algo.isOdd(3));
    System.out.println("isOdd(0)=" + algo.isOdd(0));
    System.out.println("isOdd(-3)=" + algo.isOdd(-3) +"\n");
    System.out.println("isCharInString('q', \"Quack\")=" + algo.isCharInString('q', "Quack"));
    System.out.println("isCharInString('q', \"dodgers\")=" + algo.isCharInString('q', "dodgers"));
    System.out.println("isCharInString('g', \"dodgers\")=" + algo.isCharInString('g', "dodgers") +"\n");
    System.out.println("isPalindrome(\"dodgers\")=" + algo.isPalindrome("dodgers"));
    System.out.println("isPalindrome(\"madamimadam\")=" + algo.isPalindrome("madamimadam"));
    System.out.println("isPalindrome(\"poop\")=" + algo.isPalindrome("poop") +"\n");
    */

    int[] intarray1 = {1,3,2,4,45,-210, -23, 12};
    String testString = "aabbc1cd2dee3ffg4g";
    String testString1 = "aab\\bc1cd2d\\\\ee3ffg4g";
    String digString = "123";
    String[] myStringArray = {"abc", "123", "blah blah"};
    Algo algo = new Algo();

    System.out.println(algo.numberOfOdds(intarray1));
    System.out.println(algo.numberOfEvens(intarray1));
    System.out.println(algo.max(intarray1));
    System.out.println(algo.min(intarray1));

    System.out.println(algo.firstRepeatingCharInString("intarray1"));
    System.out.println(algo.firstRepeatingCharInString("abcdefg"));
    System.out.println(algo.firstRepeatingCharInString(testString));
    System.out.println(algo.lastRepeatingCharInString(testString));
    System.out.println(algo.firstNonRepeatingCharInString(testString));
    System.out.println(algo.firstNonRepeatingCharInString("intarray1"));

    System.out.println(testString + " " + testString.charAt(5) + " " + testString.substring(5+1));

    System.out.println();
    System.out.println(digString);
    System.out.println(digString.charAt(0));
    System.out.println(digString.charAt(0)+"");
    System.out.println(Integer.parseInt(digString.charAt(0)+""));
    System.out.println(algo.countDigitsInString(digString));
    System.out.println(algo.countDigitsInString(testString));
    System.out.println(algo.countEvenDigitsInString(testString));
    System.out.println(algo.countEvenDigitsInString("asdfkjnjknc"));
    System.out.println(Arrays.toString(algo.reverseArray(myStringArray)));
    System.out.println(algo.reverseString(testString));
    System.out.println(Arrays.toString(testString.split("1")));
    System.out.println(Arrays.toString(algo.splitString(testString, '1')));
    System.out.println(testString1);
    System.out.println(Arrays.toString(testString1.split("\\\\")));
    System.out.println(Arrays.toString(intarray1));
    algo.sort(intarray1);
    System.out.println(Arrays.toString(intarray1));
    System.out.println(Arrays.toString(myStringArray));
    algo.sort(myStringArray);
    System.out.println(Arrays.toString(myStringArray));
    System.out.println("Prime: 21" + algo.isPrime(21) + 17 + algo.isPrime(17) + 1333 + algo.isPrime(1333));









  }
}
