
//ID : 02724205101138


interface Flyable {
    void fly_obj();
}


class Spacecraft implements Flyable {
    public void fly_obj() {
        System.out.println("Spacecraft is flying in space.");
    }
}


class Airplane implements Flyable {
    public void fly_obj() {
        System.out.println("Airplane is flying in the sky.");
    }
}


class Helicopter implements Flyable {
    public void fly_obj() {
        System.out.println("Helicopter is hovering above the ground.");
    }
}


public class Crafts {
    public static void main(String[] args) {
        Flyable spacecraft = new Spacecraft();
        Flyable airplane = new Airplane();
        Flyable helicopter = new Helicopter();

        spacecraft.fly_obj();
        airplane.fly_obj();
        helicopter.fly_obj();
    }
}

