
//ID : 02724205101138

interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements Resizable {
    private int width;
    private int height;

 
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void resizeWidth(int width) {
        this.width = width;
        System.out.println("Width resized to: " + this.width);
    }

    public void resizeHeight(int height) {
        this.height = height;
        System.out.println("Height resized to: " + this.height);
    }

    
    public void display() {
        System.out.println("Rectangle width: " + width + ", height: " + height);
    }
}


public class Resizing {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        rect.display();

     
        rect.resizeWidth(15);
        rect.resizeHeight(8);
        rect.display();
    }
}

