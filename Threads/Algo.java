//Name: Trevor Klar
//Date: 10-6-2018
//Application: Algo
//Purpose: To write some class methods in Java.

/*
max
odd
even
palindrome
find if char exists in a string (returns a boolean)
*/

class Algo {
  Algo() {
    // The methods in this class are member methods and not static methods because... idk? I feel like it's kinda silly to have to instatiate Algo to use it.
  }

  public double fahrenheitToCelsius(double fahrenheit) {
    return (fahrenheit - 32) / 1.8;
  }

  public double celsiusToFahrenheit(double celsius) {
    return celsius * 1.8 + 32;
  }

  public double areaOfCircle(double radius) {
    return Math.pow(radius, 2) * Math.PI;
  }

  public double circumferenceOfCircle(double radius) {
    return radius * 2 * Math.PI;
  }

  public int max(int a, int b) {
    return (a>b) ? a : b;
  }

  public int max(int[] a) {
    int result = Integer.MIN_VALUE;
    for (int i=0; i<a.length; i++) {
      result = (result>a[i]) ? result : a[i];
    }
    return result;
  }

  public int min(int a, int b) {
    return (a<b) ? a : b;
  }

  public int min(int[] a) {
    int result = Integer.MAX_VALUE;
    for (int i=0; i<a.length; i++) {
      result = (result<a[i]) ? result : a[i];
    }
    return result;
  }

  public boolean isEven(int n) {
    return (n%2==0);
  }

  public boolean isOdd(int n) {
    return (n%2==1);
  }

  public int numberOfOdds(int[] a) {
    int result = 0;
    for (int i=0; i<a.length; i++) {
      result+=(a[i]%2);
    }
    return result;
  }

  public int numberOfEvens(int[] a) {
    int result = 0;
    for (int i=0; i<a.length; i++) {
      result+=-(a[i]%2-1);
    }
    return result;
  }

  public boolean isCharInString(char inputChar, String inputString) {
    for (int i=0; i<inputString.length(); i++) {
      if (inputString.charAt(i)==inputChar) {return true;}
    }
    return false;
  }

  public boolean isPalindrome(String inputString) {
    //madamimadam
    //poop
    for (int i=0; i<(inputString.length()/2); i++) {
      if (inputString.charAt(i) != inputString.charAt(inputString.length()-1-i)) {return false;}
    }
    return true;
  }

  public char firstNonRepeatingCharInString(String inputString) {
    String repeaters = "";
    for (int i=0; i<inputString.length(); i++) {
      if (isCharInString(inputString.charAt(i), inputString.substring(i+1))) {repeaters += inputString.charAt(i);}
    }
    for (int i=0; i<inputString.length(); i++) {
      if (!isCharInString(inputString.charAt(i), repeaters)) {return inputString.charAt(i);}
    }
    return (char) -1;
  }

  public char firstRepeatingCharInString(String inputString) {
    for (int i=0; i<inputString.length(); i++) {
      if (isCharInString(inputString.charAt(i), inputString.substring(i+1))) {return inputString.charAt(i);}
    }
    return (char) -1;
  }

  public char lastRepeatingCharInString(String inputString) {
    char result = (char) -1;
    for (int i=0; i<inputString.length(); i++) {
      if (isCharInString(inputString.charAt(i), inputString.substring(i+1))) {result = inputString.charAt(i);}
    }
    return result;
  }

  public int countDigitsInString(String inputString) {
    int result = 0;
    int number = 0;
    for (int i=0; i<inputString.length(); i++) {
      try {
        number = Integer.parseInt(inputString.charAt(i)+"");
        result++;
      } catch (NumberFormatException nfe) {}
    }
    return result;
  }

  public int countEvenDigitsInString(String inputString) {
    int result = 0;
    int number = 0;
    for (int i=0; i<inputString.length(); i++) {
      try {
        number = Integer.parseInt(inputString.charAt(i)+"");
        result+= (number+1)%2;
      } catch (NumberFormatException nfe) {}
    }
    return result;
  }

  public String[] reverseArray(String[] userInput) {
    String[] result = new String[userInput.length];
    for (int i=0; i<userInput.length; i++) {
      result[i]=userInput[userInput.length-1-i];
    }
    return result;
  }

  public String reverseString(String userInput) {
    String result = "";
    for (int i=0; i<userInput.length(); i++) {
      result +=userInput.charAt(userInput.length()-1-i);
    }
    return result;
  }

  public String[] splitString(String userInput, char splitChar) {
    return userInput.split(splitChar+"");
  }

  public static void swap(int j, int[] arr) {
    int temp = arr[j-1];
    arr[j-1] = arr[j];
    arr[j] = temp;
  }

  public static void swap(int j, String[] arr) {
    String temp = arr[j-1];
    arr[j-1] = arr[j];
    arr[j] = temp;
  }


  public static void sort(int[] arr) {
    int n = arr.length;
    for(int i = 0; i < n; i++) {
       if (i%(n/10)==0) { System.out.print("."); }
       for(int j = 1; j < n-i; j++) {
          if(arr[j-1] > arr[j]) {
             swap(j, arr);
          } // end if
       } // end inner loop
    } // end outer loop
    System.out.print("\n");
  } // end of method

  public static void sort(String[] arr) {
    int n = arr.length;
    for(int i = 0; i < n; i++) {
      if (i%(n/10)==0) { System.out.print("."); }
      for(int j = 1; j < n-i; j++) {
         if(arr[j-1].compareTo(arr[j]) > 0) {
            swap(j, arr); // swap method is shown in separate slide
         } // end if
      } // end inner loop
    }  // end outer loop
    System.out.print("\n");
  } // end method

  public boolean isPrime(int n) {
   if(n < 2)  { return false; }
   if(n == 2) { return true; }

   for(int i=2; i < Math.sqrt(n); i++) {
      if(n % i == 0) { return false; }
   }
   return true;
  } // end isPrime






}
