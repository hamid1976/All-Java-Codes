import java.io.*;
import java.net.*;
class ClientFileFolder{
	public static void main(String args[])throws Exception{
	//	String address=args[0];
		//String filename=args[1];
		
		String folderpath="E:/SirSachaljava/javawork";
		File folder=new File(folderpath);
		//String files=new folder.list();
		File files[]=folder.listFiles();
		for(int i=0; i<files.length;i++){
			if(files[i].isDirectory())continue;
			
			
		FileInputStream f=new FileInputStream(folderpath);
		DataInputStream dis=new DataInputStream(f);
		
		int size=f.available();
		byte data[]=new byte[size];
		dis.readFully(data,0,size);
		
	    //Socket socket=new Socket(address,9090);
        Socket socket=new Socket("localhost",9090);
		PrintStream out=new PrintStream(socket.getOutputStream());
		DataInputStream in=new DataInputStream(socket.getInputStream());
		
		out.println(size);
		//out.println(address);
		out.println(folderpath);
		out.write(data,0,size);
		out.close();
		in.close();
		}//end for loop
	}
}