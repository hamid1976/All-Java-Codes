import java.io.*;
class TestFileWriter3{
	public static void main(String[] args) {
		try{
			PrintWriter w = new PrintWriter(System.out);

			for (int i=0; i<=1000; i++) {
				w.write('H');
			}
			System.out.println("Data Still in Buffer");
			System.in.read();
			w.flush();
			for (int i=0; i<=5000; i++) {
				w.write('Z');
			}
			// w.flush();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}