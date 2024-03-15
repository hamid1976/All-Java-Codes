import java.io.*;
class TestByteArrayOutputStream{
	public static void main(String[] args)throws Exception {
		byte[] data = "Sachal Sarmast Joyo".getBytes();
		FileInputStream f = new FileInputStream("data.txt");
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		int size = f.available();
		for (int i=0; i<size; i++) {
			int code =f.read();
			out.write(code);
		}
		byte[] data1 = out.toByteArray();
		String s = new String(data1,0,data1.length);
		System.out.println(s);
	}
}