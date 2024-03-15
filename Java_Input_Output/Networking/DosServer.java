import java.io.*;
import java.net.*;
import java.util.*;

class DosServer{
	public static void main(String arg[]){
		
		try{
			ServerSocket server=new ServerSocket(9090);
            System.out.println(" Server Starting...");

			Socket socket=server.accept();
			System.out.println("cliet connected...");

			DataInputStream in=new DataInputStream(socket.getInputStream());
			PrintStream out=new PrintStream(socket.getOutputStream());
				
			MessageReceiverThread t=new MessageReceiverThread(in);
			t.start();
			
			MessageSenderThread t2=new MessageSenderThread(out);
			t2.start();
		}catch(Exception e){}		
	}
	static	class MessageReceiverThread extends Thread{
			DataInputStream in;
			MessageReceiverThread(DataInputStream in){
				this.in=in;
			}
			public void run(){
				try{
					while(true){
						System.out.print("Enter Message: ");
						String Message2=in.readLine();
						System.out.print("\nHamid: "+Message2+"\n");
					}
				}catch(Exception ex){
					ex.printStackTrace();
					javax.swing.JOptionPane.showMessageDialog(null,"Disconnected. "+ex.getMessage());
					System.exit(0);
				}
		
			}
		}					
	static class MessageSenderThread extends Thread{
			PrintStream out;
			MessageSenderThread(PrintStream out){
				this.out=out;
			}
			Scanner as=new Scanner(System.in);
			public void run(){	
				try{
					int i=0;
					while(true){
						
						if(i>=1){
							System.out.print("Enter Message: ");
						}
						i++;
						
						String Message=as.nextLine();
						
						out.println(Message);
					}
				}catch(Exception ex2){
					ex2.printStackTrace();
					javax.swing.JOptionPane.showMessageDialog(null,"Disconnected. "+ex2.getMessage());
					System.exit(0);
				}
		
			}
		}
}

