//Name: Trevor Klar
//Date: 11-25-2018
//Application: ShuttleLaunch
//Purpose: Some methods that call themselves.

class ShuttleLaunch {
   // 1000 milliseconds = 1 second
   final static int ONE_SEC = 1000;

   public static void main(String args[]) {
      System.out.print("Hello!\nWelcome to the Shuttle Launch!\n");
      for(int i = 10; i > -1 ; i--) {
         try {
            if (i>0) { System.out.println("T - "+ i); }
            if (i==2) { System.out.println("Ignition..."); }
            if (i==0) { System.out.println("We have a liftoff!"); }
            Thread.sleep(ONE_SEC);
         }
         catch (InterruptedException e) {
            System.out.println("InterruptedException!");
         }
      }
  }
}
