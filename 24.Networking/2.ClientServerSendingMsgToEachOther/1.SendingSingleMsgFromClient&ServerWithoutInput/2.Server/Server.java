import java.io.*;
import java.net.*;
class Server{
	public static void main(String arg[])throws Exception{
	
		ServerSocket server=new ServerSocket(9090);
		
		Socket socket=server.accept();//wait
		
		DataInputStream in=new DataInputStream(socket.getInputStream());
		PrintStream out=new PrintStream(socket.getOutputStream());
		
		String msg=in.readLine();
		System.out.println("Client Says:"+msg);
		
		out.println("I am Fine");//send To Client
		
		in.close();
		out.close();
		socket.close();
	}
}