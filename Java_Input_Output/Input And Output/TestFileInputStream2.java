import java.io.*;
class TestFileInputStream2{
	public static void main(String[] args)throws Exception {
		FileInputStream infile = null;
		try{
			infile = new FileInputStream("a1.txt");
			int b;
			while((b=infile.read())!=-1){
				System.out.print((char)b);
			}
			infile.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}