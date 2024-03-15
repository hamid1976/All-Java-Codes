import java.io.*;
class Writer{
	public static void main(String arg[]){
		try{
			FileWriter w=new FileWriter("b.txt");
			
			String str="Hello";
			
			for(int i=0; i<str.length(); i++){
				w.write(str.charAt(i));
			}
				w.close();
		}catch(Exception e){}
	}
}