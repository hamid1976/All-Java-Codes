import java.io.*;
class Input{
	public static void main(String arg[])throws IOException{
		InputStream in=System.in;
		InputStreamReader reader=new InputStreamReader(in);
		
		BufferedReader r=new BufferedReader(reader);
		System.out.print("Enter Your Name:");
		String name=r.readLine();
		System.out.println("Your Name is:"+name);
	}
}