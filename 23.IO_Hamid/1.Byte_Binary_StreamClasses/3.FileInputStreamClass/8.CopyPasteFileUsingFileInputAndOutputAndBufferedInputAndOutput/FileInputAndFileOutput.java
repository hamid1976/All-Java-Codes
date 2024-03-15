import java.io.*;
class FileInputAndFileOutput {
    public static void main(String arg[]) throws IOException {
        try (
            FileInputStream file = new FileInputStream("y3.mp4");
            BufferedInputStream bufferedInput = new BufferedInputStream(file);
            FileOutputStream f = new FileOutputStream("b.mp4");
            BufferedOutputStream bufferedOutput = new BufferedOutputStream(f);
        ) {
            int code;
            while ((code = bufferedInput.read()) != -1) {
                bufferedOutput.write(code);
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
