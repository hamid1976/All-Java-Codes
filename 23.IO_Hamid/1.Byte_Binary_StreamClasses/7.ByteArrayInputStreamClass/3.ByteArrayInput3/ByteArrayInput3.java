import java.io.*;
class ByteArrayInput3{
	public static void main(String arg[]){
		byte data[]="Hamidullah Shaikh".getBytes();
		
		ByteArrayInputStream in=new ByteArrayInputStream(data);
		int size=in.available();
		
		System.out.println("Size:"+size);
		
		byte record[]=new byte[size];
		
		int num=in.read(record,0,size);
		
		String str=new String(record,0,size);
		
		System.out.println(str);
	}
}