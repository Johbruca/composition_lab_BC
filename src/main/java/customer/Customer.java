package customer;
import cars.Car;
import cars.Petrol;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double money;
    private ArrayList<Car> cars;


    public Customer(String name, double money){
        this.name = name;
        this.money = money;
        this.cars = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }
    public void addCarToCustomer(Car car) {
        cars.add(car);
    }

    public void addMoney(double amount){
        this.money += amount;
    }

    public void removeMoney(double amount){
        this.money -= amount;
    }

    public void buyCar(Car car){
        double carPrice = car.getPrice();
        if (carPrice <= this.money){
            removeMoney(carPrice);
            addCarToCustomer(car);

        }
    }


    public boolean canAffordCar(Car car) {
        double carPrice = car.getPrice();
        if (carPrice <= this.money){
            return true;
        }
        else{
            return false;
        }
    }
}
