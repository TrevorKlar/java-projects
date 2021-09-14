//Name: Trevor Klar
//Date: 10-6-2018
//Application: Inheritance
//Purpose: To write some subclasses in Java.

/*
Given a class named Dog.java
Extend this class 5 times, using a different dog breed (pick your favorite breeds)
	Breed #1: must use default name and override at least 1 other (different) feature/method
	Breed #2: must use default bark and override at least 1 other (different) feature/method
	Breed #3: must use default size and override at least 1 other (different) feature/method
	Breed #4: must use default color and override at least 1 other (different) feature/method
	Breed #5: must use default speed and override at least 1 other (different) feature/method
Write a Driver to demo all breeds
Compress 7 java files (this includes the Driver) and turn in one zipped file
*/

class GreatDane extends Dog {
  //Breed #2
  //===============================================
  private final String BREED = "GreatDane";

  public GreatDane(){
    super("Marmaduke");
  }

  public GreatDane(String name) {
    super(name);
  }

  /*
  @Override
  public String bark() {
    return "I was hiding under your porch because I love you. Can I stay?";
  }
  */

  @Override
  public String getColor() {return "brown";}

  @Override
  public int getSpeed() {return 30;}

  @Override
  public String getSize() {return "very large";}

  public String getBreed() {return BREED;}
}