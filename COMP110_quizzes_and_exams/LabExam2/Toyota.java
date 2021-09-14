//Name: Trevor Klar
//Date: 11-17-2018
//Application: LabExam2
//Purpose: Calculate car prices

class Toyota extends Vehicle{

    Toyota(){
        super();
    }

    public double getTotalPrice() {
        return getBasePrice()-2000;
    }
}
