import java.net.*;
import java.io.*;
class Client1{
	public static void main(String arg[])throws Exception{
		// Socket socket=new Socket("127.0.0.1",9090);
		Socket socket=new Socket("192.168.1.100",9090);
		System.out.println("Connection Established");
		
		DataInputStream in=new DataInputStream(socket.getInputStream());
		PrintStream out=new PrintStream(socket.getOutputStream());
		
		out.println("I am Hamid Shaikh");//send
		String response=in.readLine();//Receive
			System.out.println("Server Says:"+response);
		    	//System.out.println("Thanks");
				in.close();
				out.close();
	}
}