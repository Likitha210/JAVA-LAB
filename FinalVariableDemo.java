class FinalVariableDemo {

    public static void main(String[] args) {

        final int NUMBER = 100;

        System.out.println("Final value = " + NUMBER);

        // NUMBER = 200;  // Error: cannot change final variable
    }
}