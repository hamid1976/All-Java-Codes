import java.io.*;
class IOCreateDirectory{
	public static void main(String arg[]){
	
		File f=new File("Pics");
		
		f.mkdir();//this will create directory1 or you would say a folder
		
		System.out.println("Created"+f.getAbsolutePath());
	}
}