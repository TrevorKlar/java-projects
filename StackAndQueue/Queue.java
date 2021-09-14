//Name: Trevor Klar
//Date: 09-29-2018
//Application: Stack and Queue
//Purpose: Methods for the Queue class I made

class Queue {
  private final int MAX_SIZE = 10;
  private int front;
  private int rear;
  private int[] queue = new int[MAX_SIZE+1];

  public Queue() {
    for (int i=0; i<MAX_SIZE; i++) {queue[i] = 0;}
    front = -1;
    rear = -1;
  }

  public boolean isEmpty() {
    return (front==-1);
  }

  public boolean isFull() {
    return (rear==(MAX_SIZE-1));
  }

  public void add(int item) {
    if (isFull()) {System.out.println("ERROR: queue is full");return;}
    if (isEmpty()) {front++;}
    queue[++rear] = item;
    System.out.println(queue[rear] + " added to queue at location " + rear);
  }

  public void poll() {
    if (isEmpty()) {System.out.println("ERROR: queue is empty");return;}
    System.out.println(queue[front] + " polled from queue at location " + front);
    if (front==rear) {front = -1;rear = -1;return;}
    else {front++;}
  }

  public void peek() {
    if (isEmpty()) {System.out.println("ERROR: queue is empty");return;}
    System.out.println(queue[front] + " is in the front of the queue at " + front);
  }

}// end Queue
