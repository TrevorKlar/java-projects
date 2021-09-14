//Name: Trevor Klar
//Date: 11-17-2018
//Application: LabExam2
//Purpose: Calculate car prices

class Ferrari extends Vehicle{

    Ferrari(){
        super();
    }

    public double getTotalPrice() {
        return getBasePrice()+5000;
    }
}
