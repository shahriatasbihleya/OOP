public class Employee {
    public static void main(String[] args) {
       
        String name = "Leya";
        int id = 1138;
        double salary = 200000.00;

        double annualSalary = salary * 12;
        System.out.println("Employee Details");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.printf("Monthly Salary: %.2f%n", salary);
        System.out.printf("Annual Salary: %.2f%n", annualSalary);
    }
}