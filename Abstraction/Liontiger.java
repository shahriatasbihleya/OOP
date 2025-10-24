
//ID : 02724205101138

abstract class Animal {
 
    abstract void sound();
}


class Lion extends Animal {
  
    void sound() {
        System.out.println("The lion roars!");
    }
}


class Tiger extends Animal {
  
    void sound() {
        System.out.println("The tiger growls!");
    }
}


public class Liontiger {
    public static void main(String[] args) {
        
        Animal lion = new Lion();
        Animal tiger = new Tiger();

       
        lion.sound();
        tiger.sound();
    }
}
