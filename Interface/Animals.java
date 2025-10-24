
//ID : 02724205101138

interface Animal {
    void bark();
}


class Dog implements Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}


public class Animals {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.bark();
    }
}
