//Name: Trevor Klar
//Date: 11-9-2018
//Application: Polymorphism
//Purpose: to pratice with Polymorphism in java.

public abstract class Shape{
  public double width;
  public double height;

  Shape() {
    setSize(0, 0);
  }

  public void setSize(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public abstract double getArea();
}
