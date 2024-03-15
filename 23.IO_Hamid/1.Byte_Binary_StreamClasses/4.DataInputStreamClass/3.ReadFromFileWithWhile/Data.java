import java.io.*;
class Data{
	public static void main(String arg[]){
		try{
			FileInputStream f=new FileInputStream("a.txt");
			DataInputStream file=new DataInputStream(f);
			
			String line=file.readLine();
			
			while(line!=null){
				System.out.println(line);
				line=file.readLine();
			}
		}catch(Exception e){}
	}
}