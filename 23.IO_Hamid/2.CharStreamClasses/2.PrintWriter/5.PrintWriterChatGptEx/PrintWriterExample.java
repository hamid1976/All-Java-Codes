import java.io.*;

public class PrintWriterExample{
    public static void main(String[] args) {
        try {
            // Create a new PrintWriter that writes to a file named "output.txt"
            PrintWriter writer = new PrintWriter("output.txt");

            // Write some data to the file
            writer.println("Hello, World!");
            writer.printf("The value of pi is approximately %.2f", Math.PI);

            // Close the PrintWriter
            writer.close();
            
            System.out.println("Data has been written to the file.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
