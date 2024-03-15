import java.io.*;
import java.net.*;
import java.util.*;
class Client2{
    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("192.168.43.166", 9090);

        Scanner ob = new Scanner(System.in);
        DataInputStream in = new DataInputStream(socket.getInputStream());
        PrintStream out = new PrintStream(socket.getOutputStream());

       
	    class ClientSays extends Thread{
            public void run() {
                 try {
                    while (true) {
                        String msg = in.readLine(); // Receive from Server
                        System.out.println("\nServer Says: " + msg);						
					}
					
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
		ClientSays CS=new ClientSays();
		CS.start();
    	 
	  
        while (true) {
			System.out.print("Client Says: ");
			String clientMsg = ob.nextLine();
			out.println(clientMsg); // Send To Server
			
        }
     }
}











