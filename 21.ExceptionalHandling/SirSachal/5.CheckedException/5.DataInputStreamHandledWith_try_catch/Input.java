import java.io.*;
class Input{
	public static void main(String arg[]){
		try{
			DataInputStream in=new DataInputStream(System.in);
			
			System.out.print("Enter Any No:");
			String s=in.readLine();
			int a=Integer.parseInt(s);
			System.out.println("Square="+a*a);
		}catch(IOException e){
			System.out.println("Connection dissconnected");
		}
	}
}