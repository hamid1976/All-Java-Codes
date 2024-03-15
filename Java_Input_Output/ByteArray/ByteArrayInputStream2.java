import java.io.*;
class ByteArrayInputStream2{
	public static void main (String arg[]){
		byte data[]="Hamid Shaikh".getBytes();
		ByteArrayInputStream in=new ByteArrayInputStream(data);
		
		int size=in.available();
		byte record[]=new byte[size];
		
		int num=in.read(record,0,size);
		
		String str=new String(record,0,size);
		System.out.print(str);
	}
	
}