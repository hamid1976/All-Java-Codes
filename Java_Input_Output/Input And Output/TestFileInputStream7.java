import java.io.*;
public class TestFileInputStream7 {
	public static void main(String[] args)throws Exception {
		FileInputStream f = new FileInputStream("a7.txt");
		DataInputStream file = new DataInputStream(f);
		String line;
		while ((line=file.readLine())!=null) {
			System.out.println(line);
			// copy / past
		}
	}
}