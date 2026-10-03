abstract class Animal {

    // Abstract method
    abstract void sound();
    void eat() {
    System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    // Implementing abstract method
    void sound() {
     System.out.println("Dog barks");
    }
}

public class Que2 {
    public static void main(String[] args) {
     Dog d = new Dog();
     d.sound();
     d.eat();
    }
}