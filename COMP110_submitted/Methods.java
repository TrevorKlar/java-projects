//Name: Trevor Klar
//Date: 09-08-2018
//Application: Methods
//Purpose: To practice implementing multiple methods in one class

import  java.util.Scanner;

class Methods {
  public static double getAreaOfCircle(double radius) {
    if (radius<0) {
      System.out.println("ERROR: Radius " + radius + " cannot be negative.");
      return 0;
    }
    double area = Math.pow(radius, 2) * Math.PI;
    return area;
  }

  public static double getCircumferenceOfCircle(double radius) {
    if (radius<0) {
      System.out.println("ERROR: Radius " + radius + " cannot be negative.");
      return 0;
    }
    double circumference = radius * 2 * Math.PI;
    return circumference;
  }

  public static double getCelsiusToFahrenheit(double celsius) {
    double fahrenheit = celsius * 1.8 + 32;
    return fahrenheit;
  }

  public static double getFahrenheitToCelsius(double fahrenheit) {
    double celsius = (fahrenheit - 32) / 1.8;
    return celsius;
  }

  public static void quadraticEquation() {
    //declaration
    int a=1;
    int b=0;
    int c=0;
    double result=0;
    double result2=0;
    double discriminant;
    Scanner sc = new Scanner(System.in);
    //do stuff
    System.out.println("===quadraticEquation===");
    while (true) {
      System.out.println("");
      System.out.println("1. Calculate quadratic");
      System.out.println("2. End");
      int userInput = sc.nextInt();
      if (userInput==1) {
        System.out.println("Solving quadratic ax^2+bx+c. \nInput a:");
        a=sc.nextInt();
        System.out.println("Input b:");
        b=sc.nextInt();
        System.out.println("Input c:");
        c=sc.nextInt();
        discriminant = b*b-4*a*c;
        if (a==0) {
          if (b==0) {
            if (c!=0) {
              System.out.println("No solutions");
              continue;
            } else if (c==0) {
              System.out.println("All real numbers");
              continue;
            }
          } else if (b!=0) {
            result = (double) -c/b;
            System.out.println("x = " + result);
            continue;
          }
        } else if (a!=0) {
          if (discriminant < 0) {
            System.out.println("No solutions");
            continue;
          } else if (discriminant == 0) {
            result = (double) -b/(2*a);
            System.out.println("x = " + result);
            continue;
          } else if (discriminant > 0) {
            result = (double) (-b + Math.sqrt(discriminant))/(2*a);
            result2 = (double) (-b - Math.sqrt(discriminant))/(2*a);
            System.out.println("x = " + result + ", " + result2);
            continue;
          }
        }
        System.out.println("ERROR: algorithm terminated unexpectedly. Check your math.");
        continue;
      } else if (userInput == 2) {
        System.out.println("Quitting.");
        break;
      } else {
        System.out.println("ERROR: enter 1 or 2.");
        continue;
      }
    }
  }


  public static void main(String[] args){
    System.out.println("getAreaOfCircle(-2)= "+getAreaOfCircle(-2));
    System.out.println("getAreaOfCircle(3)= "+getAreaOfCircle(3));
    System.out.println("getAreaOfCircle(3.5)= "+getAreaOfCircle(3.5));
    System.out.println("");

    System.out.println("getCircumferenceOfCircle(0)= "+getCircumferenceOfCircle(0));
    System.out.println("getCircumferenceOfCircle(-1)= "+getCircumferenceOfCircle(-1));
    System.out.println("getCircumferenceOfCircle(1.7)= "+getCircumferenceOfCircle(1.7));
    System.out.println("");

    System.out.println("getCelsiusToFahrenheit(0)= "+getCelsiusToFahrenheit(0));
    System.out.println("getCelsiusToFahrenheit(350)= "+getCelsiusToFahrenheit(350));
    System.out.println("getCelsiusToFahrenheit(-10)= "+getCelsiusToFahrenheit(-10));
    System.out.println("");

    System.out.println("getFahrenheitToCelsius(451)= "+getFahrenheitToCelsius(451));
    System.out.println("getFahrenheitToCelsius(101)= "+getFahrenheitToCelsius(101));
    System.out.println("getFahrenheitToCelsius(-25)= "+getFahrenheitToCelsius(-25));
    System.out.println("");

    quadraticEquation();

  }
}
