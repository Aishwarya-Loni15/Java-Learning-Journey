class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    // Overriding parent method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Overriding {

    public static void main(String[] args) {

        Dog obj = new Dog();

        obj.sound();
    }
}