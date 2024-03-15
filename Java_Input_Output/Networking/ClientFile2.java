import java.io.*;
import java.net.*;
class ClientFile2{
	public static void main(String args[])throws Exception{
		String address=args[0];
		String filename=args[1];
		//String filename="e:/AllahuAkber.mp3";
		FileInputStream f=new FileInputStream(filename);
		DataInputStream dis=new DataInputStream(f);
		
		int size=f.available();
		byte data[]=new byte[size];
		dis.readFully(data,0,size);
		
		Socket socket=new Socket(address,9090);
		PrintStream out=new PrintStream(socket.getOutputStream());
		DataInputStream in=new DataInputStream(socket.getInputStream());
		
		out.println(size);
		out.println(filename);
		out.write(data,0,size);
		out.close();
		in.close();
	}
}