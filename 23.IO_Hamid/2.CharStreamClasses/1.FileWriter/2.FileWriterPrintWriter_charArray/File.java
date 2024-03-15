import java.io.*;
class File{
	public static void main(String arg[])throws IOException{
		
			FileWriter f=new FileWriter("b.txt");
			String str="Hello Java Std";
			
			char data[]=str.toCharArray();
			
			PrintWriter w=new PrintWriter(f);
			w.write(data);
			System.out.println("Press any key");
			System.in.read();
			w.flush();
			
			w.println("\nHello");
			for(int i=1; i<=500; i++){
				w.println("Loop:"+i);
			}
			w.flush();
		
	}
}