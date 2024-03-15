import java.io.*;
import java.net.*;
import java.util.*; 


class DosClient{
	public static void main(String arg[]){
		try{
				
			Socket socket=new Socket("127.101.1.1",9090);
			// Socket socket=new Socket("192.168.1.100",9090);
			System.out.println("connected established...");
			
			
			DataInputStream in=new DataInputStream(socket.getInputStream());
			PrintStream out=new PrintStream(socket.getOutputStream());
			
	     	MessageSenderThread tt=new MessageSenderThread(out);
			tt.start();
				
			MessageReceiverThread t=new MessageReceiverThread(in);
			t.start();
				
			}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	static class MessageReceiverThread extends Thread{
		
		DataInputStream in;	
		MessageReceiverThread(DataInputStream in){
			this.in=in;
		}
		public void run(){
			try{
				while(true){
					System.out.print("Enter Message: ");
					String art=in.readLine();
					System.out.println("\nHamid: "+art);

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

