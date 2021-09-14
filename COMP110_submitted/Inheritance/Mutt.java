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

class Mutt extends Dog {
  //Breed #1
  //===============================================
  private final String BREED = "Mutt";

  public Mutt(){
    super(); // Uses default name "Chance"
  }

  public Mutt(String name) {
    super(name);
  }

  @Override
  public String bark() {
    return "My name is " + getName() + ". I know, it sounds odd, but most names do if you think about it long enough... maybe even yours. I was abandoned when I was very young. I lived on the streets scrounging for food sleeping wherever I could; that seemed like fun at first, but pretty soon, it landed me behind bars. But I don't like to talk about that; let's talk about after that... when I got my second chance... and my name. You see, this family came along, and I guess you can say they rescued me, because they adopted me and brought me to live at their house. But it was their home, not mine. Still, it was an improvement over that other place: lots of space, fresh air, plenty interesting things to explore, and all the underwear I could eat.";
  }

  /*
  @Override
  public String getColor() {return "apricot";}
  */

  /*
  @Override
  public int getSpeed() {return 3;}
  */

  @Override
  public String getSize() {return "small";}

  public String getBreed() {return BREED;}
}
