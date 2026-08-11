interface Father {
    void fatherProperty();

    default void fatherMessage() {
        System.out.println("Father says: Work hard.");
    }
}

interface Mother {
    void motherProperty();

    default void motherMessage() {
        System.out.println("Mother says: Be honest.");
    }
}

class Child implements Father, Mother {

    public void fatherProperty() {
        System.out.println("Father's property: House");
    }

    public void motherProperty() {
        System.out.println("Mother's property: Gold");
    }

    void childDetails() {
        fatherProperty();
        motherProperty();
        fatherMessage();
        motherMessage();
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {

        Child c = new Child();

        System.out.println("Child Details:");
        c.childDetails();
    }
}