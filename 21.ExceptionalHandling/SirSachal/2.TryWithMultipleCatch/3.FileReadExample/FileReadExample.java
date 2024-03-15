import java.io.*;

public class FileReadExample{ 
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("noneqxistent.txt"));
            String line = reader.readLine();
            System.out.println("Read from file: " + line);
            reader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error reading the file: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("An unexpected error occurred: " + ex.getMessage());
        }

        System.out.println("Program continues...");
    }
}
