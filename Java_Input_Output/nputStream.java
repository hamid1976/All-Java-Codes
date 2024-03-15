import java.io.*;
class nputStream{
	public static void main(String arg[]){
		try{
			FileInputStream f=new FileInputStream("Hamid.txt");
			DataInputStream dis=new DataInputStream(f);
			String line=dis.readLine();
			System.out.println(line);
			
	        }catch(Exception e){
			e.printStackTrace();
			e.getMessage();
			System.out.println("Exception Error");
		}
	}
}