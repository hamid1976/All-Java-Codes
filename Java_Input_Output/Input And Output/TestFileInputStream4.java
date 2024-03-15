import java.io.*;
class TestFileInputStream4{
	public static void main(String[] args) throws Exception{
		FileInputStream f = new FileInputStream("a6.txt");
		int size=f.available();
		for (int i=0; i<size; i++) {
			char ch=(char)f.read();
			System.out.print(ch);			
		}
	}
}