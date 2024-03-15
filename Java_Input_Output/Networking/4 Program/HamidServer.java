import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
// import java.util.*;



class HamidServer implements ActionListener{
	// Scanner as=new Scanner(Syst em.in);
	
	PrintStream out;
	DataInputStream in;
	
	Font font=new Font("arial",Font.BOLD,20);
	
	Frame frame=new Frame(" Server is Hamid");
	TextArea area=new TextArea();
	
	TextField text=new TextField();
	Button button=new Button("click here");
	
	HamidServer(){

		
		frame.setLayout(null);
		frame.setBounds(0,0,600,590);
		
		area.setBounds(50,50,400,400);
		text.setBounds(50,500,400,40);
		button.setBounds(50,450,120,40);
		
		frame.add(area);
		frame.add(text);
		frame.add(button);
		
		area.setFont(font);
		text.setFont(font);
		button.setFont(font);
		
		button.addActionListener(this);
		
		frame.show();
		
		try{
			
			ServerSocket server=new ServerSocket(9090);

			System.out.println(" Server Starting...");

			Socket socket=server.accept();
			System.out.println("cliet connected...");

			in=new DataInputStream(socket.getInputStream());
			out=new PrintStream(socket.getOutputStream());
			
          MessageReceiverThread t=new MessageReceiverThread();
		  t.start();			
			}catch(Exception e){
			e.printStackTrace();
		}
	}//end constructor	
	class MessageReceiverThread extends Thread{
		//MessageReceiverThread(DataInputStream in);
		
		public void run(){
			try{
			
				
				while(true){
					
					String art=in.readLine();
					area.append("Hamid: "+art);
					// if(art.equals("1")){break;}
				}
				}catch(Exception ex){
       	         ex.printStackTrace();
				 javax.swing.JOptionPane.showMessageDialog(frame,"Disconnected."+ex.getMessage());
                 System.exit(0);				
		        }
		}//end run
	}//end inner class
	
	
	public void actionPerformed(ActionEvent e){
		
		
		if(text==e.getSource()){
			
			// while(true){
				
				
				
				area.append("Uzair: "+text.getText()+"\n");
				out.println(""+text.getText());
				text.setText("");
			.
			
		}
	}
	
	
	public static void main(String arg[]){
		
		HamidServer ob=new HamidServer();
	}
}

