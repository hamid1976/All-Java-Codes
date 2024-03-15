import java.io.*;
class Data{
	public static void main(String arg[])throws IOException{
		DataInputStream k=new DataInputStream(System.in);
		System.out.print("Enter Your Name:");
		String name=k.readLine();
		System.out.println("Your name is :"+name);
	}
}