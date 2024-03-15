import java.io.*;
class Test{
	public static void main(String arg[]){
		PrintStream f=new PrintStream(System.out);
		f.println("Hello");
f.println("CheckError="+f.checkError());
	}

	}