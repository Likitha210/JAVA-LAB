class Animal {
    String name = "Tommy";

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking.");
    }

    void display() {
        System.out.println("Animal Name: " + name);
        eat();
        sleep();
        bark();
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}