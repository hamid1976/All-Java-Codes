import java.io.*;
import java.net.*;
class ServerdownloaderFile{
	public static void main(String arg[])throws Exception{
		new File("e:/download").mkdirs();
		ServerSocket server=new ServerSocket(9090);
		do{
			Socket socket=server.accept();
			System.out.println("Client Connected");
			
			DataInputStream in=new DataInputStream(socket.getInputStream());
			PrintStream out=new PrintStream(socket.getOutputStream());
			
			String NoOfFiles=in.readLine();
		    for(int i=0; i<Integer.parseInt(NoOfFiles); i++){
			String fileSizeStr=in.readLine();
			System.out.println(fileSizeStr+(" fileSizeStr Test Variable"));
			String fileNameStr=in.readLine();
			System.out.println(fileNameStr+(" fileNameStr Test Variable"));
			
			int fileSize=Integer.parseInt(fileSizeStr);
			byte[] data=new byte[fileSize];
			
			FileOutputStream f=new FileOutputStream("E:/download/"+fileNameStr);
			in.readFully(data,0,fileSize);
			f.write(data,0,fileSize);
			out.println("Ok....");
		
		     f.close();
			 in.close();
			 out.close();
			 socket.close();
			}
		}while(true);
		
	}
}