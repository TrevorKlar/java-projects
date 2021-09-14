//Name: Trevor Klar
//Date: 09-09-2018
//Application: Selection
//Purpose: To demonstrate operators and selection in Java

class Selection {
  public static void myIf(String userInput) {
    System.out.println("I\'ll do nothing without the password!\nYou said:"+ userInput);
    if (userInput.equals("opensesame")) {
      System.out.println("Crap! You guessed the password!!");
    }
    System.out.println("");
  }

  public static void myIfElse(String userInput) {
    System.out.println("I won\'t cooperate unless you say the password!\nYou said:"+ userInput);
    if (userInput.equals("opensesame")) {
      System.out.println("Crap! You guessed the password!!");
    } else {
      System.out.println("HAHA! You don\'t know the password!!");
    }
    System.out.println("");
  }

  public static void myIfElseifElse(int userInput) {
    System.out.println("I'm thinking of a number, 1 to 10. What is it?\nYou said:"+ userInput);
    if (userInput == 7) {
      System.out.println("You guessed my number!!");
    } else if (userInput < 1 || userInput > 10){
      System.out.println("That's... not between 1 and 10. Be smarter.");
    } else {
      System.out.println("Nope, that's not it. ");
    }
    System.out.println("");
  }

  public static void myIfElseifElseifElse(int userInput) {
    System.out.println("I'm thinking of a number, 1 to 10. What is it?\nYou said:"+ userInput);
    if (userInput == 7) {
      System.out.println("You guessed my number!!");
    } else if (userInput < 1 || userInput > 10){
      System.out.println("That's... not between 1 and 10. Be smarter.");
    } else if (userInput > 100){
      System.out.println("That's even worse!! Come on. 1 to 10. Not that hard. ");
    } else {
      System.out.println("Nope, that's not it. ");
    }
    System.out.println("");
  }

  public static void myNestedIf(int userInput) {
    System.out.println("Okay, now you pick a number, and I'll tell you about it.\nYou said:"+ userInput);
    if (Math.floorMod(userInput, 2) == 0) {
      if (userInput > 0) {
        System.out.println("Your number is even and positive.");
      } else if (userInput < 0) {
        System.out.println("Your number is even and negative.");
      } else {
        System.out.println("Your number is even and zero.");
      }
    } else if (Math.floorMod(userInput, 2) == 1){
      if (userInput > 0) {
        System.out.println("Your number is odd and positive.");
      } else if (userInput < 0) {
        System.out.println("Your number is odd and negative.");
      }
    }
    System.out.println("");
  }

  public static void mySwitchCase(int userInput) {
    System.out.println("Choose your option: \n1. Alpha \n2. Beta \n3. Gamma");
    switch (userInput) {
      case 1: System.out.println("Alpha");
              break;
      case 2: System.out.println("Beta");
              break;
      case 3: System.out.println("Gamma");
              break;
      default: break;
    }
    System.out.println("");
  }

  public static void main(String[] args) {
    boolean skyIsBlue = true;
    boolean grassIsPurple = false;
    int myFavoriteNumber = 7;
    String testing123 = "Testing 123";
    //Operators
    System.out.println("\n===Operators===\n");
    System.out.println("+myFavoriteNumber\n\t" + +myFavoriteNumber);
    System.out.println("-myFavoriteNumber\n\t" + -myFavoriteNumber);
    System.out.println("!skyIsBlue\n\t" + !skyIsBlue);
    System.out.println("skyIsBlue == grassIsPurple\n\t" + (skyIsBlue == grassIsPurple));
    System.out.println("skyIsBlue != grassIsPurple\n\t" + (skyIsBlue != grassIsPurple));
    System.out.println("skyIsBlue && grassIsPurple\n\t" + (skyIsBlue && grassIsPurple));
    System.out.println("skyIsBlue || grassIsPurple\n\t" + (skyIsBlue || grassIsPurple));
    System.out.println("myFavoriteNumber > 6\n\t" + (myFavoriteNumber > 6));
    System.out.println("myFavoriteNumber > 7\n\t" + (myFavoriteNumber > 7));
    System.out.println("myFavoriteNumber >= 7\n\t" + (myFavoriteNumber >= 7));
    System.out.println("myFavoriteNumber == 7\n\t" + (myFavoriteNumber == 7));
    System.out.println("myFavoriteNumber <= 7\n\t" + (myFavoriteNumber <= 7));
    System.out.println("myFavoriteNumber <= 8\n\t" + (myFavoriteNumber <= 8));
    System.out.println("myFavoriteNumber < 8\n\t" + (myFavoriteNumber < 8));
    System.out.println("myFavoriteNumber < 7\n\t" + (myFavoriteNumber < 7));
    System.out.println("myFavoriteNumber != 8\n\t" + (myFavoriteNumber != 8));
    System.out.println("skyIsBlue ? \"totally true\" : \"mega false\"\n\t" + (skyIsBlue ? "totally true" : "mega false"));
    System.out.println("grassIsPurple ? \"totally true\" : \"mega false\"\n\t" + (grassIsPurple ? "totally true" : "mega false"));

    System.out.println("\n===Selections===\n");
    //System.out.println("testing123 == \"Testing 123\"\n\t" + (testing123 == "Testing 123"));
    System.out.println("==If==");
    myIf("password");
    myIf("opensesame");

    System.out.println("==IfElse==");
    myIfElse("password");
    myIfElse("opensesame");

    System.out.println("==IfElseifElse==");
    myIfElseifElse(19);
    myIfElseifElse(109);
    myIfElseifElse(2);
    myIfElseifElse(7);

    System.out.println("==IfElseifElseifElse==");
    myIfElseifElseifElse(19);
    myIfElseifElseifElse(109);
    myIfElseifElseifElse(2);
    myIfElseifElseifElse(7);

    System.out.println("==NestedIf==");
    myNestedIf(-99);
    myNestedIf(10);
    myNestedIf(5);
    myNestedIf(-12);
    myNestedIf(0);

    System.out.println("==SwitchCase==");
    mySwitchCase(1);
    mySwitchCase(2);
    mySwitchCase(3);



  }
}
