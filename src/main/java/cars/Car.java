package cars;

import components.CarType;
import components.Door;
import components.Tyres;

import java.util.HashMap;

public abstract class Car {

        private String make;
        private String model;
        private double price;
        private String colour;
        private int year;
        CarType carType;
        Tyres tyres;
        Door door;
        private HashMap<String, String> damage;

        public Car(String make, String model, double price, String colour, int year, CarType carType, Tyres tyres, Door door){
                this.make = make;
                this.model = model;
                this.price = price;
                this.colour = colour;
                this.year = year;
                this.carType = carType;
                this.tyres = tyres;
                this.door = door;
        }


        public String getMake() {
                return make;
        }

        public String getModel() {
                return model;
        }

        public double getPrice() {
                return price;
        }

        public String getColour() {
                return colour;
        }

        public int getYear() {
                return year;
        }

        public CarType getCarType() {
                return carType;
        }

        public Tyres getTyres() {
                return tyres;
        }

        public Door getDoor() {
                return door;
        }

        public HashMap<String, String> getDamage(){
                return damage;
        }
}
