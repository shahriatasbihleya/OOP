public class Dog {
   //ID : 02724205101138
    String name;
    String color;

  
    Dog(String n, String c) {
        name = n;
        color = c;
    }


    void display() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
    }

    
    public static void main(String[] args) {
        
        Dog d1 = new Dog("Tommy", "Black");

        
        d1.display();
}
}