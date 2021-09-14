//Name: Trevor Klar
//Date: 11-25-2018
//Application: Recursion
//Purpose: Some methods that call themselves.

class Recursion {
    public static long factorial(long n) throws ArithmeticException {
        if (n<0) { throw new ArithmeticException("Undefined"); }
        else if (n==0) { return 1; }
        else { return n*factorial(n-1); }
    }

    public static int gcd(int x, int y) {
        if (x<0) { return gcd(-x,y); }
        else if (y<0) { return gcd(x,-y); }
        else if(y == 0) { return x; }
        else { return gcd(y, (x % y)); }
    }

    public static int fib(int n) {
        if (n==1 || n==2) { return 1; }
        else if (n>0) { return fib(n-1)+fib(n-2); }
        else { return fib(n+2)-fib(n+1); }
    }

    public static void main(String[] args) {
        System.out.println("Factorial:\n");
        System.out.print(""+4+"!\t"+factorial(4)+"\n");
        System.out.print(""+7+"!\t"+factorial(7)+"\n");
        System.out.print(""+15+"!\t"+factorial(15)+"\n");

        System.out.println("\nEuclidean Algorithm:\n");
        System.out.print(""+3+"\t"+7+"\t|"+gcd(3,7)+"\n");
        System.out.print(""+12+"\t"+24+"\t|"+gcd(12,24)+"\n");
        System.out.print(""+6+"\t"+9+"\t|"+gcd(6,9)+"\n");
        System.out.print(""+-17+"\t"+34+"\t|"+gcd(-17,34)+"\n");
        System.out.print(""+17+"\t"+-34+"\t|"+gcd(17,-34)+"\n");

        System.out.println("\nSome Fibonacci numbers:\n");
        for (int i=-3; i<3; i++) {
            System.out.print(""+i+"\t"+fib(i)+"\n");
        }
        System.out.println(""+ 35 + "\t" + fib(35));
    }
}
