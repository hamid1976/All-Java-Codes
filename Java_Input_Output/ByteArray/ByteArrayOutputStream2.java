import java.io.*;
class ByteArrayOutputStream2{
	public static void main (String arg[]){
		String data="sachal sarmast";
		try{
			ByteArrayOutputStream in=new ByteArrayOutputStream();
			in.write(data.getBytes());
			byte[] byteData=in.toByteArray();
			
			for(int i=0; i<byteData.length;i++){
			System.out.print((char)byteData[i]);
			}
			in.close();
		}catch(Exception e){e.printStackTrace();}
	}
}