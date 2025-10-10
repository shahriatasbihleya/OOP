public class Cat {
  //ID: 02724205101138
    String name;
    int age;


    Cat() {
        name = "Unknown";
        age = 0;
    }

   
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }


    public static void main(String[] args) {
        Cat c1 = new Cat(); 
        c1.display();       
}
}