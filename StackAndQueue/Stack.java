//Name: Trevor Klar
//Date: 09-29-2018
//Application: Stack and Queue
//Purpose: Methods for the Stack class I made

class Stack {
  //private int max;
  private final int MAX_SIZE = 10;
  private int top;
  private int[] stack = new int[MAX_SIZE];
  //int[] stack = new int[max];

  public Stack() {
    for (int i=0; i<MAX_SIZE; i++) {
      stack[i] = 0;
    } // end for
    top = -1;
  }

  public void push(int item) {
    if (isFull()) {
      System.out.println("ERROR: Cannot push; stack full");
      return;
    } else {
    stack[++top] = item;
    System.out.println(stack[top] + " added to stack at location " + top);
    }
  }

  public int pop() {
    if (isEmpty()) {
      System.out.println("ERROR: Cannot pop; stack empty");
      return Integer.MIN_VALUE;
    } else {
    System.out.println(stack[top] + " popped from stack at location " + (top));
    return stack[top--];
    }
  }

  public void peek() {
    if (isEmpty()) {
      System.out.println("ERROR: Cannot peek; stack empty");
      return;
    } else {
      System.out.println(stack[top] + " is on top of the stack at location " + (top));
    }
  }

  public boolean isEmpty() {
    return (top==-1);
  }

  public boolean isFull() {
    return (top==(MAX_SIZE-1));
  }

  public void search(int item) {
    for (int i=top; i>0; i--) {
      //System.out.print(stack[i]);
      if (item == stack[i]) {
        System.out.println(item + " found at " + i);
        return;
      } // end if
    } // end for
    System.out.println("item not found");
    return;
  }

} // end Stack
