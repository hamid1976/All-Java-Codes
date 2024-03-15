import java.io.*;
class FileInputAndFileOutput{
	public static void main(String arg[])throws IOException{
		
		FileInputStream file=new FileInputStream("y3.mp4");
		
		FileOutputStream  f=new FileOutputStream("b.mp4");
		
		int code;
		
		while((code=file.read())!=-1){
			f.write(code);
		}
		f.close();
		file.close();
	}
}