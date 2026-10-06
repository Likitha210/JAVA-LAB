class StaticMethod {

    // Static method to find square
    static int findSquare(int n) {
        return n * n;
    }

    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 10;

        System.out.println("Square of " + num1 + " = " + findSquare(num1));
        System.out.println("Square of " + num2 + " = " + findSquare(num2));
    }
}