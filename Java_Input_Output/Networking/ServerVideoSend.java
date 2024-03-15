import java.net.*;
import java.io.*;
class ServerVideoSend{
	public static void main(String arg[])throws Exception{
		Socket socket=new Socket("192.168.1.100",9090);
		System.out.println("Server Started");
		
		Socket socket=server.accept();//wait until Connection Established By The Client
		System.out.println("Client Connected....");
		FileInputStream in=new FileInputStream("y2.mp4");
		
		PrintStream out=new PrintStream(socket.getOutputStream());
		
		int code;
		
		while((code=in.read())!=-1){
			  out.write(code);
		}
		
				in.close();
				out.close();
	}
}