import java.io.*;
class TestFileWriter{
	public static void main(String[] args)throws Exception {
		FileWriter w = new FileWriter("abc.txt");
		String str = "Hello";
		for (int i=0; i<str.length(); i++) {
			w.write(str.charAt(i));
		}
		w.close();
	}
}