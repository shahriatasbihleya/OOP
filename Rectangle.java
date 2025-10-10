//02724205101138
   public class Rectangle {

    double length;
    double width;


    Rectangle(double l, double w) {
        length = l;
        width = w;
    }


    Rectangle(Rectangle r) {
        length = r.length;
        width = r.width;
    }


    void display() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }

  
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(18.5, 3.5);

      
        Rectangle rect2 = new Rectangle(rect1);

        
        System.out.println("Rectangle 1:");
        rect1.display();

        System.out.println("\nRectangle 2 (Copy):");
        rect2.display();
    }
}