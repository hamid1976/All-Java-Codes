import java.io.*;
class TestFileOutputStream1{
	public static void main(String[] args) {
		FileOutputStream ofile = null;
		byte b1[]={'A','B'};
		try{
			ofile = new FileOutputStream("a4.txt");
			ofile.write(b1[1]);
			ofile.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}