package challenge;

import java.lang.Override;

class Porche extends  CarPoly{

Porche(boolean engine,String name,int noOfwheels,int noOfCylinders,double bootSpace) {
    super(engine, name, noOfwheels, noOfCylinders, bootSpace);
}

    @Override
    public String accelerate() {
        return "Porsche -> accelerate:";
    }

    @Override
    public String brake() {
        return  "Porsche-> brake:";
    }

    @Override
    public String startEngine() {
        return "Porsche -> brake:";
    }
}



