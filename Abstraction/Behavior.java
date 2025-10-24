
//ID : 02724205101138


abstract class Person {
    String name;

  
    Person(String name) {
        this.name = name;
    }


    abstract void eat();
    abstract void exercise();
}


class Athlete extends Person {
    Athlete(String name) {
        super(name);
    }

    void eat() {
        System.out.println(name + " eats a healthy diet full of protein and vegetables.");
    }

    void exercise() {
        System.out.println(name + " exercises daily with running, weightlifting and stretching.");
    }
}


class LazyPerson extends Person {
    LazyPerson(String name) {
        super(name);
    }

    void eat() {
        System.out.println(name + " often eats junk food like burgers and fries.");
    }

    void exercise() {
        System.out.println(name + " rarely exercises and prefers to rest or watch TV.");
    }
}


public class Behavior {
    public static void main(String[] args) {
       
        Person athlete = new Athlete("Shahria Tasbih Leya");
        Person lazy = new LazyPerson("Irin Adler");

       
        System.out.println("---- Athlete ----");
        athlete.eat();
        athlete.exercise();

        System.out.println("\n---- Lazy Person ----");
        lazy.eat();
        lazy.exercise();
    }
}
