
// Java program to illustrate the
// concept of Abstraction
class Test {
  public static void main(String[] args) {
    String[] myStringArray = new String[5];

    for (int i = 0; i<5; i++) {

      myStringArray[i]="string" + i;

      System.out.println(myStringArray[i]);

    }


  }
}
