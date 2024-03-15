import java.io.*;
class Data{
	public static void main(String arg[]){
		try{
			FileInputStream f=new FileInputStream("a.txt");
			DataInputStream file=new DataInputStream(f);
			do{
				String line=file.readLine();
				if(line==null)break;
				System.out.println(line);
			}while(true);
		}catch(Exception e){}
	}
}