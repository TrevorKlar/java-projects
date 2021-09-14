//Name: Trevor Klar
//Date: 09-22-2018
//Application: Loops
//Purpose: To practice with loops in Java

import java.util.Scanner;

class Loops {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char startChar;
    int loopSelect;

    System.out.println("Choose a loop to try:");
    System.out.println("0. exit ");
    System.out.println("1. for ");
    System.out.println("2. while");
    System.out.println("3. do/while");
    do {
      loopSelect = Integer.parseInt(sc.nextLine());
      switch (loopSelect) {
        case 1: //for
          System.out.println("Enter a starting character:");
          startChar = sc.nextLine().charAt(0);
          for (int i = (int) startChar; i<=126; i++) {
            System.out.println(startChar);
            startChar++;
          } // end for
          System.out.println("");
          break;
        case 2: // while
          System.out.println("Enter a starting character:");
          startChar = sc.nextLine().charAt(0);
          while (startChar<=126) {
            System.out.println(startChar);
            startChar++;
          } // end while
          System.out.println("");
          break;
        case 3: // do-while
          System.out.println("Enter a starting character:");
          startChar = sc.nextLine().charAt(0);
          do {
            System.out.println(startChar);
            startChar++;
          } while (startChar<=126);
          // end do
          System.out.println("");
          break;
        default:
          break;
      } // end switch
    } while (loopSelect != 0);
    // end do
    sc.close();
  } // end main
} // end class
