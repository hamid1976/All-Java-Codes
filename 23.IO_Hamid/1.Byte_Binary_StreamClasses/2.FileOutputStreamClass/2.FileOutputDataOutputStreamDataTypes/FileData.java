import java.io.*;
class FileData{
	public static void main(String arg[])throws IOException{
		
		FileOutputStream f=new FileOutputStream("xyz.txt");
		DataOutputStream file=new DataOutputStream(f);
		
		byte    a=100;
		short   b=10000;
		int     c=1000000000;
		long    d=1000000000000000000L;
		float   e=10000.99f;
		double  ee=1000000000000.99;
		boolean g=true;
		char    h='K';
		
		file.writeByte(a);       //1 Byte
		file.writeShort(b);		 //2 Byte
		file.writeInt(c);		 //4 Byte
		file.writeLong(d);		 //8 Byte
		file.writeFloat(e);      //4 Byte	
		file.writeDouble(ee);    //8 Byte
		file.writeBoolean(g);	 //1 Byte
		file.writeChar(h);  //2 Byte
		
		f.close();
		
	}
}