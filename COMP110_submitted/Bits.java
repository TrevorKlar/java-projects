//Name: Trevor Klar
//Date: 09-09-2018
//Application: Bits
//Purpose: To practice with bitwise operations in Java

import java.util.Scanner;
import javax.swing.JOptionPane;

class Bits {
  static int health = 100; //bits 0 to 7
  static int armor = 50; //bits 8 to 15
  static final int CHAINSAW = 1 << 16; // bit 16
  static final int PISTOL = 1 << 17; // bit 17
  static final int SHOTGUN = 1 << 18; // bit 18
  static final int CHAINGUN = 1 << 19; // bit 19
  static final int ROCKET_LAUNCHER = 1 << 20; // bit 20
  static final int PLASMA_GUN = 1 << 21; // bit 21
  static final int BFG_9000 = 1 << 22; // bit 22
  static int stats = health + (armor<<8) + PISTOL;

  // This method just returns a string of the binary representation of an int
  public static String binary(int userInput) {
    return String.format("%32s", Integer.toBinaryString(userInput)).replace(' ', '0');
  } // end binary

  // The & Operator (Bitwise AND)
  public static int equip(int item) {
    //   00000000000000000011001001100100 (100 health, 50 armor)
    // | 00000000000000100000000000000000 (pistol)
    //   --------------------------------
    //   00000000000000100011001001100100 (100 health, 50 armor, pistol)
    stats |= item ;
    return stats;
  } // end equip

  // The | Operator (Bitwise Inclusive OR)
  // The ~ Operator (Bitwise Compliment)
  public static int unequip(int item) {
    //  ~00000000000000001000000000000000 ~(pistol)
    // = --------------------------------
    //   11111111111111110111111111111111 (~pistol)

    //   00000000000000001001100101100100 (100 health, 50 armor, pistol)
    // & 11111111111111110111111111111111 (~pistol)
    // = --------------------------------
    //   00000000000000000001100101100100 (100 health, 50 armor)
    stats &= ~item ;
    return stats;
  } // end unequip

  // The ^ Operator (Bitwise Exclusive OR)
  public static int toggle(int item) {
    //   00000000000000000011001001100100 (100 health, 50 armor)
    // ^ 00000000000000100000000000000000 (pistol)
    //   --------------------------------
    //   00000000000000100011001001100100 (100 health, 50 armor, pistol)

    //   00000000000000101001100101100100 (100 health, 50 armor, pistol)
    // ^ 00000000000000100000000000000000 (pistol)
    // = --------------------------------
    //   00000000000000000001100101100100 (100 health, 50 armor)
    stats ^= item ;
    return stats;
  } // end equip

  // The << Operator (Left Shift)
  // The >>> Operator (Zero Fill Right Shift)
  // By the way, if I used the >> operator in this method, the sign bit (if negative) would propagate through the whole number, which is not the desired effect.
  public static void showStats() {
    health = (stats<<24)>>>24;
    armor = (stats<<16)>>>24;
    System.out.print("| Health " + health + " | Armor " + armor +" | ");
      if ((stats&CHAINSAW) != 0) {
        System.out.print("Chainsaw | ");
      } else {System.out.print("   ---   | ");}
      if ((stats&PISTOL) != 0) {
        System.out.print("Pistol | ");
      } else {System.out.print("  ---  | ");}
      if ((stats&SHOTGUN) != 0) {
        System.out.print("Shotgun | ");
      } else {System.out.print("  ---   | ");}
      if ((stats&CHAINGUN) != 0) {
        System.out.print("Chaingun | ");
      } else {System.out.print("  ---    | ");}
      if ((stats&ROCKET_LAUNCHER) != 0) {
        System.out.print("Rocket Launcher | ");
      } else {System.out.print("      ---       | ");}
      if ((stats&PLASMA_GUN) != 0) {
        System.out.print("Plasma Gun | ");
      } else {System.out.print("   ---     | ");}
      if ((stats&BFG_9000) != 0) {
        System.out.print("BFG 9000 | ");
      } else {System.out.print("  ---    | ");}
      System.out.println("");
      return;
  } // end showStats

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("");
    showStats();
    System.out.println("");
    System.out.println("===CHEAT MODE ACTIVATED===");
    System.out.println("Select items to add/remove from inventory (use negative numbers to remove):");
    System.out.println("11. Health");
    System.out.println("12. Armor");
    System.out.println("10. Chainsaw ");
    System.out.println("1. Pistol");
    System.out.println("2. Shotgun");
    System.out.println("3. Chaingun");
    System.out.println("4. Rocket Launcher");
    System.out.println("5. Plasma Gun");
    System.out.println("6. BFG 9000\n");
    System.out.println("96. toggle [debug]");
    System.out.println("97. equip [debug]");
    System.out.println("98. unequip [debug]");
    System.out.println("99. binary [debug]\n");
    System.out.println("9. quit cheat mode\n");
    first:
    while (true) {
      int userInput = sc.nextInt();
      switch (Math.abs(userInput)) {
        case 11: //Health
          health = (stats<<24)>>>24;
          System.out.println("You have " + health + " health. Enter new health value:");
          userInput = sc.nextInt();
          unequip(511);
          equip(userInput);
          health = (stats<<24)>>>24;
          System.out.println("Health set to " + health + ".\n");
          break;
        case 12: //Armor
          armor = (stats<<16)>>>24;
          System.out.println("You have " + armor + " armor. Enter new armor value:");
          userInput = sc.nextInt();
          unequip(511<<8);
          equip(userInput<<8);
          armor = (stats<<16)>>>24;
          System.out.println("Armor set to " + armor + ".\n");
          break;
        case 10: //Chainsaw
          if (userInput>0) {
            equip(CHAINSAW);
            System.out.println("Chainsaw equipped.\n");
          } else if (userInput<0) {
            unequip(CHAINSAW);
            System.out.println("Chainsaw unequipped.\n");
          }
          break;
        case 1: //Pistol
          if (userInput>0) {
            equip(PISTOL);
            System.out.println("Pistol equipped.\n");
          } else if (userInput<0) {
            unequip(PISTOL);
            System.out.println("Pistol unequipped.\n");
          }
          break;
        case 2: //Shotgun
          if (userInput>0) {
            equip(SHOTGUN);
            System.out.println("Shotgun equipped.\n");
          } else if (userInput<0) {
            unequip(SHOTGUN);
            System.out.println("Shotgun unequipped.\n");
          }
          break;
        case 3: // Chaingun
          if (userInput>0) {
            equip(CHAINGUN);
            System.out.println("Chaingun equipped.\n");
          } else if (userInput<0) {
            unequip(CHAINGUN);
            System.out.println("Chaingun unequipped.\n");
          }
          break;
        case 4: // Rocket Launcher
          if (userInput>0) {
            equip(ROCKET_LAUNCHER);
            System.out.println("Rocket Launcher equipped.\n");
          } else if (userInput<0) {
            unequip(ROCKET_LAUNCHER);
            System.out.println("Rocket Launcher unequipped.\n");
          }
          break;
        case 5: // Plasma Gun
          if (userInput>0) {
            equip(PLASMA_GUN);
            System.out.println("Plasma Gun equipped.\n");
          } else if (userInput<0) {
            unequip(PLASMA_GUN);
            System.out.println("Plasma Gun unequipped.\n");
          }
          break;
        case 6: // BFG 9000
          if (userInput>0) {
            equip(BFG_9000);
            System.out.println("BFG 9000 equipped.\n");
          } else if (userInput<0) {
            unequip(BFG_9000);
            System.out.println("BFG 9000 unequipped.\n");
          }
          break;
        case 96:
          System.out.println("Toggle:");
          sc = new Scanner(System.in);
          userInput = sc.nextInt();
          System.out.println(binary(stats) + "\n" + binary(userInput) + "\n^------------------------------\n" + binary(toggle(userInput)) + "\n");
          break;
        case 97:
          System.out.println("Equip:");
          sc = new Scanner(System.in);
          userInput = sc.nextInt();
          System.out.println(binary(stats) + "\n" + binary(userInput) + "\n|------------------------------\n" + binary(equip(userInput)) + "\n");
          break;
        case 98:
          System.out.println("Unequip:");
          sc = new Scanner(System.in);
          userInput = sc.nextInt();
          System.out.println(binary(stats) + "\n" + binary(~userInput) + "\n&------------------------------\n" + binary(unequip(userInput)) + "\n");
          break;
        case 99:
          System.out.println("Enter a number to convert to binary:");
          sc = new Scanner(System.in);
          userInput = sc.nextInt();
          System.out.println(userInput + ": \t " + binary(userInput) + "\n");
          break;
        case 9: // quit cheat mode
          System.out.println("Are you sure you want to quit? (y/n)");
          String userInputStr;
          sc = new Scanner(System.in);
          userInputStr = sc.nextLine();
          if (userInputStr.equals("y")) {
            System.out.println("Quitting.\n");
            showStats();
            System.out.println("");
            break first;
          } else {
            System.out.println("Quit canceled.\n");
          } //end if
          break;
        default:
          System.out.println("Select an option by entering the corresponding number. \n");
      } // end switch
    } // end while
    System.out.println("\n[debug] stats = " + stats + " = " + binary(stats));
  } // end main
} // end class
