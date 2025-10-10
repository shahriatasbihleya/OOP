//02724205101138
   public class Car {

    String make;
    String model;
    int year;
    
    Car(String make, String model, int year) {
      
        if (make == null || make.isEmpty()) {
            this.make = "Unknown";
        } else {
            this.make = make;
        }

        if (model == null || model.isEmpty()) {
            this.model = "Unknown";
        } else {
            this.model = model;
        }

        if (year == 0) {
            this.year = 2000; 
        } else {
            this.year = year;
        }
    }

    void display() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
    
        Car car1 = new Car("Toyota", "Corolla", 2022);
        
        Car car2 = new Car("", "Civic", 0);

        System.out.println("Car 1 Details:");
        car1.display();

        System.out.println("\nCar 2 Details:");
        car2.display();
    }
}