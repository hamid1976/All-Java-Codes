import java.io.*;
class Input{
	public static void main(String arg[]){
		DataInputStream in=new DataInputStream(System.in);
		
		System.out.print("Enter Any No:");
		String s=in.readLine();
		int a=Integer.parseInt(s);
		System.out.println("Square="+a*a);
	}
}