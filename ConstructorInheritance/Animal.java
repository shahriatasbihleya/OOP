//02724205101138

class Animal {
 
    void makeSound() {
        System.out.println("Animal makes a sound");
    }

 
    public static void main(String[] args) {
       
        Cat c = new Cat();
        c.makeSound(); 
    }
}


class Cat extends Animal {
    
    @Override
    void makeSound() {
        System.out.println("Cat barks");
    }
}
