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

class Pug extends Dog {
  //Breed #6
  //===============================================
  private final String BREED = "Pug";

  public Pug(){
    super("Ollie");
  }

  public Pug(String name) {
    super(name);
  }

  @Override
  public String bark() {
    return "Arf!";
  }

  @Override
  public String getColor() {return "black";}

  /*
  @Override
  public int getSpeed() {return 3;}
  */

  @Override
  public String getSize() {return "small";}

  public String getBreed() {return BREED;}

}
