//Name: Trevor Klar
//Date: 12-1-18
//Application: FacebookLite
//Purpose: An instance of this class is a post history, and is a member of a profile.

import java.io.*;

public class Post implements IDisplayable {
    private Stack posts; // The stack listing the elements of the post history; the individual posts.
    private boolean isPostsVisible;

    public Post() {
        posts = new Stack(5);
        isPostsVisible = true;
    }

    @Override
    public void display() {
        if(isPostsVisible) {
            Util.print("Posts: ");
            posts.print();
        }
    }

    @Override
    public void toggleVisibility() {
        isPostsVisible = !isPostsVisible;
    }

    public void addPost(String name) {
        boolean itWorked = !posts.isFull();
        posts.push(name);
        if (itWorked) { Util.print("Post added."); }
    }
    public void removePost() {
        posts.pop();
    }
    public void reset() {
        posts.reset();
    }
    public void saveTo(PrintStream writer) {
        posts.saveTo(writer);
        writer.println(isPostsVisible);
    }
    public boolean isEmpty() {
        return posts.isEmpty();
    }
}
