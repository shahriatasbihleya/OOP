
//ID : 02724205101138


abstract class Employee {
    String name;
    int id;

   
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

   
    abstract double calculateSalary();
    abstract void displayInfo();
}


class Manager extends Employee {
    double baseSalary;
    double bonus;

    Manager(String name, int id, double baseSalary, double bonus) {
        super(name, id);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    double calculateSalary() {
        return baseSalary + bonus;
    }

    void displayInfo() {
        System.out.println("Manager Name: " + name);
        System.out.println("Manager ID: " + id);
        System.out.println("Total Salary: " + calculateSalary());
    }
}


class Programmer extends Employee {
    double hourlyRate;
    int hoursWorked;

    Programmer(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    void displayInfo() {
        System.out.println("Programmer Name: " + name);
        System.out.println("Programmer ID: " + id);
        System.out.println("Total Salary: " + calculateSalary());
    }
}


public class Employeeee {
    public static void main(String[] args) {
        
        Employee manager = new Manager("Shahria Tasbih Leya", 1138, 200000, 100000);
        Employee programmer = new Programmer("Bob", 102, 1000, 45);

   
        System.out.println("---- Manager Details ");
        manager.displayInfo();

        System.out.println("\n---- Programmer Details ");
        programmer.displayInfo();
    }
}

