//Name: Trevor Klar
//Date: 11-17-2018
//Application: LabExam2
//Purpose: Calculate car prices

abstract class Vehicle {
    private String model;
    private double basePrice;

    Vehicle() {
        this.model="";
        this.basePrice=-1;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getModel() {
        return model;
    }

    public void init(String model, double basePrice) {
        this.model=model;
        this.basePrice=basePrice;
    }

    abstract double getTotalPrice();
}
