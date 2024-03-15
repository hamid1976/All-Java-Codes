import java.io.*;
public class TestFileInputStream6 {
	public static void main(String[] args)throws Exception {
		FileInputStream f = new FileInputStream("a7.txt");
		DataInputStream file = new DataInputStream(f);
		String line = file.readLine();
		while (line!=null) {
			System.out.println(line);
			line =file.readLine();
		}
	}
}