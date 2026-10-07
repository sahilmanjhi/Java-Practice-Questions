
class Animal {
    String name = "Animal";

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    String name = "Dog";

    @Override
    void sound() {
        System.out.println("Dog barks");
        System.out.println("Parent name: " + super.name);
        super.sound();
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Que6 {
    public static void main(String[] args) {

        // Runtime Polymorphism
        Animal a;

        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();
    }
}
