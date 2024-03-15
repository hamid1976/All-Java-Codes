import java.io.*;
import java.net.*;
import java.util.*;
class Client1{
	public static void main(String arg[])throws Exception{
		Scanner ob=new Scanner(System.in);
	
		Socket socket=new Socket("127.0.0.1",9090);
		
		DataInputStream in=new DataInputStream(socket.getInputStream());
		PrintStream out=new PrintStream(socket.getOutputStream());
		
		do{	
			System.out.print("Client Says: ");
			String clientMsg = ob.nextLine();
			out.println(clientMsg); // Send To Server
		
			String msg=in.readLine();//receive form server
			System.out.println("Server Says:"+msg);
		
		}while(true);
	}
}