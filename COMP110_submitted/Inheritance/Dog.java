public class Dog
{
   private String name;
   private final int speed = 5; // default speed in mph
   private final String size = "Normal"; // default size
   private final String color = "White"; // default color

   public Dog() {
      name = "Chance";
   }

   public Dog(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public String bark() {
      return "Woof";
   }

   public String getColor() {
      return color;
   }

   public int getSpeed() {
      return speed;
   }

   public String getSize() {
      return size;
   }
}
