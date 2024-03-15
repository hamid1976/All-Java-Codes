import java.io.*;
class TestCharArrayWriter{
	public static void main(String[] args)throws Exception {
		char[] data = "Sachal Sarmast Joyo ".toCharArray();
		CharArrayReader ca = new CharArrayReader(data);
		CharArrayWriter out = new CharArrayWriter();
		int ch;
		while ((ch=ca.read())!=-1) {
			System.out.print((char)ch);
			out.write(ch);
		}
		System.out.println(out.toString());
	}
}