import java.io.*;
class IOProgram{
	public static void main(String arg[]){
		File f1=new File("/java/COPYRIGHT");
		System.out.println("Name="+f1.getName());
		System.out.println("Path ="+f1.getPath());
		System.out.println("Parent="+f1.getParent());
		System.out.println("Exists="+f1.exists());
		System.out.println("isDirectory="+f1.isDirectory());
		System.out.println("File="+f1.isFile());
		System.out.println("Size="+f1.length());
	}
}