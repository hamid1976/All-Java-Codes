import java.io.*;
class FileInputAndFileOutput{
	public static void main(String arg[]){
	try{
		FileOutputStream  fout=new FileOutputStream("c.mp4");
		FileInputStream   f=new FileInputStream("y3.mp4");
		DataInputStream   file=new DataInputStream(f);
		
		int code;
		
		while((code=file.read())!=-1){
			fout.write(code);
		}
		fout.close();
	}catch(Exception e){}
	}
}+