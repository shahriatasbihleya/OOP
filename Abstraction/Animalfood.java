
//ID : 02724205101138

abstract class Animal {
 
    abstract void eat();
    abstract void sleep();
}

class Lion extends Animal {
    void eat() {
        System.out.println("Lion eats meat and hunts in groups called prides.");
    }

    void sleep() {
        System.out.println("Lion sleeps for about 20 hours a day in the shade.");
    }
}


class Tiger extends Animal {
    void eat() {
        System.out.println("Tiger eats large prey like deer and wild boar.");
    }

    void sleep() {
        System.out.println("Tiger sleeps about 16 hours a day, usually alone.");
    }
}


class Deer extends Animal {
    void eat() {
        System.out.println("Deer eats grass, leaves, and fruits — it’s a herbivore.");
    }

    void sleep() {
        System.out.println("Deer sleeps lightly for short periods to stay alert.");
    }
}


public class Animalfood {
    public static void main(String[] args) {
      
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        Animal deer = new Deer();

       
        System.out.println("---- Lion ");
        lion.eat();
        lion.sleep();

        System.out.println("\n---- Tiger ");
        tiger.eat();
        tiger.sleep();

        System.out.println("\n---- Deer ----");
        deer.eat();
        deer.sleep();
    }
}
