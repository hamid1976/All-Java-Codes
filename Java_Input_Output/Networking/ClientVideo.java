import java.net.*;
import java.io.*;
class ClientVideo{
	public static void main(String arg[])throws Exception{
		Socket socket=new Socket("192.168.1.100",9090);
		System.out.println("Connection Established");
		
		DataInputStream in=new DataInputStream(socket.getInputStream());
		FileOutputStream file=new FileOutputStream("./JamaimaKhan.mp4");
		
		int code;
		
		while((code=in.read())!=-1){
			  file.write(code);
		}
		
				in.close();
				file.close();
	}
}