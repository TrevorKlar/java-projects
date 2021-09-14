//Name: Trevor Klar
//Date: 12-1-18
//Application: FacebookLite
//Purpose: An instance of this class is a friends list, and is a member of a profile.

import java.io.*;

public class Friend implements IDisplayable {
    private Stack friends; // The stack listing the elements of the friends list; the individual friends.
    private boolean isFriendsVisible;

    public Friend() {
        friends = new Stack(5);
        isFriendsVisible = true;
    }

    public void display() {
        if(isFriendsVisible) {
            Util.print("Friends: ");
            friends.print();
        }
    }
    public void toggleVisibility() {
        isFriendsVisible = !isFriendsVisible;
    }
    public void addFriend(String name) {
        boolean itWorked = !friends.isFull();
        friends.push(name);
        if (itWorked) { Util.print("Friend added."); }
    }
    public void removeFriend() {
        friends.pop();
    }
    public void reset() {
        friends.reset();
    }
    public void saveTo(PrintStream writer) {
        friends.saveTo(writer);
        writer.println(isFriendsVisible);
    }
    public boolean isEmpty() {
        return friends.isEmpty();
    }
}
