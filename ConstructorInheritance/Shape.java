//02724205101138

class Shape {
   
    double getArea() {
        System.out.println("Area of shape is not defined");
        return 0;
    }

  
    public static void main(String[] args) {
        
        Rectangle rect = new Rectangle(15, 5);
        System.out.println("Area of Rectangle: " + rect.getArea());
    }
}


class Rectangle extends Shape {
    double length;
    double width;

   
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    
    @Override
    double getArea() {
        return length * width;
    }
}
