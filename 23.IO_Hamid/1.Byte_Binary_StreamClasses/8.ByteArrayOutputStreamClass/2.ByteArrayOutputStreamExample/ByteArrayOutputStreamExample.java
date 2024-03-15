import java.io.*;
class ByteArrayOutputStreamExample {
    public static void main(String[] args) {
        byte[] data = { 0x48, 0x65, 0x6C, 0x6C, 0x6F, 0x2C, 0x20, 0x57, 0x6F, 0x72, 0x6C, 0x64, 0x21 };
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        try {
            // Write the binary data to the out.
            out.write(data);

            // Convert the content of out to a byte array.
            byte[] byteArray = out.toByteArray();

            // Display the byte array as a String for verification.
            String outputString = new String(byteArray);
            System.out.println("Original Binary Data: " + new String(data));
            System.out.println("Converted Byte Array: " + outputString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
