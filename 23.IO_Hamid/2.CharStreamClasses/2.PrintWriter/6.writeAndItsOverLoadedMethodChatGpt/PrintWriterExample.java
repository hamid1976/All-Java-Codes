import java.io.*;

public class PrintWriterExample {
    public static void main(String[] args) {
        try {
            // Create a new PrintWriter that writes to the console (System.out)
            PrintWriter writer = new PrintWriter(System.out);

            // Writing a single character
            writer.write('A');

            // Writing an array of characters
            char[] charArray = {'B', 'C', 'D'};
            writer.write(charArray);

            // Writing a portion of the character array
            char[] partialArray = {'E', 'F', 'G', 'H', 'I'};
            writer.write(partialArray, 1, 3); // Writes 'F', 'G', 'H'

            // Writing a string
            String str = "Hello";
            writer.write(str);

            // Flush the PrintWriter to ensure data is written immediately
            writer.flush();

            // Close the PrintWriter
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
