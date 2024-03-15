import java.io.*;
class ByteArrayInput{
	public static void main(String arg[]){
		byte data[]="Sachal Sarmast Joyo".getBytes();
		
		ByteArrayInputStream in=new ByteArrayInputStream(data);
		int size=in.available();
		
		System.out.println("Size:"+size);
		
		for(int i=0; i<size; i++){
			int code=in.read();
			System.out.print((char)code);
		}
		
		byte record[]=new byte[size];
		
		int num=in.read(record,0,size);
		
		String str=new String(record,0,size);
		
		System.out.println(str);
	}
}