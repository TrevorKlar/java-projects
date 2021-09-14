//Name: Trevor Klar
//Date: 9-22-18
//Application: Quiz 3
//Purpose: Quiz 3

import java.util.Scanner;

class Quiz3 {
  public static void main(String[] args) {

    String userInputStr;
    int userInput;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter an integer");
    userInput = Integer.parseInt(sc.nextLine());
    System.out.println("Absolute value of "+ userInput + " = " + Math.abs(userInput));

    System.out.println("Enter a string");
    userInputStr = sc.nextLine();
    System.out.println("The string \"" + userInputStr + "\" has length " + userInputStr.length());

  }
}
