import java.io.*;
class Data{
	public static void main(String arg[]){
		try{
			FileInputStream f=new FileInputStream("abc.txt");
			DataInputStream file=new DataInputStream(f);
			
			int     a=file.readByte();       //1 Byte
			int     b=file.readShort();	  //2 Byte
			int     c=file.readInt();		  //4 Byte
			long    d=file.readLong();		  //8 Byte
			float   e=file.readFloat();      //4 Byte	
			double  ee=file.readDouble();   //8 Byte
			boolean g=file.readBoolean();	  //1 Byte
			char    h=file.readChar();       //2 Byte
									//Total  = 30 Bytes
							
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(e);
			System.out.println(ee);
			System.out.println(g);
			System.out.println(h);
			
			f.close();
		}catch(IOException e){
			System.out.println("FileNotfound");
		}
	}
}