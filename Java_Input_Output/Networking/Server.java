import java.net.*;
import java.io.*;
class Server{
	public static void main(String arg[])throws Exception{
		ServerSocket server=new ServerSocket(9090);
		System.out.println("Server Started");
		Socket socket=server.accept();
		System.out.println("Client Connected");
		DataInputStream in=new DataInputStream(socket.getInputStream());
		PrintStream out=new PrintStream(socket.getOutputStream());
		
		String str=in.readLine();//Receive
			System.out.println("Client Says:"+str);
		    	out.println("Thanks");//send
				in.close();
				out.close();
	}
}