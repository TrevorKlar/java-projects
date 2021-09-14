//Name: Trevor Klar
//Date: 12-1-18
//Application: FacebookLite
//Purpose: An instance of this class is a facebook user, and is a member of a profile.

import java.io.*;

public class User extends Person implements IDisplayable {
    private String status; // status
    private boolean isAgeVisible; // toggles age visibility.

    public User(String fname, String lname, int age) {
        super(fname,lname,age);
        status = "";
        isAgeVisible = true;
    }
    @Override
    public void display() {
        Util.print("Name: "+getFName()+" "+getLName());
        if(isAgeVisible) {
            Util.print("Age: "+getAge());
        }
        Util.print("Status: "+getStatus());
    }
    @Override
    public void toggleVisibility() {
        isAgeVisible = !isAgeVisible;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void saveTo(PrintStream writer) {
        writer.println(getFName());
        writer.println(getLName());
        writer.println(getAge());
        writer.println(status);
        writer.println(isAgeVisible);
    }
}
