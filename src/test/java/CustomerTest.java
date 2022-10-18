import cars.Car;
import cars.Petrol;
import components.CarType;
import components.Door;
import components.Tyres;
import customer.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Petrol car;

    @Before
    public void setUp(){
        customer = new Customer("Bill Bailey", 10000);
        car = new Petrol("BMW", "3 series", 7000, "blue", 2016, CarType.SALOON, Tyres.SLICKS, Door.THREE);
    }

    @Test
    public void hasName(){
        assertEquals("Bill Bailey", customer.getName());
    }


    @Test
    public void hasMoney(){
        assertEquals(10000, customer.getMoney(), 0.0);
    }

    @Test
    public void canAddCarToCustomer(){
        customer.addCarToCustomer(car);
        assertEquals(1, customer.getCars().size());
    }

    @Test
    public void canBuyCar(){
        customer.buyCar(car);
        assertEquals(1, customer.getCars().size());
        assertEquals(3000, customer.getMoney(), 0.0);
    }



}
