import java.io.*;
public class PushbackFileReading{
      public static void main(String[] args) throws IOException{
		 String filepath = "a2.txt";
		 FileInputStream fis = new FileInputStream(filepath);
		 PushbackInputStream pushback = new PushbackInputStream(fis);
		 
		// Read a single byte at a time and print it.
		   byte bytedata;
		   while((bytedata = (byte)pushback.read()) != -1){
			   System.out.print((char)bytedata);   

		// Unread the last byte that we have just read.
		      pushback.unread(bytedata);
		   
		// Reread the byte we unread (or pushed back).
		   bytedata = (byte)pushback.read();
		   System.out.print((char)bytedata);
		   }
	  }
}