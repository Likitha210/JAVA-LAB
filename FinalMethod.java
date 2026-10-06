class Parent {

    final void display() {
        System.out.println("This is a final method.");
    }
}

class FinalMethod extends Parent {

    // Cannot override the final method
    // void display() {
    //     System.out.println("Cannot override");
    // }

    public static void main(String[] args) {

        FinalMethod obj = new FinalMethod();
        obj.display();
    }
}