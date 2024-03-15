import java.io.*;
class Print{
	public static void main(String arg[]){
		try{
			FileWriter f =new FileWriter("a.txt");
			FileWriter f1=new FileWriter("b.txt");
			
			PrintWriter p=new PrintWriter(f);
			PrintWriter p1=new PrintWriter(f1);
			
			p.println("Hello");
			p1.println("Hello Student");
			
			f.flush();//send or flush
			
			f.close();
			f1.close();
		}catch(Exception e){
			
		}
	}
}