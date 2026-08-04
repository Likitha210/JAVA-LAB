class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Array {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        double[] marks = {85.5, 90.0, 78.5};
        char[] letters = {'J', 'A', 'V', 'A'};
        String[] fruits = {"Apple", "Banana", "Mango"};
        boolean[] status = {true, false, true};
        float[] heights = {5.5f, 5.8f, 6.1f};
        long[] population = {100000L, 200000L, 300000L};
        short[] ages = {18, 20, 22};
        byte[] values = {1, 2, 3, 4};

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Object Array
        Student[] students = {
            new Student("Alice", 20),
            new Student("Bob", 21),
            new Student("Charlie", 22)
        };

        System.out.println("Integer Array:");
        for (int n : numbers)
            System.out.print(n + " ");

        System.out.println("\n\nDouble Array:");
        for (double m : marks)
            System.out.print(m + " ");

        System.out.println("\n\nCharacter Array:");
        for (char c : letters)
            System.out.print(c + " ");

        System.out.println("\n\nString Array:");
        for (String f : fruits)
            System.out.print(f + " ");

        System.out.println("\n\nBoolean Array:");
        for (boolean s : status)
            System.out.print(s + " ");

        System.out.println("\n\nFloat Array:");
        for (float h : heights)
            System.out.print(h + " ");

        System.out.println("\n\nLong Array:");
        for (long p : population)
            System.out.print(p + " ");

        System.out.println("\n\nShort Array:");
        for (short a : ages)
            System.out.print(a + " ");

        System.out.println("\n\nByte Array:");
        for (byte v : values)
            System.out.print(v + " ");

        System.out.println("\n\nTwo-Dimensional Array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nObject Array:");
        for (Student s : students) {
            System.out.println("Name: " + s.name + ", Age: " + s.age);
        }
    }
}