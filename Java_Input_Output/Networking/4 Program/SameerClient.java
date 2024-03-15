import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
//import java.util.*;


class SameerClient implements ActionListener{
	// Scanner as=new Scanner(System.in);
	
	Font font=new Font("arial",Font.BOLD,20);
	
	DataInputStream in;
	PrintStream out;
	
	Frame frame=new Frame(" Customer is Client ");
	TextArea area=new TextArea();
	
	TextField text=new TextField();
	Button button=new Button("click here"); 
	
	SameerClient(){
	
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
			
			// Socket socket=new Socket("127.0.1.1",9090);
			Socket socket=new Socket("192.168.1.100",9090);
			
			System.out.println("connected established...");
			
			
			in=new DataInputStream(socket.getInputStream());
			out=new PrintStream(socket.getOutputStream());
			
		  MessageReceiverThread t=new MessageReceiverThread();
		  t.start();
		}catch(Exception e){
			e.printStackTrace();
		}
	}//end constructor
	class MessageReceiverThread extends Thread{
		
		
		public void run(){
			
				try{
					while(true){
						
						String art=in.readLine();
						area.append("Sameer: "+art+"\n");
						//if(art.equals("1")){break;}
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
			
		
				area.append("Uzair: "+text.getText()+"\n");
				out.println(""+text.getText());
				text.setText("");
				
			
			
			
		}
	}
	
	
	public static void main(String arg[]){
		
		SameerClient ob=new SameerClient();
	}
}

