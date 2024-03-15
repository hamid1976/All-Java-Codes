import java.io.*;
class TestFileInputStream3{
	public static void main(String[] args)throws Exception{
		FileInputStream f = new FileInputStream("a1.txt");
		int size = f.available();
		byte data[]=new byte[size];
		f.read(data, 0, size);
		String str = new String(data, 0 , size);
		System.out.println(str);
	}
}