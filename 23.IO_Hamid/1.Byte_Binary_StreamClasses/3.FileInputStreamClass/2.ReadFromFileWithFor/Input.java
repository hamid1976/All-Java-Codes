import java.io.*;
class Input{
	public static void main(String arg[]){
		try{
			FileInputStream f=new FileInputStream("a.txt");
			int size=f.available();
			
			for(int i=1; i<=size; i++){
				char ch=(char)f.read();//same
				
				// int code=f.read();
				// char ch=(char)code;same
				System.out.print(ch);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}