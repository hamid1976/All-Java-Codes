import java.io.*;
import java.net.*;
class Server1{
	public static void main(String arg[])throws Exception{
		ServerSocket server=new ServerSocket(8080);
		
		Socket socket=server.accept();//wait 
		
		DataInputStream in =new DataInputStream(socket.getInputStream());
		PrintStream 	out=new PrintStream(socket.getOutputStream());
		
		String name   =in.readLine();
		String surname=in.readLine();
		String fname  =in.readLine();
		String rollno =in.readLine();
		
		System.out.println(name);
		System.out.println(surname);
		System.out.println(fname);
		System.out.println(rollno);//receive from client
		
		
		out.println("Client Your Data Is Correct");//send to Client
	
		socket.close();
		in.close();
		out.close();
	}
}