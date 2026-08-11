class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

interface Pet {
    void play();
}

class Puppy extends Dog implements Pet {

    public void play() {
        System.out.println("Puppy is playing.");
    }

    void puppyDetails() {
        eat();
        bark();
        play();
    }
}

public class HybridInheritance {
    public static void main(String[] args) {

        Puppy p = new Puppy();

        System.out.println("Puppy Details:");
        p.puppyDetails();
    }
}