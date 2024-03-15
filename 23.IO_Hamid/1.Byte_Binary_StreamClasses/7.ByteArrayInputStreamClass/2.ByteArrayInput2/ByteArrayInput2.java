import java.io.*;
class ByteArrayInput2{
	public static void main(String arg[]){
		byte data[]="Sachal Sarmast Joyo".getBytes();
		
		ByteArrayInputStream in=new ByteArrayInputStream(data);
		int size=in.available();
		
		System.out.println("Size:"+size);
		
		for(int i=0; i<size; i++){
			int code=in.read();
			System.out.print((char)code);
		}
	}
}