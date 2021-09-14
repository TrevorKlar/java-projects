//Name: Trevor Klar
//Date: 12-1-18
//Application: FacebookLite
//Purpose: An instance of this class is a profile, and is a member of fbl.

import java.io.*;

public class Profile {
    private User u; // User account data and status
    private Friend f; // Friends list
    private Post p; // Post history

    public Profile(String fname, String lname, int age) {
        u = new User(fname, lname, age);
        f = new Friend();
        p = new Post();
    }
    public void printProfile() {
        u.display();
        f.display();
        p.display();
        Util.print();
    }
    public void setStatus(String status) {
        u.setStatus(status);
    }
    public void togglePosts() {
        p.toggleVisibility();
    }

    public User getUser() {
        return u;
    }

    public Friend getFriend() {
        return f;
    }

    public Post getPost() {
        return p;
    }

    public void saveTo(PrintStream writer) {
        writer.println("//User");
        u.saveTo(writer);
        writer.println("//Friends");
        f.saveTo(writer);
        writer.println("//Posts");
        p.saveTo(writer);
    }
}
