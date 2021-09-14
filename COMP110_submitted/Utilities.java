//Name: Trevor Klar
//Date: 09-08-2018
//Application: Utilities
//Purpose: Demo some classes in Java

import java.util.Scanner;
import javax.swing.JOptionPane;

class Utilities {
   public static void main(String[] args) {

      // StringDemo
      System.out.println("\n=== StringDemo ===");
      String myName = "trevor";
      System.out.println("String.indexOf()\t\'e\' has index of " + myName.indexOf('e') + " in \"trevor\"");
      System.out.println("String.charAt()\t\tThe letter at index 5 in \"trevor\" is \'" + myName.charAt(5)+"\'.");
      System.out.println("String.toUpperCase()\t\"trevor\" in uppercase is \"" + myName.toUpperCase() + "\"");

      //MathDemo
      System.out.println("\n=== MathDemo ===");
      final double PI = Math.PI/3;
      System.out.println("Math.PI\t\tpi/3 is " + Math.sin(PI)/3);
      System.out.println("Math.sin()\tthe sin of pi/3 is " + Math.sin(PI));
      System.out.println("Math.pow()\tthe square of that number is " + Math.pow(Math.sin(PI), 2));

      //ScannerDemo
      System.out.println("\n=== ScannerDemo ===");
      Scanner sc = new Scanner(System.in);
      System.out.println("Scanner.nextLine()\nWhat is your name? ");
      String yourName = sc.nextLine();
      System.out.println("Hello " + yourName + ".\n");

      System.out.println("Scanner.nextInt()\nWhat is your age?");
      int age = sc.nextInt();
      System.out.println("Your age is " + age + ".\n");

      System.out.println("Scanner.nextByte()\nPick a number, 1 to 100:");
      byte pickNum = sc.nextByte();
      System.out.println("You picked " + pickNum + ".");

      sc.close();

      //JOptionPaneDemo
      System.out.println("\n=== JOptionPaneDemo ===");
      System.out.println("JOptionPane.showInputDialog()");
      String blahBlah = JOptionPane.showInputDialog("Type in anything");
      System.out.println("You said " + blahBlah + "\n");

      System.out.println("JOptionPane.showConfirmDialog()");
      int youClicked = JOptionPane.showConfirmDialog(null, "Do you want to continue?");
      String response = "";
      if (youClicked == 0) {
        response = "Yes";
      } else if (youClicked == 1) {
        response = "No";
      } else if (youClicked == 2) {
        response = "Cancel";
      }

      System.out.println("JOptionPane.showMessageDialog()\n");
      JOptionPane.showMessageDialog(null, "You said " + response + ", but I wasn't really listening, so we're continuing either way.");
      //System.out.println("You said " + response + ", but I wasn't really listening, so we're continuing either way.\n");
   }
}
