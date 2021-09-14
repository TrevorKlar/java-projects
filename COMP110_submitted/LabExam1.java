//Name: Trevor Klar
//Date: 09-29-2018
//Application: LabExam1
//Purpose: The first lab exam
import java.util.Scanner;

class LabExam1 {
  public static void main(String[] args) {
    String city;
    String car;
    double cost;
    double residual;
    int term;
    Scanner sc = new Scanner(System.in);

    double localSalesTax;
    double moneyFactor;
    double depreciation;
    double interest;
    double totalTax;
    double leasePayment;
    int leasePaymentCents;

    System.out.println("=== Car Lease Payment Calculator ===");
    // Read user input
    System.out.println("Please input the following information.");
    System.out.println();

    System.out.print("City of purchase:");
    city = sc.nextLine();
    System.out.println();

    System.out.print("Vehicle Make:");
    car = sc.nextLine();
    System.out.println();

    System.out.print("Capitalized Cost:");
    cost = Double.parseDouble(sc.nextLine());
    System.out.println();

    System.out.print("Residual Value:");
    residual = Double.parseDouble(sc.nextLine());
    System.out.println();

    System.out.print("Loan term (in months):");
    term = Integer.parseInt(sc.nextLine());
    System.out.println();

    /*
    System.out.println(city);
    System.out.println(car);
    System.out.println(cost);
    System.out.println(residual);
    System.out.println(term);
    */

    // Input validation and calulation
    if (city.equals("LA")) {
      localSalesTax = .09;
    } else if (city.equals("NYC")) {
      localSalesTax = .08875;
    } else {
      localSalesTax = .07;
    }

    if (car.equals("Toyota")) {
      moneyFactor = .0018;
    } else if (city.equals("Ford")) {
      moneyFactor = .0021;
    } else {
      moneyFactor  = .0029;
    }

    depreciation = (cost - residual) / term;
    System.out.println(depreciation);
    interest = (cost + residual) * moneyFactor;
    System.out.println(interest);
    totalTax = (depreciation + interest) * localSalesTax;
    System.out.println(totalTax);
    leasePaymentCents = (int) ((depreciation + interest + totalTax)*100);
    System.out.println(leasePaymentCents);
    leasePayment = (double) leasePaymentCents/100;

    // Give results
    System.out.println("Monthly Lease Payment: $" +leasePayment);
  } // end main
} // end LabExam1
