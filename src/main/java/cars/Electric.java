package cars;

import components.CarType;
import components.Door;
import components.Tyres;

public class Electric extends Car{
    public Electric(String make, String model, double price, String colour, int year, CarType carType, Tyres tyres, Door door) {
        super(make, model, price, colour, year, carType, tyres, door);
    }



}
