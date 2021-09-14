//Name:
//Date:
//Application:
//Purpose:

import java.util.Scanner;
import javax.swing.JOptionPane;

public abstract class MyAbstract {
   // member variables
   // non-abstract methods
   // abstract methods
}

class FlashCards {

  public static void main(String[] args) {

    String userInputStr = "";
    int userInput = 0;




    //Declare / initialize a String array of length 5 with "string#" in every entry.
    String[] myStringArray = new String[5];
      for (int i = 0; i<5; i++) {
        myStringArray[i]="string" + i;
        System.out.println(myStringArray[i]);
      }

    //One object type uses thing.length and another uses thing.length(). Which is which?
      blah = string.length();
      blah = array.length;




    //find a string subString in string myString.
    myString.indexOf(subString); //returns -1 if not found




    //make a string userInputStr all capital letters
    userInputStr = userInputStr.toUpperCase();




    //Write a "try" block to make sure the user inputs a number to the scanner
    try {
      userInput = Integer.parseInt(sc.nextLine());
    } catch (NumberFormatException nfe) {
     JOptionPane.showMessageDialog(null,"Input must be a number.");
    }

    //Write a block to check many cases of the int variable userInput
    switch (userInput) {
      case 0:
        break;
      default:
        break;
    } // end switch

    //Declare a scanner called sc
    Scanner sc = new Scanner(System.in);

    //read an integer from the scanner sc, the "right" way.
    userInput = Integer.parseInt(sc.nextInt());

    //read a string from the scanner sc, the "right" way.
    userInputStr = sc.nextLine();

    //use JOptionPane to say "are you sure?"
    userInput = JOptionPane.showConfirmDialog(null, "are you sure?");

    //use JOptionPane to say "please enter your name" and save the response
    userInputStr = JOptionPane.showInputDialog(null, "please enter your name");

    //use JOptionPane to say "YOU CAN'T DO THAT"
    userInput = JOptionPane.showMessageDialog(null, "YOU CAN'T DO THAT");

    //check if the letter inputChar is at index i in userInputStr. if so, print something.
    if (inputString.charAt(i)==inputChar) {return inputChar+" is contained in "+inputString;}


  } // end main
} // end class
