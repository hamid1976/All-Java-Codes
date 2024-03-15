import java.io.*;
import java.net.*;
import java.util.*;
class Server1{
	public static void main(String arg[])throws Exception{
		Scanner ob=new Scanner(System.in);
		
		ServerSocket server=new ServerSocket(9090);
		
		Socket socket=server.accept();//wait
		
		DataInputStream in=new DataInputStream(socket.getInputStream());
		PrintStream out=new PrintStream(socket.getOutputStream());
		
	do{
		String msg=in.readLine();
		System.out.println("Client Says:"+msg);//receive from client
		
		
		System.out.print("Server Says: ");
        String serverMsg = ob.nextLine();
        out.println(serverMsg); // Send To Client
		
	}while(true);
		//in.close();
		//out.close();
		//socket.close();
		
	}
}