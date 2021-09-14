//Name: Trevor Klar
//Date: 11-9-2018
//Application: Polymorphism
//Purpose: to practice with Polymorphism in java.

public class Driver {
  public static void main(String[] args) {
    Triangle t1 = new Triangle();
    Rectangle r1 = new Rectangle();
    Shape shape;

    t1.setSize(2,3);
    r1.setSize(4,5);

    shape = t1;
    shape.setSize(6,7);

    shape = r1;
    shape.setSize(8,9);

    System.out.println("t1 area = " + t1.getArea());
    System.out.println("r1 area = " + r1.getArea());

  }
}
