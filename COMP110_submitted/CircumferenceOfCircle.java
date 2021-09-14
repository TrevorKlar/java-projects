//Name: Trevor Klar
//Date: 09-08-2018
//Application: CircumferenceOfCircle
//Purpose: Print the Circumference Of a Circle
class CircumferenceOfCircle {
   public static void main(String args[]) {
      
      // declaration 
      double radius;
      double circumference;
      final double PI = Math.PI;

      // initialization
      radius = Math.exp(1.0); //This is the value of e, one of my favorite numbers. 

      // compute area
      circumference = radius * 2 * PI;
      System.out.println("Radius of circle = e = " + radius);
      System.out.println("Circumference of circle = " + circumference);
   }
}
