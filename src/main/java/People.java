public class People {
    Car car;
    public People(Car car){
        this.car=car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public boolean portCar(Car car,Port port)throws Exception{
        if(port.getIsPort()!=port.getSize()){
            car.setPortStatus(true);
            port.isPort++;
            return true;
        }
        else{
            throw new fullexception();

        }
    }

    public boolean getPortedCar(Port port) {
        if(car.getPortStatus()==true){
            car.setPortStatus(false);
            port.setIsPort(port.getIsPort()-1);
            return true;
        }
        else{
            return  false;
        }
    }
}
