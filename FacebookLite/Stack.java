//Name: Trevor Klar
//Date: 12-1-18
//Application: FacebookLite
//Purpose: A Stack has mechanisms for adding, reading, and removing list elements.
//         Post and Friend each has a Stack for manipulating their respective elements.

import java.io.*;

public class Stack {
    private int size;
    private int top; //master index for our array
    private String[] stack;

    public Stack(int size) {
        this.size = size;
        stack = new String[size];
        top = -1;
        for(int i=0; i<size; i++) { stack[i]=""; }
    }
    public int getSize() {
        return size;
    }
    public int getTop() {
        return top;
    }
    public boolean isEmpty() {
        return (top==-1);
    }
    public boolean isFull() {
        return (top==size-1);
    }
    public void push(String item) {
        if(isFull()) {
            Util.print("The stack is full");
        }
        else {
            stack[++top] = item;
        }
    }
    public String pop() {
        if(isEmpty()){
            Util.print("The stack is empty");
            return "";
        }
        else {
            return stack[top--];
        }
    }
    public void reset() {
        for(int i=0; i<getSize(); i++) {
            stack[i] = "";
        }
        top=-1;
    }
    public void print() {
        for(int i=0; i<=getTop(); i++) {
            Util.print(stack[i]);
        }
    }
    public void saveTo(PrintStream writer) {
        for(int i=0; i<=(getSize()-1); i++) {
            writer.println(stack[i]);
        }
    }
}
