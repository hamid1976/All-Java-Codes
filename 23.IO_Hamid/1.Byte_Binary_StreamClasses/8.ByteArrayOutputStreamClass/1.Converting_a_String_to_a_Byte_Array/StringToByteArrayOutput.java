import java.io.*;
class StringToByteArrayOutput{
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        try {
            // Write the string to the ByteArrayOutputStream using a specific character encoding (e.g., UTF-8).
            out.write(inputString.getBytes());

            // Convert the content of ByteArrayOutputStream to a byte array.
            byte data[]= out.toByteArray();

            // Display the byte array as a String for verification.
            String outputString = new String(data);
            System.out.println("Original String     : " + inputString);
            System.out.println("Converted Byte Array: " + outputString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
