import java.io.*;
class Data{
	public static void main(String arg[]){
		try{
			FileOutputStream fout=new FileOutputStream("d.txt");
			FileInputStream f=new FileInputStream("b.txt");
			DataInputStream file=new DataInputStream(f);
			int code;
			while((code=file.read())!=-1){
				fout.write(code);
			}
			fout.close();
		}catch(Exception e){}
	}
}