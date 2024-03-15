import java.io.*;
class TestFileWriter2{
	public static void main(String[] args) throws Exception{
		FileWriter f = new FileWriter("a8.txt");
		FileWriter ff = new FileWriter("a9.txt");

		PrintWriter pw1 = new PrintWriter(f);
		PrintWriter pw2 = new PrintWriter(ff);

		pw1.flush();
		// pw2.flush();

		pw1.println("Hello");
		pw2.println("Hello Students");

		pw1.close();
		pw2.close();
	}
}