//Name: Trevor Klar
//Date: 09-08-2018
//Application: AreaOfCircle
//Purpose: Print the Area Of a Circle
class AreaOfCircle {
   public static void main(String args[]) {
      
      // declaration 
      double radius;
      double area;
      final double PI = Math.PI;

      // initialization
      radius = Math.exp(1.0); //This is the value of e, one of my favorite numbers. 

      // compute area
      area = Math.pow(radius, 2) * PI;
      System.out.println("Radius of circle = e = " + radius);
      System.out.println("Area of circle = " + area);
   }
}
