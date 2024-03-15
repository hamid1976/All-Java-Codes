import java.io.*;
class ByteArrayOutputStream3{
	public static void main(String arg[]){
	try{
		String str="Hello students";
		ByteArrayOutputStream bOut=new ByteArrayOutputStream();
		
		for(int i=0; i<str.length(); i++){
			bOut.write(str.charAt(i));
		}
		FileInputStream f=new FileInputStream("a2.txt");
		int size =f.available();
		for(int i=0; i<size; i++){
			int code=f.read();
			bOut.write(code);
		}
		byte data[]=bOut.toByteArray();
		String s=new String (data,0,data.length);
		System.out.println(s);
	}catch(Exception e){e.printStackTrace();}
	}
}