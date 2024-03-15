import java.io.*;
import java.net.*;
public class GetTime{
	public static void main(String args[]){
		Socket socket;
		String host="localhost";
		
		if(args.length>0){
			host=args[0];
		}
		
		try{
			socket = new Socket(host,13);
			
			BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//read the first line from host
			String time=in.readLine();
			//print time to standard out
			System.out.println("The time on host "+host+ " is "+time);
		}catch(UnknownHostException e){
			System.out.println("Host is Invalid");
		}catch(IOException e){
			System.out.println("Error Openeing socket: "+e);
		}
	}
}








// import java.io.*;
// import java.net.*;
// public class GetTime{
	// public static void main(String args[]){
		// Socket socket;
		// String host="localhost";
		
		// if(args.length>0){
			// host=args[0];
		// }
		
		// try{
			// socket = new Socket(host,13);
			
			// BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//	read the first line from host
			// String time=in.readLine();
			//print time to standard out
			// System.out.println("The time on host "+host+ " is "+time);
		// }catch(UnknownHostException e){
			// System.out.println("Host is Invalid");
		// }catch(IOException e){
			// System.out.println("Error Openeing socket: "+e);
		// }
	// }
// }