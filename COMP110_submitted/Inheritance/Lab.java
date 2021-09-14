class Lab extends Dog {

   public Lab(String name) {
      // calling Dog's constructor
      // must be the first line!
      super(name);
   }
   
   // override bark method
   public String bark() {
      return "WOOF";
   }
   
   // default speed
   // default size
   // default color

}
