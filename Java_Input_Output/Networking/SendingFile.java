import java.io.*;
import java.net.*;
public class SendingFile{
	public static void main(String arg[])throws Exception{
		Socket socket=new Socket("127.0.0.1",9090);
		
		DataInputStream in=new DataInputStream(socket.getInputStream());
		PrintStream out=new PrintStream(socket.getOutputStream());
		
		String filename=