import java.io.*;
class ByteArrayOutputStream1{
	public static void main (String arg[]){
		String data="Uzair Ahmed";
		try{
			ByteArrayOutputStream in=new ByteArrayOutputStream();
			byte[] array=data.getBytes();
			
			in.write(array);
			
			String nameSum=in.toString();
			
			System.out.println("OutputStream:"+nameSum);
			in.close();
		}catch(Exception e){e.printStackTrace();}
	}
}