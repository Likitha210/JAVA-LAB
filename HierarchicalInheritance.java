class Employee {
    String company = "ABC Technologies";

    void showCompany() {
        System.out.println("Company: " + company);
    }

    void work() {
        System.out.println("Employee is working.");
    }
}

class Developer extends Employee {
    void writeCode() {
        System.out.println("Developer is writing Java code.");
    }

    void developerDetails() {
        showCompany();
        work();
        writeCode();
    }
}

class Tester extends Employee {
    void testSoftware() {
        System.out.println("Tester is testing the software.");
    }

    void testerDetails() {
        showCompany();
        work();
        testSoftware();
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {

        Developer d = new Developer();
        System.out.println("Developer Details:");
        d.developerDetails();

        System.out.println();

        Tester t = new Tester();
        System.out.println("Tester Details:");
        t.testerDetails();
    }
}