import java.io.*;

public class FileOperations {
    public static void main(String[] args) {
        try {
            // Create/Open a file
            File file = new File("sample.txt");

            // Write to the file
           FileWriter writer = new FileWriter(file);
            writer.write("Hello! This is a Java file operation program.");
            writer.close();   // Close the file after writing

            System.out.println("Data written successfully.");

            // Open and read the file
            FileReader reader = new FileReader(file);

            int ch;
            System.out.println("\nFile contents:");

            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            reader.close();   // Close the file after reading

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}