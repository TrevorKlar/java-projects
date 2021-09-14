//Name: Trevor Klar
//Date: 12-1-18
//Application: Singleton
//Purpose: An example of a Singleton design pattern.

class Driver {
    public static void main(String[] args) {
        //Singleton s = new Singleton(); // error
        Singleton sObj1;
        sObj1 = Singleton.getInstance();
        sObj1.setX(7);
        Singleton sObj2 = Singleton.getInstance();
        sObj2.setX(77);

        // addresses should match (same object in memory)
        System.out.println(sObj1);
        System.out.println(sObj2);
        System.out.println(sObj1.getX());
        System.out.println(sObj2.getX());

    }
}
