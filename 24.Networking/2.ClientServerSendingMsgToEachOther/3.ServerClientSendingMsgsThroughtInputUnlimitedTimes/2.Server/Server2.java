import java.io.*;
import java.net.*;
import java.util.*;
class Server2{
	public static void main(String arg[])throws Exception{
		Scanner ob=new Scanner(System.in);
		
		ServerSocket server=new ServerSocket(9090);
		
		Socket socket=server.accept();//wait
		
		DataInputStream in=new DataInputStream(socket.getInputStream());
		PrintStream out=new PrintStream(socket.getOutputStream());
		
		class ServerSays extends Thread{
			public void run(){
				try{
					while(true){
						String msg=in.readLine();
						System.out.println("\nClient Says:"+msg);//receive from client
					}		
					
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
		ServerSays SS=new ServerSays();
		SS.start();
		
		while(true){
			System.out.print("Server Says: ");
			String serverMsg = ob.nextLine();
			out.println(serverMsg); // Send To Client
		}
	}
}






