//Driver.java
//Creates RunnableClassA object and calls the start()
//Creates RunnableClassB object and calls the start()

class Driver {
    public static void main(String[] args) {
        RunnableClassA rA = new RunnableClassA();
        RunnableClassB rB = new RunnableClassB();
        rA.start();
        rB.start();


    }
}
