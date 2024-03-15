import java.io.*;
import java.net.*;
class Downloader2{
	public static void main(String arg[])throws Exception{
	URL url=new URL("http://www.yahoo.com");
	
	InputStream in=url.openStream();	
	
	DataInputStream ds=new DataInputStream(in);

	String line=ds.readLine();
	
	while(line!=null){
		System.out.println(line);
		
		line=ds.readLine();
	}
	in.close();
	
	}
}