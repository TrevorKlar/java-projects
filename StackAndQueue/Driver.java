//Name: Trevor Klar
//Date: 09-29-2018
//Application: Stack and Queue
//Purpose: The driver to use the Stack and Queue classes

class Driver {
  public static void main(String[] args) {
    System.out.println("=====Stack=====");
    System.out.println("Stack myStack = new Stack();");
    Stack myStack = new Stack();
    System.out.println("myStack.isEmpty() = " + myStack.isEmpty());
    //System.out.println("myStack.pop() = " + myStack.pop());
    myStack.pop();
    for (int i=0; i<13; i++) {myStack.push(i);}
    myStack.search(7);
    myStack.peek();
    //System.out.println("myStack.pop() = " + myStack.pop());
    myStack.pop();
    myStack.peek();
    System.out.println("myStack.isEmpty() = " + myStack.isEmpty());
    for (int i=0; i<15; i++) {myStack.pop();}
    System.out.println();

    System.out.println("=====Queue=====");
    System.out.println("Queue myQueue = new Queue();");
    Queue myQueue = new Queue();
    myQueue.peek();
    myQueue.peek();
    myQueue.poll();
    myQueue.poll();
    for (int i=0; i<13; i++) {myQueue.add(i);}
    myQueue.peek();
    myQueue.poll();
    myQueue.peek();
    for (int i=0; i<15; i++) {myQueue.poll();}
    myQueue.peek();

    // NOTE TO SELF: CHANGE STACK TO STRING TYPE
  }
}
