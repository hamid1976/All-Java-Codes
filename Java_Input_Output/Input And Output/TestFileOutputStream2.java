import java.io.*;
class TestFileOutputStream2{
	public static void main(String[] args)throws Exception {
		FileOutputStream fout = new FileOutputStream("a2.txt");
		String s = "Sameer hello";
		char ch[]=s.toCharArray();
		for (int i=0; i<s.length(); i++) {
			fout.write(ch[i]);
		}
		fout.close();
	}
}