import java.io.*;
class ByteArrayInputStream1{
	public static void main (String arg[]){
		byte data[]="Hamid Shaikh".getBytes();
		
		ByteArrayInputStream in=new ByteArrayInputStream(data);
        int size=in.available();
             for(int i=0; i<size; i++){
                  int code=in.read();
		               System.out.print((char)code);
		     }
	}
}	