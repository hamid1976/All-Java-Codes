import java.io.*;
class Input{
    public static void main(String arg[]) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter Your Name:");
            String name = reader.readLine();
            System.out.println("Your Name: " + name);
        } catch (IOException e) {
            System.out.print("Input Device Disconnected: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
