import java.io.*;
import java.net.*;
class Client{
	public static void main(String arg[])throws Exception{
		Socket socket=new Socket("127.0.0.1",9090);
		
		DataInputStream in=new DataInputStream(socket.getInputStream());
		PrintStream out=new PrintStream(socket.getOutputStream());
		
		out.println("Hello Server");//send to server
		
		String msg=in.readLine();//receive form server
		
		System.out.println("Server Says:"+msg);
		
		in.close();
		out.close();
		socket.close();
	}
}