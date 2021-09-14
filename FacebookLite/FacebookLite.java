//Name: Trevor Klar
//Date: 12-1-18
//Application: FacebookLite
//Purpose: The driver class for FacebookLite

import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;

public class FacebookLite {
    private Scanner sc;
    private Profile[] profiles;
    private int idx; //index for profiles array
    private int nop; //number of profiles
    private int opt; //option

    /*=================================
    |   Can you find my easter egg?   |
    =================================*/

    public FacebookLite() {
        sc = new Scanner(System.in);
        idx = -1;
        nop = 0;
        profiles = new Profile[5];
    }

    public void createProfile(String fname,String lname,int age) {
        if(idx<profiles.length-1) {
            Profile p = new Profile(fname,lname,age);
            idx++;
            profiles[idx] = p;
            nop++;
            Util.print("Profile created!\n");
        }
        else {
            Util.print("\t\t\t\tERROR: No room to create a new profile.");
        }
    }

    public void deleteCurrentProfile() {
        if(nop>0) {
            for (int i=idx; i<nop-1; i++) {
                profiles[i]=profiles[i+1];
            }
            nop--;
            idx--;
            Util.print("Profile " + (idx+1) + " deleted.\nSwitched to profile " + idx + ".\n");
        }
        else {
            Util.print("\t\t\t\tERROR: There are no profiles to delete.");
        }
    }

    public void deleteLastProfile() {
        profiles[nop-1].setStatus("");
        profiles[nop-1].getUser().setAge(0);
        profiles[nop-1].getUser().setFName("");
        profiles[nop-1].getUser().setLName("");
        profiles[nop-1].getFriend().reset();
        profiles[nop-1].getPost().reset();
        nop--;
        Util.print("Profile " + nop + " deleted.\n");
        if (idx>=nop) { idx--; }
    }

    public void wipeFacebookData() {
        try {
            PrintStream writer = new PrintStream( new File("FacebookLite.data"));
            writer.print("0"); // When loading, fbl reads the final line to determine how many profiles to load. 
            writer.close();
        }
        catch (IOException e) { System.out.println(e); }
    }

    public void saveAllProfiles() {
        try {
            PrintStream writer = new PrintStream( new File("FacebookLite.data"));
            for (int i=0; i<nop; i++) {
                writer.println("//Profile "+i);
                profiles[i].saveTo(writer);
            }
            writer.println("//Number of Profiles\n" + nop);
            writer.close();
        }
        catch (IOException e) { System.out.println(e); }
    }

    public void loadAllProfiles(){
        String[] fblData = Util.readFile("FacebookLite.data");
        int nopToLoad;
        try {
            nopToLoad = Integer.parseInt(fblData[fblData.length-1]);
        } catch (NumberFormatException nfe) {
            Util.print("\nFacebookLite.data file is corrupt. Deleting everything and trying again...\n");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ie) {}
            wipeFacebookData();
            nopToLoad = 0;
        }
        for (int i=0; i<nopToLoad; i++) {
            createProfile(fblData[i*17+0], fblData[i*17+1], Integer.parseInt(fblData[i*17+2]));
            profiles[idx].setStatus(fblData[i*17+3]);
            if (fblData[i*17+4].equals("false")) { profiles[idx].getUser().toggleVisibility(); }
            for (int j=0; j<5; j++) { if (!fblData[i*17+5+j].equals("")) { profiles[idx].getFriend().addFriend(fblData[i*17+5+j]); } }
            if (fblData[i*17+10].equals("false")) { profiles[idx].getFriend().toggleVisibility(); }
            for (int j=0; j<5; j++) { if (!fblData[i*17+11+j].equals("")) { profiles[idx].getPost().addPost(fblData[i*17+11+j]); } }
            if (fblData[i*17+16].equals("false")) { profiles[idx].getPost().toggleVisibility(); }
        }
    }



    public static void main(String[] args) {
        FacebookLite fbl = new FacebookLite();
        fbl.loadAllProfiles();
        Util.clearScreen();
        System.out.println("\nWelcome to Facebook Lite!\n\n0-------------------Exit\n1---------Create profile\n2----Delete last profile\n3---------Switch profile\n4----------Print profile\n5-------------Add friend\n6-----Remove last friend\n7-----Remove all friends\n8---------------Add post\n9-------Remove last post\n10------Remove all posts\n11------------Toggle age\n12--------Toggle friends\n13----------Toggle posts\n14---------Change status\n15---Delete all profiles\n");
        while(true) {
            try {
                Util.print("Make a selection:");
                String userInput = fbl.sc.nextLine();
                Util.writeLog(userInput);
                if (userInput.equals("iddqd")) { userInput="8696"; }
                fbl.opt = Integer.parseInt(userInput);
            }
            catch (NumberFormatException nfe) {
                fbl.opt=-1;
                Util.print("\t\t\t\tERROR: Invalid selection.\n");
            }
            Util.clearScreen();
            System.out.println("\nWelcome to Facebook Lite!\n\n0-------------------Exit\n1---------Create profile\n2----Delete last profile\n3---------Switch profile\n4----------Print profile\n5-------------Add friend\n6-----Remove last friend\n7-----Remove all friends\n8---------------Add post\n9-------Remove last post\n10------Remove all posts\n11------------Toggle age\n12--------Toggle friends\n13----------Toggle posts\n14---------Change status\n15---Delete all profiles\n");
            switch(fbl.opt) {
                case 0: //exit
                    if (fbl.nop!=0) { fbl.saveAllProfiles(); }
                    Util.print("Goodbye");
                    return;
                case 1: //create profile
                    String fname;
                    String lname;
                    int age;
                    do {
                        Util.print("Please enter your first name");
                        fname = fbl.sc.nextLine();
                        Util.writeLog(fname);
                        if (fname.equals("")) { continue; }
                        else { break; }
                    } while (true);
                    do {
                        Util.print("Please enter your last name");
                        lname = fbl.sc.nextLine();
                        Util.writeLog(lname);
                        if (lname.equals("")) { continue; }
                        else { break; }
                    } while (true);
                    age = -1;
                    do {
                        Util.print("Please enter your age");
                        try {
                            String userInput = fbl.sc.nextLine();
                            Util.writeLog(userInput);
                            age = Integer.parseInt(userInput);
                            if (age <1 || age >120) {
                                age = -1;
                                Util.print("\t\t\t\tERROR: Please enter your real age.\n");
                            }
                        }
                        catch (NumberFormatException nfe) {
                            Util.print("\t\t\t\tERROR: Invalid age. Please enter a number.\n");
                        }
                    } while (age == -1);
                    fbl.createProfile(fname,lname,age);
                break;
                case 2: //delete last profile
                    if (fbl.nop!=0) { fbl.deleteLastProfile(); }
                    else { Util.print("\t\t\t\tERROR: There are no profiles to delete.\n"); }
                break;
                case 3:  //switch profiles
                    if (fbl.nop!=0) {
                        do {
                            try {
                                int switchProf;
                                for (int i=0; i<fbl.nop; i++) { Util.print("User "+ i + ": " + fbl.profiles[i].getUser().getFName() + " " + fbl.profiles[i].getUser().getLName() + "\n"); }
                                Util.print("Enter a profile number, from 0 to " + (fbl.nop-1));
                                String userInput = fbl.sc.nextLine();
                                Util.writeLog(userInput);
                                switchProf = Integer.parseInt(userInput);
                                if(0<=switchProf && switchProf<fbl.nop) {
                                    fbl.idx=switchProf;
                                    Util.print("Profile switched.");
                                    break; //valid input, breaks the retry loop
                                } else {
                                    Util.print("\t\t\t\tERROR: Invalid number. Valid profile numbers are integers from 0 to " + (fbl.nop-1) + ".\n");
                                    continue;
                                }
                            }
                            catch (NumberFormatException nfe) {
                                Util.print("\t\t\t\tERROR: Invalid profile. Please enter a number.\n");
                                continue;
                            }
                        } while (true);
                    }
                    else if (fbl.nop==0) { Util.print("\t\t\t\tERROR: No profiles.\n"); }
                break;
                case 4:  //print profile
                    if (fbl.nop!=0) { fbl.profiles[fbl.idx].printProfile(); }
                    else if (fbl.nop==0) { Util.print("\t\t\t\tERROR: No profiles.\n"); }
                break;
                case 5:  //add friend
                    if (fbl.nop>0 && fbl.idx>=0 && fbl.idx<fbl.nop) {
                        String name;
                        do {
                            Util.print("Enter friend's name:");
                            name = fbl.sc.nextLine();
                            Util.writeLog(name);
                            if (name.equals("")) { Util.print("You didn't enter a name.\n"); }
                        } while (name.equals(""));
                        fbl.profiles[fbl.idx].getFriend().addFriend(name);
                    }
                    else if (fbl.nop==0) { Util.print("\nERROR: No profiles.\n"); }
                    else if (fbl.nop>0) { Util.print("\nERROR: Select a profile.\n"); }
                break;
                case 6:  //remove last friend
                    if (fbl.nop==0) { Util.print("\t\t\t\tERROR: No profiles.\n"); }
                    else if (fbl.profiles[fbl.idx].getFriend().isEmpty()) { Util.print("\t\t\t\tERROR: No friends.\n"); }
                    else {
                        fbl.profiles[fbl.idx].getFriend().removeFriend();
                        Util.print("Friend removed.");
                    }
                break;
                case 7:  //remove all friends
                    if (fbl.nop==0) { Util.print("\t\t\t\tERROR: No profiles.\n"); }
                    else if (fbl.profiles[fbl.idx].getFriend().isEmpty()) { Util.print("\t\t\t\tERROR: No friends.\n"); }
                    else {
                        fbl.profiles[fbl.idx].getFriend().reset();
                        Util.print("All friends removed.");
                    }
                break;
                case 8:  //add post
                    if (fbl.nop>0 && fbl.idx>=0 && fbl.idx<fbl.nop) {
                        Util.print("Say something:");
                        String post = fbl.sc.nextLine();
                        Util.writeLog(post);
                        fbl.profiles[fbl.idx].getPost().addPost(post);
                    }
                    else if (fbl.nop==0) { Util.print("\nERROR: No profiles.\n"); }
                    else if (fbl.nop>0) { Util.print("\nERROR: Select a profile.\n"); }
                break;
                case 9:  //remove last post
                    if (fbl.nop==0) { Util.print("\t\t\t\tERROR: No profiles.\n"); }
                    else if (fbl.profiles[fbl.idx].getPost().isEmpty()) { Util.print("\t\t\t\tERROR: No posts.\n"); }
                    else {
                        fbl.profiles[fbl.idx].getPost().removePost();
                        Util.print("Last post removed.");
                    }
                break;
                case 8696: Util.iddqd();
                break;
                case 10: //remove all posts
                    if (fbl.nop==0) { Util.print("\t\t\t\tERROR: No profiles.\n"); }
                    else if (fbl.profiles[fbl.idx].getPost().isEmpty()) { Util.print("\t\t\t\tERROR: No posts.\n"); }
                    else {
                        fbl.profiles[fbl.idx].getPost().reset();
                        Util.print("All posts removed.");
                    }
                break;
                case 11: //toggle age
                    if (fbl.nop!=0) {
                        fbl.profiles[fbl.idx].getUser().toggleVisibility();
                        Util.print("isAgeVisible toggled.");
                    }
                    else if (fbl.nop==0) { Util.print("\t\t\t\tERROR: No profiles.\n"); }
                break;
                case 12: //toggle friends
                    if (fbl.nop!=0) {
                        fbl.profiles[fbl.idx].getFriend().toggleVisibility();
                        Util.print("isFriendsVisible toggled.");
                    }
                    else if (fbl.nop==0) { Util.print("\t\t\t\tERROR: No profiles.\n"); }
                break;
                case 13: //toggle posts
                    if (fbl.nop!=0) {
                        fbl.profiles[fbl.idx].getPost().toggleVisibility();
                        Util.print("isPostsVisible toggled.");
                    }
                    else if (fbl.nop==0) { Util.print("\t\t\t\tERROR: No profiles.\n"); }
                break;
                case 14: //change status
                    if (fbl.nop!=0) {
                        Util.print("Enter a status:");
                        String status = fbl.sc.nextLine();
                        Util.writeLog(status);
                        fbl.profiles[fbl.idx].setStatus(status);
                        Util.print("Status set.");
                    }
                    else if (fbl.nop==0) { Util.print("\t\t\t\tERROR: No profiles.\n"); }
                break;
                case 15: //delete all profiles
                    if (fbl.nop==0) {
                        Util.print("\t\t\t\tERROR: There are no profiles to delete.\n");
                        break;
                    }
                    Util.print("ARE YOU SURE? (y/n)\n");
                    String deleteall = fbl.sc.nextLine();
                    Util.writeLog(deleteall);
                    if (deleteall.charAt(0)=='y') {
                        while (fbl.nop>0) {
                            fbl.deleteLastProfile();
                        }
                    } else { Util.print("Canceling. No profiles were deleted."); }
                    if (fbl.nop==0) {
                        //Files.deleteIfExists("FacebookLite.data");
                        fbl.wipeFacebookData();
                        Util.print("All profiles deleted.");
                    }
                break;
            }
        }
    }
}
