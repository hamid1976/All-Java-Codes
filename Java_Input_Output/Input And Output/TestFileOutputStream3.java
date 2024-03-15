import java.io.*;
public class TestFileOutputStream3 {
	public static void main(String[] args) throws Exception{
		FileInputStream file = new FileInputStream("a7.txt");
		// DataInputStream file = new DataInputStream(System.in);
		FileOutputStream fout = new FileOutputStream("a3.txt");
		int code;
		while ((code=file.read())!=-1) {
			fout.write(code);
		}
		fout.close();

		// FileInputStream f = new FileInputStream("a3.txt");
		// DataInputStream file2 = new DataInputStream(f);
		// String line;
		// while ((line=file2.readLine())!=null){
		// 	System.out.println(line);
		// }
	}
} // new Work