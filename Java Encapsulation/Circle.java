// ID : 02724205101138
public class Circle {
    
    private double radius;

    
    public double getRadius() {
        return radius;
    }

   
    public void setRadius(double radius) {
        this.radius = radius;
    }

    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

   
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }


    public static void main(String[] args) {
    
        Circle circle1 = new Circle();

    
        circle1.setRadius(7.5);

       
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Area: " + circle1.calculateArea());
        System.out.println("Perimeter: " + circle1.calculatePerimeter());
    }
}
