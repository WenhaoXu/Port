
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class gradleTest {
    @Test
    public void should_park_Car_When_Port_not_full() throws Exception {
        Car car =new Car();
        People people=new People(car);
        Port port= new Port(30);
        boolean result=  people.portCar(car,port);
        assertThat(result,is(true));


    }
    @Test
    public void should_Not_park_Car_When_Port_is_full() throws Exception {
        Car car =new Car();
        People people=new People(car);
        Port port= new Port(30);
        port.setIsPort(30);
        if(port.getIsPort()==30)
        {
        boolean result=    people.portCar(car,port);
        }
//        assertThat();
//        assertThat(result,is(false));


    }

    @Test
    public void should_get_Car_When_Port_have_car() throws Exception {
        Car car =new Car();
        People people=new People(car);
        Port port= new Port(30);
        boolean temp=  people.portCar(car,port);
        boolean result=  people.getPortedCar(port);
        assertThat(result,is(true));


    }
    @Test
    public void should_get_Car_fail_When_Port_have_no_car() throws Exception {
        Car car =new Car();
        People people=new People(car);
        Port port= new Port(30);
//        boolean temp=  people.portCar(car,port);
        boolean result=  people.getPortedCar(port);
        assertThat(result,is(false));


    }


}
