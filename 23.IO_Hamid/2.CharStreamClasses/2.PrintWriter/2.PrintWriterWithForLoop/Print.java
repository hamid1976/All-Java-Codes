import java.io.*;
class Print{
	public static void main(String arg[]){
		try{
			PrintWriter w=new PrintWriter(System.out);
			for(int i=1; i<=5000; i++)
				w.write('2');
				System.out.println("Data Still in Buffer");
				System.in.read();
				w.flush();
		}catch(Exception e){}
	}
}