import cars.Diesel;
import cars.Electric;
import cars.Hybrid;
import cars.Petrol;
import components.CarType;
import components.Door;
import components.Tyres;
import customer.Customer;
import dealership.Dealership;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Diesel dieselCar;
    Petrol petrolCar;
    Hybrid hybridCar;
    Electric electricCar;
    Customer customer;
    Customer customer2;

    @Before
    public void setUp(){
        dieselCar = new Diesel("Ford", "Focus", 3000, "silver", 2009, CarType.HATCHBACK, Tyres.SLICKS, Door.FIVE);
        petrolCar = new Petrol("Volvo", "V60", 9000, "blue", 2015, CarType.ESTATE, Tyres.OFFROAD, Door.FIVE);
        hybridCar = new Hybrid("Toyota", "Prius", 4000, "pink", 2006, CarType.HATCHBACK, Tyres.SLICKS, Door.THREE);
        electricCar = new Electric("Nissan", "Leaf", 1200000, "green", 2022, CarType.HATCHBACK, Tyres.SNOW, Door.THREE);
        dealership = new Dealership(100000);
        customer = new Customer("Mike Hunt", 50);
        customer2 = new Customer("Harry Hunt", 10000);
    }

    @Test
    public void hasTill(){
        assertEquals(100000, dealership.getTill(), 0.0);
    }

    @Test
    public void canGetCars(){
        dealership.addCarToGarage(dieselCar);
        dealership.addCarToGarage(petrolCar);
        dealership.addCarToGarage(hybridCar);
        dealership.addCarToGarage(electricCar);
        assertEquals(4, dealership.getStock().size());
    }

    @Test
    public void canBuyCar(){
        dealership.buyCar(dieselCar);
        assertEquals(1, dealership.getStock().size());
        assertEquals(97000, dealership.getTill(), 0.0);
    }

    @Test
    public void canSellToCustomer(){
        dealership.addCarToGarage(petrolCar);
        dealership.addCarToGarage(dieselCar);
        dealership.sellCar(customer2, petrolCar);
        assertEquals(1000, customer2.getMoney(), 0.0);
        assertEquals(109000, dealership.getTill(), 0.0);
        assertEquals(1, customer2.getCars().size());
        assertEquals(1, dealership.getStock().size());
    }

    @Test
    public void canAddDamage(){
        
    }

}
