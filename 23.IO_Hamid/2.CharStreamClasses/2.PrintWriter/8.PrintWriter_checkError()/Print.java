import java.io.*;
class Print{
	public static void main(String arg[])throws IOException{
		PrintWriter w=new PrintWriter(System.out,true);
		w.println("Hello");
		w.println("Check Error:"+w.checkError());
	}
}