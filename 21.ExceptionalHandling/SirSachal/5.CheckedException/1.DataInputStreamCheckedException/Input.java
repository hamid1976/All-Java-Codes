import java.io.*;
class Input{
	public static void main(String arg[]){
		DataInputStream ob=new DataInputStream(System.in);
		
			System.out.print("Enter Your Name:");
			String name=ob.readLine();
			System.out.println("Your Name:"+name);
		
	}
}