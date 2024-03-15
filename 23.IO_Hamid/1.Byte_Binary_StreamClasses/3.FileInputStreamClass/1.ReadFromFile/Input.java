import java.io.*;
class Input{
	public static void main(String arg[]){
		try{
			FileInputStream f=new FileInputStream("a.txt");
			
			int size=f.available();
			
			byte data[]=new byte[size];
			
			f.read(data,0,size);
			
			String str=new String(data,0,size);
			
			System.out.println(str);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}