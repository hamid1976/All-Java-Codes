import java.io.*;
class TestError{
	public static void main(String arg[]){
		PrintWriter w=new PrintWriter(System.out,true);
		w.println("Hello");
		w.println("Check Error="+w.checkError());
	}
}