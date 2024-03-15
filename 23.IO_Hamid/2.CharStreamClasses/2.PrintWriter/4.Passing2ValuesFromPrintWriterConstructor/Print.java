import java.io.*;
class Print{
	public static void main(String arg[])throws IOException{
		FileWriter w=new FileWriter("a.txt");
		PrintWriter p=new PrintWriter(System.out,true);
		
		p.println("Hello Java Std");
		
		for(int i=1; i<=10; i++){
			p.println("Loop:"+i);
		}
		p.println("Good Bye");
		w.close();
	}
}