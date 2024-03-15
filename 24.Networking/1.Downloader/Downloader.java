import java.io.*;
import java.net.*;
class Downloader{
	public static void main(String arg[])throws Exception{
	URL url=new URL("http://www.google.com");
	
	InputStream in=url.openStream();	
	
	DataInputStream ds=new DataInputStream(in);
	FileOutputStream fout=new FileOutputStream("a.txt");

	int code;
	while((code=ds.read())!=-1){
		//System.out.println(code);
		 fout.write(code);
	
	}
	fout.close();
	
	}
}