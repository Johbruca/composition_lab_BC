package dealership;

import cars.Car;
import cars.Petrol;
import customer.Customer;

import java.util.ArrayList;

public class Dealership {

    private double till;
    private ArrayList<Car> stock;


    public Dealership(double till){
        this.till = till;
        this.stock = new ArrayList<>();
    }

    public double getTill() {
        return till;
    }

    public ArrayList<Car> getStock() {
        return stock;
    }

    public void addCarToGarage(Car car){
        stock.add(car);
    }

    public void addMoney(double amount){
        this.till += amount;
    }

    public void removeMoney(double amount){
        this.till -= amount;
    }

    public void buyCar(Car car){
        double carPrice = car.getPrice();
        if (carPrice <= this.till){
            removeMoney(carPrice);
            addCarToGarage(car);

        }
    }

    public void sellCar(Customer customer, Car car) {
        double carPrice = car.getPrice();
        if (customer.canAffordCar(car)){
            customer.removeMoney(carPrice);
            addMoney(carPrice);
            stock.remove(car);
            customer.addCarToCustomer(car);
        }
    }
}
