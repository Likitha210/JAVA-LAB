public class AllExceptionsDemo {

    public static void main(String[] args) {

        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("1. ArithmeticException: " + e.getMessage());
        }
        try {
            int[] arr = {10, 20, 30};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("2. ArrayIndexOutOfBoundsException: "
                    + e.getMessage());
        }
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("3. NullPointerException: " + e.getMessage());
        }
        try {
            int num = Integer.parseInt("ABC");
        } catch (NumberFormatException e) {
            System.out.println("4. NumberFormatException: " + e.getMessage());
        }
        try {
            String name = "Java";
            System.out.println(name.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("5. StringIndexOutOfBoundsException: "
                    + e.getMessage());
        }
        try {
            Object obj = Integer.valueOf(100);
            String str = (String) obj;
        } catch (ClassCastException e) {
            System.out.println("6. ClassCastException: " + e.getMessage());
        }
        try {
            Thread.sleep(-100);
        } catch (IllegalArgumentException e) {
            System.out.println("7. IllegalArgumentException: "
                    + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("InterruptedException: " + e.getMessage());
        }
        try {
            java.util.Scanner sc = new java.util.Scanner("ABC");
            int number = sc.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("8. InputMismatchException: "
                    + e.getMessage());
        }
        try {
            java.io.FileInputStream file =
                    new java.io.FileInputStream("abc.txt");
        } catch (java.io.FileNotFoundException e) {
            System.out.println("9. FileNotFoundException: "
                    + e.getMessage());
        }
        try {
            java.io.FileReader reader =
                    new java.io.FileReader("abc.txt");
            reader.close();
        } catch (java.io.IOException e) {
            System.out.println("10. IOException: " + e.getMessage());
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("11. InterruptedException: "
                    + e.getMessage());
        }
        try {
            int result = 10 / 2;
            System.out.println("12. Result = " + result);
        } catch (Exception e) {
            System.out.println("Exception occurred");
        } finally {
            System.out.println("12. Finally block is always executed.");
        }

        System.out.println("\nProgram completed successfully.");
    }
}