import java.io.*;
import java.net.*;
class Client1{
	public static void main(String arg[])throws Exception{
		Socket socket=new Socket("127.0.0.1",8080);
		
		DataInputStream in =new DataInputStream(socket.getInputStream());
		PrintStream 	out=new PrintStream(socket.getOutputStream());
		
		out.println("Hamid");
		out.println("Shaikh");
		out.println("Noorullah");
		out.println("2K20/IT/44");//send to server
		
		String msg=in.readLine();
		System.out.println("Server Says:"+msg);//receive from server
		
		socket.close();
		in.close();
		out.close();
	}
}