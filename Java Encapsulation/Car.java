// ID : 02724205101138
public class Car {
   
    private String company_name;
    private String model_name;
    private int year;
    private double mileage;

    public String getCompanyName() {
        return company_name;
    }

    public void setCompanyName(String company_name) {
        this.company_name = company_name;
    }

    public String getModelName() {
        return model_name;
    }

    public void setModelName(String model_name) {
        this.model_name = model_name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }

    public static void main(String[] args) {
       
        Car car1 = new Car();

        car1.setCompanyName("Tesla");
        car1.setModelName("Model S");
        car1.setYear(2024);

     
        car1.mileage = 18.5;

       
        System.out.println("Company Name: " + car1.getCompanyName());
        System.out.println("Model Name: " + car1.getModelName());
        System.out.println("Year: " + car1.getYear());
        System.out.println("Mileage: " + car1.getMileage() + " km/l");
    }
}
