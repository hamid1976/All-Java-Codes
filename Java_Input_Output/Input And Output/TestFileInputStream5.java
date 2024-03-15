import java.io.*;
public class TestFileInputStream5{
	public static void main(String[] args)throws Exception {
		FileInputStream f = new FileInputStream("a7.txt");
		DataInputStream file = new DataInputStream(f);

		String line1 = file.readLine();
		String line2 = file.readLine();
		System.out.println(line1);
		System.out.println(line2);
		do{
			String line3 = file.readLine();
			if (line3==null)break;
			System.out.println(line3);
		}while (true);
		/*
		*/
	}
}