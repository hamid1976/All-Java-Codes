import java.io.*;
class OutputLastExampleOfSir{
	public static void main(String arg[])throws Exception{
		String str="Hello Student:";
		
		ByteArrayOutputStream bOut=new ByteArrayOutputStream();
		
		for(int i=0; i<str.length(); i++){
			bOut.write(str.charAt(i));
		}
		
		FileInputStream f=new FileInputStream("xyz.txt");
		int size=f.available();
		
		for(int i=0; i<size; i++){
			int code=f.read();
			bOut.write(code);
		}
		
		byte data[]=bOut.toByteArray();
		
		String s=new String(data,0,data.length);
		
		System.out.println(s);
	}
}