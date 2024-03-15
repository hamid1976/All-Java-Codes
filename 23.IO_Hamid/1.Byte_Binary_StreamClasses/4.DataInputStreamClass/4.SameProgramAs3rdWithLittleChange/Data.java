import java.io.*;
class Data{
	public static void main(String arg[]){
		try{
			FileInputStream f=new FileInputStream("a.txt");
			DataInputStream file=new DataInputStream(f);
			
			String line;
			
			while((line=file.readLine())!=null){
				System.out.println(line);
			}
		}catch(Exception e){}
	}
}