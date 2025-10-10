//02724205101138

class Vehicle {
 
    void drive() {
        System.out.println("Driving a vehicle");
    }

   
    public static void main(String[] args) {
        
        Car c = new Car();
        c.drive(); 
    }
}


class Car extends Vehicle {
  
    @Override
    void drive() {
        System.out.println("Repairing a car");
    }
}
