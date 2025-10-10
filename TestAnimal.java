//02724205101138

class Animal {
    void move() {
        System.out.println("The animal moves");
    }
}


class Cheetah extends Animal {
    @Override
    void move() {
        System.out.println("The cheetah runs very fast");
    }
}


public class TestAnimal {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.move(); 

        Cheetah c = new Cheetah();
        c.move();  
    }
}
