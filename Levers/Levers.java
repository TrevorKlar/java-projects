//Name: Trevor Klar
//Date: 1-7-19
//Application: FacebookLite
//Purpose: The driver class for FacebookLite

import java.util.Scanner;

public class Levers {

    public static final int MAX = (int) Math.pow(4,20);
    public static final int[] ZERO_ARRAY = {0, 0, 0};
    public static final int[] A = {1, 0, -1};
    public static final int[] B = {-1, -1, 1};
    public static final int[] C = {0, 1, 1};
    public static boolean debug = false;


    public static int[] sum(int[] A, int[] B) {
        int length = Math.min(A.length, B.length);
        int[] result = new int[length];
        for (int i=0; i<length; i++) {
            result[i] = (A[i]+B[i])%12;
        }
        return result;
    }

    public static int[] sum(int[] A, int[] B, int[] C, int[] D) {
        int length = Math.min(Math.min(A.length, B.length), Math.min(C.length, D.length));
        int[] result = new int[length];
        for (int i=0; i<length; i++) {
            result[i] = (A[i]+B[i]+C[i]+D[i])%12;
        }
        return result;
    }

    public static boolean isZero(int[] array) {
        for (int i=0; i<array.length; i++) {
            if (array[i]!=0) { return false; }
        }
        return true;
    }

    public static int[] scalar(int k, int[] A) {
        int[] result = new int[A.length];
        for (int i=0; i<A.length; i++) {
            result[i] = k*A[i];
        }
        return result;
    }

    public static String reverse(String source){
        if(source == null || source.isEmpty()){
            return source;
        }
        String reverse = "";
        for(int i = source.length() -1; i>=0; i--){
            reverse = reverse + source.charAt(i);
        }
        return reverse;
    }

    public static String toQuaternaryString(int n) {
        int length = (int) (Math.log(n)/Math.log(4) + 1);
        String result = "";
        for (int i=0; i<length; i++) {
            result += "" + n % 4;
            n /= 4 ;
        }
        return reverse(result);
    }

    public static int pow(int a, int b) {
        int re = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                re *= a;
            }
            b >>= 1;
            a *= a;
        }
        return re;
    }

    public static String display(int[] array) {
        String result = "(";
        for (int i=0; i<array.length-1; i++) {
            result += "" + array[i] + ", ";
        }
        result += "" + array[array.length-1] + ")";
        return result;
    }

    public static boolean checkPath(int path, int[] time) {
        String strPath = toQuaternaryString(path);
        int countA = strPath.length() - strPath.replace("1", "").length();
        int countB = strPath.length() - strPath.replace("2", "").length();
        int countC = strPath.length() - strPath.replace("3", "").length();
        int[] result = sum(time, scalar(countA, A), scalar(countB, B), scalar(countC, C));
        if (debug) {
            System.out.println("" + path);
            System.out.println("" + strPath);
            System.out.println("" + countA + ", " + countB + ", " + countC);
            System.out.println(display(result));
        }
        if (isZero(result)) {
            System.out.println("Solution found: (" + countA + ", " + countB + ", " + countC + ")");
            return true;
        }
        else { return false; }
    }

    public static int removeZeroes(int n) {
        String numToCheck = toQuaternaryString(++i);
        System.out.println()
        int numZeros = numToCheck.length() - numToCheck.replace("0", "").length();
        for (i=0; i<numZeros; i++) {
            i+=3*pow(4,i);
        }
    }

    public static void main(String[] args) {

        int hours=0;
        int mins=0;
        int secs=0;
        int[] time = new int[3];

        System.out.println("Enter the time on the clock: (HH:MM:SS)");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        try {
            time[0] = Integer.parseInt(userInput.substring(0,2)) % 12;
            hours = Integer.parseInt(userInput.substring(0,2)) % 12;
            time[1] = (Integer.parseInt(userInput.substring(3,5))/5)%12;
            mins = (Integer.parseInt(userInput.substring(3,5))/5)%12;
            time[2] = (Integer.parseInt(userInput.substring(6,8))/5)%12;
            secs = (Integer.parseInt(userInput.substring(6,8))/5)%12;
            //time = {hours, mins, secs};
        } catch (NumberFormatException nfe) {
            System.out.println("Bad input.");
        } catch (StringIndexOutOfBoundsException oob) {
            System.out.println("Bad input.");
        }
        if (debug) {
            System.out.println("hours " + hours);
            System.out.println("mins " + mins);
            System.out.println("secs " + secs);
            System.out.println("");
            System.out.println(display(time));
            System.out.println(display(sum(time,A)));
            System.out.println(display(sum(A,B,C,ZERO_ARRAY)));
            System.out.println(display(ZERO_ARRAY));
            System.out.println(isZero(ZERO_ARRAY));
            System.out.println(isZero(sum(scalar(-1,A),A)));
            System.out.println("");
            System.out.println("practice quaternary number: 57 = " + toQuaternaryString(57));
            System.out.println("Check that (3,2,1) works with 01:55:00 - " + checkPath(57, time));
        }

        for (int i=0; i<MAX; i++) {
            //System.out.print("" + i + ", ");
            if (checkPath(i, time)) { break; }
            if (i%4==3){

                i--;
            }
        }
    }
}
