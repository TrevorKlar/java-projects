//Name: Trevor Klar
//Date: 12-1-18
//Application: Singleton
//Purpose: An example of a Singleton design pattern.

class Singleton {
    private int x;
    private static Singleton instance = new Singleton();
    private Singleton() { x=0; }

    public static Singleton getInstance() { return instance; }

    public static int getX() { return instance.x; }
    public static void setX(int n) { instance.x=n; }
}
