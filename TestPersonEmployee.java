//02724205101138


class Person {
    private String firstName;
    private String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

 
    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }
}

class Employee extends Person {
    private String employeeId;
    private String jobTitle;

    Employee(String firstName, String lastName, String employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

   
    String getEmployeeId() {
        return employeeId;
    }


    @Override
    String getLastName() {
        return super.getLastName() + " (" + jobTitle + ")";
    }
}


public class TestPersonEmployee {
    public static void main(String[] args) {
       
        Person p = new Person("Sumaiya", "Akter");
        System.out.println("Person: " + p.getFirstName() + " " + p.getLastName());

        
        Employee e = new Employee("Shahria", "Leya", "1138", "Manager");
        System.out.println("Employee: " + e.getFirstName() + " " + e.getLastName());
        System.out.println("Employee ID: " + e.getEmployeeId());
    }
}
