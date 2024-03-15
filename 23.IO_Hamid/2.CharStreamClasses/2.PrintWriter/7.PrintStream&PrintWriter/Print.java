import java.io.*;
class Print{
	public static void main(String arg[]){
		try{
			PrintStream ps=new PrintStream("a.txt");
			PrintWriter pw=new PrintWriter("b.txt");
			
			ps.write('A');
			pw.write('A');
			
			ps.close();
			pw.close();
		}catch(Exception e){}
	}
}