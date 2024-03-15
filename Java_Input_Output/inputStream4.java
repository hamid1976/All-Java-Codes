import java.io.*;
class inputStream4{
	public static void main(String args []){
		try{
			DataInputStream  k = new DataInputStream(System.in);
			while(true){	
			System.out.println("Enter your name : ");
			
			String name = k.readLine();
			if(name.equalsIgnoreCase("exit")){
				break;
			}
			System.out.println("your name is "+name);
			}
		}catch(Exception e){e.printStackTrace();
		
		System.out.println("Exception errror");
		}
}
}