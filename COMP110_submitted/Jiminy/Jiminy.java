//Name: Trevor Klar
//Date: 09-22-2018
//Application: Jiminy
//Purpose: To make a terminal-based assistant
import java.util.Calendar;
import java.text.SimpleDateFormat;

class Jiminy {

  final private static String HELP = "Usage: java Jiminy [OPTION]...\nDoes a few helpful things around the terminal.\n\nMandatory arguments to long options are mandatory for short options too.\n  -d, --date      Prints the date to System.out\n  -t, --time      Prints the time to System.out\n  -p, --proc      Prints the available processors to System.out\n  -m  --freemem   Prints the amount of free memory to System.out\n  -x, --maxmem    Prints the amount of maximum memory to System.out\n  -M  --totmem    Prints the amount of total memory to System.out\n";

  public static boolean isStringInArray(String[] strArray) {
    for (int i = 0; i < strArray.length; i++) {
      if (!strArray[i].equals("")) {return true;}
    } // end for
    return false;
  } // end isStringInArray

  public static void readArgChar(char arg) {
    switch (arg) {
      case 'd':
        String date = new SimpleDateFormat("MM-dd-yyyy").format(Calendar.getInstance().getTime());
        System.out.println(date);
        break;
      case 't':
        String time = new SimpleDateFormat("hh:mm").format(Calendar.getInstance().getTime());
        System.out.println(time);
        break;
      case 'p':
        /* Total number of processors or cores available to the JVM */
        System.out.println("Available processors (cores): " + Runtime.getRuntime().availableProcessors());
        break;
      case 'm':
        /* Total amount of free memory available to the JVM */
        System.out.println("Free memory (bytes): " + Runtime.getRuntime().freeMemory());
        break;
      case 'x':
        /* This will return Long.MAX_VALUE if there is no preset limit */
        long maxMemory = Runtime.getRuntime().maxMemory();
        /* Maximum amount of memory the JVM will attempt to use */
        System.out.println("Maximum memory (bytes): " + (maxMemory == Long.MAX_VALUE ? "no limit" : maxMemory));
        break;
      case 'M':
        /* Total memory currently in use by the JVM */
        System.out.println("Total memory (bytes): " + Runtime.getRuntime().totalMemory());
        break;
      default:
        System.out.println("I didn't understand the argument " + arg +". See help text below. \n");
      case 'h':
        /* Prints the help file */
        System.out.println(HELP);
        break;
    } // end switch
  } // readArgChar

  public static void readArgString(String arg) {
    switch (arg) {
      case "--date":
        String date = new SimpleDateFormat("MM-dd-yyyy").format(Calendar.getInstance().getTime());
        System.out.println(date);
        break;
      case "--time":
        String time = new SimpleDateFormat("hh:mm").format(Calendar.getInstance().getTime());
        System.out.println(time);
        break;
      case "--proc":
        /* Total number of processors or cores available to the JVM */
        System.out.println("Available processors (cores): " + Runtime.getRuntime().availableProcessors());
        break;
      case "--freemem":
        /* Total amount of free memory available to the JVM */
        System.out.println("Free memory (bytes): " + Runtime.getRuntime().freeMemory());
        break;
      case "--maxmem":
        /* This will return Long.MAX_VALUE if there is no preset limit */
        long maxMemory = Runtime.getRuntime().maxMemory();
        /* Maximum amount of memory the JVM will attempt to use */
        System.out.println("Maximum memory (bytes): " + (maxMemory == Long.MAX_VALUE ? "no limit" : maxMemory));
        break;
      case "--totmem":
        /* Total memory currently in use by the JVM */
        System.out.println("Total memory (bytes): " + Runtime.getRuntime().totalMemory());
        break;
      default:
        System.out.println("I didn't understand the argument " + arg +". See help text below. \n");
      case "--help":
        /* Prints the help file */
        System.out.println(HELP);
        break;
    } // end switch
  } // end readArgString

  public static void checkArgType(String arg) {
    if ((arg.charAt(0)=='-') && (arg.charAt(1)=='-')) { // check for --long-type flag
      readArgString(arg);
    } else if ((arg.charAt(0)=='-') && (arg.charAt(1)!='-')) { // check for -s short type flag
      for (int i=1; i<arg.length(); i++) {
        readArgChar(arg.charAt(i));
      } // end for
    } else { // give error for no flag type
      readArgString(arg);
    } // end if/else
  } // end checkArgType

  public static void main(String[] args) {
    // no args
    if (isStringInArray(args) == false) {
      System.out.println(HELP);
    } // end if
    //read args
    for (int i = 0; i < args.length; i++) {
      checkArgType(args[i]);
    } // end for
  } // end main
} // end class
