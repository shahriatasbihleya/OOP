// ID : 02724205101138
public class Rectangle {
 
    private double length;
    private double width;

 
    public double getLength() {
        return length;
    }

    
    public void setLength(double length) {
        this.length = length;
    }

   
    public double getWidth() {
        return width;
    }

    
    public void setWidth(double width) {
        this.width = width;
    }

    
    public static void main(String[] args) {
      
        Rectangle rect = new Rectangle();

       
        rect.setLength(10.5);
        rect.setWidth(3.2);

        
        System.out.println("Length: " + rect.getLength());
        System.out.println("Width: " + rect.getWidth());
    }
}
