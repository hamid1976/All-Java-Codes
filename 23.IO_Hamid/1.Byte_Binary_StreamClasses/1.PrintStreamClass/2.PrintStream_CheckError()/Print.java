import java.io.*;
class Print{
	public static void main(String arg[])throws IOException{
		PrintStream f=new PrintStream(System.out);
		f.println("Enter Your Name:");
		f.println("Check Error:"+f.checkError());
	}
}