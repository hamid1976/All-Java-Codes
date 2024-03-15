import java.io.*;
class Test{
	public static void main(String arg[]){
		PrintStream p=new PrintStream(System.out);
		
		p.println("Hello Student");
		p.println("Addition="+(10+5));
		p.println(10+5);
		p.println(10.10+50);
		p.println(true);
	}
}