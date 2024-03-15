import java.io.*;
class byteStream{
	public static void main(String args []){
		try{
			FileOutputStream f= new FileOutputStream("Hamid.txt");
			DataOutputStream file = new DataOutputStream(f);
			
			byte a = 100;
			short b =10000;
			int c  = 1000000000;
			long d = 1000000000000000000L;
			float e = 10000.99f;
			
	        file.writeByte(a);
			file.writeShort(b);
			file.writeInt(c);
			
			f.close();
			
		}catch(Exception e){e.printStackTrace();
		
		System.out.println("Exception errror");
		}
}
}