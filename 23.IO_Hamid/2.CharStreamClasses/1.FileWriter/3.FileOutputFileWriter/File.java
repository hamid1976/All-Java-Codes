import java.io.*;
class File{
	public static void main(String arg[]){
		try{
			FileOutputStream fos=new FileOutputStream("a.txt");
			FileWriter fw=new FileWriter("b.txt");
			
			fos.write('A');
			fw.write('A');
			
			fos.close();
			fw.close();
		}catch(Exception e){}
	}
}