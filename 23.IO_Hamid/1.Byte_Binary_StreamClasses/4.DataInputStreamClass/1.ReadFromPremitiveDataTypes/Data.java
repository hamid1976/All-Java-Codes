import java.io.*;
class Data{
	public static void main(String arg[]){
		try{
			FileInputStream f=new FileInputStream("a.txt");
			DataInputStream file=new DataInputStream(f);
			
			String line1=file.readLine();
			String line2=file.readLine();
			String line3=file.readLine();
			String line4=file.readLine();
			System.out.println(line1);
			System.out.println(line2);
			System.out.println(line3);
			System.out.println(line4);
		}catch(Exception e){}
	}
}