//Name: Trevor Klar
//Date: 11-17-2018
//Application: LabExam2
//Purpose: Calculate car prices

class Driver {
    public static void main(String[] args) {
        Ferrari enzo1 = new Ferrari();
        Toyota camry1 = new Toyota();
        Vehicle currVeh;

        currVeh = enzo1;
        currVeh.init("Enzo", 600000);

        currVeh = camry1;
        currVeh.init("Camry", 30000);

        System.out.println(enzo1.getModel());
        System.out.println(enzo1.getBasePrice());
        System.out.println(enzo1.getTotalPrice());
        System.out.println();
        System.out.println(camry1.getModel());
        System.out.println(camry1.getBasePrice());
        System.out.println(camry1.getTotalPrice());
    }
}
