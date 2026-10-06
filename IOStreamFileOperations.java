import java.io.*;

public class IOStreamFileOperations {
    public static void main(String[] args) {

        try {
            // Output stream - write data to file
            FileOutputStream output = new FileOutputStream("data.txt");

             String text = "Hello! This is an IO Stream example in Java.";

            output.write(text.getBytes());
            output.close();

            System.out.println("Data written successfully.");

            // Input stream - read data from file
            FileInputStream input = new FileInputStream("data.txt");

           int ch;

            System.out.println("\nFile contents:");

            while ((ch = input.read()) != -1) {
                System.out.print((char) ch);
            }

            input.close();

            System.out.println("\n\nFile reading completed.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}