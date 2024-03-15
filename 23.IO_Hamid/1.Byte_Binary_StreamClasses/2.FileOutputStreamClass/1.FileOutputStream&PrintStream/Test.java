import java.io.*;
class Test{
	public static void main(String arg[]){
		try{
			FileOutputStream f=new FileOutputStream("a.txt");
			
			PrintStream p=new PrintStream(f);
			
			p.println("Hello Student");
			p.println("Addition:"+(10+5));
			p.println(10.10+50);
			p.println(true);
			f.close();
		}catch(Exception e){
			
		}
	}
}