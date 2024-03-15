import java.io.*;
class Print{
	public static void main(String arg[])throws IOException{
		FileWriter w=new FileWriter("a.txt");
		PrintWriter p=new PrintWriter(w,true);
		
		p.println("Hello Hamid");
		
		for(int i=1; i<=10; i++){
			p.println("Loop:"+i);
		}
		w.close();
	}
}