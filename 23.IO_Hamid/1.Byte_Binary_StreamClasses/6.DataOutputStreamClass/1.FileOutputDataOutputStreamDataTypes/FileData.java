import java.io.*;
class FileData{
	public static void main(String arg[])throws IOException{
		
		FileOutputStream f=new FileOutputStream("abc.txt");
		DataOutputStream file=new DataOutputStream(f);
		
		byte    a=100;
		short   b=10000;
		int     c=1000000000;
		long    d=1000000000000000000L;
		float   e=10000.99f;
		double  ee=1000000000000.99;
		boolean g=true;
		char    h='K';
		
		//writeInt(1);
		//writeInt(1000000000);
		
		//Fixed Length Record 
		file.writeInt(1000000000);
		file.writeInt(1);
		file.writeLong(1);
		
		
		file.writeByte(a);       //1 Byte
		file.writeShort(b);		 //2 Byte
		file.writeInt(c);		 //4 Byte
		file.writeLong(d);		 //8 Byte
		file.writeFloat(e);      //4 Byte	
		file.writeDouble(ee);    //8 Byte
		file.writeBoolean(g);	 //1 Byte
		file.writeChar(h);       //2 Byte
						//Total = 30 Bytes
		f.close();
		
	}
}