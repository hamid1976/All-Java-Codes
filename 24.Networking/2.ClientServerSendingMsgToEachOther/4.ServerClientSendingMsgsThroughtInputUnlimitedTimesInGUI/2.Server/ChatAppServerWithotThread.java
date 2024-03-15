import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
public class ChatAppServerWithotThread implements ActionListener {
    Frame win = new Frame("Server");
    TextArea chatArea = new TextArea();
    TextField tf = new TextField();
    Button send = new Button("Send");
    PrintStream out;
    DataInputStream in;
	DataInputStream ob;

    public ChatAppServer() {
        win.setLayout(null);
		win.setBounds(0, 0, 400, 500); 
		win.setBackground(new Color(173, 216, 230));
		
		Font stylishFont = new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14);

		
		chatArea.setBounds(50, 50, 300, 350);
		chatArea.setBackground(Color.WHITE);
		chatArea.setEditable(false); 
		chatArea.setFont(stylishFont); 
		
		tf.setBounds(10, 410, 300, 30); 
		tf.setBackground(Color.WHITE); 
		tf.setFont(stylishFont); 

		
		send.setBounds(320, 410, 75, 30); 
		send.setBackground(new Color(37, 211, 102));
		send.setForeground(Color.WHITE);
		send.setFont(stylishFont); 

		
		win.add(chatArea);
		win.add(tf);
		win.add(send);

		
		tf.addActionListener(this);
		send.addActionListener(this);

		
		win.setVisible(true);
		
		try{
			ServerSocket server=new ServerSocket(1010);
			System.out.println("Waiting for Client Connection....");
			Socket socket=server.accept();
			System.out.println("Client Connected");
		    in=new DataInputStream(socket.getInputStream());
			out=new PrintStream(socket.getOutputStream());
			ob=new DataInputStream(System.in);
			
			// String msg=in.readLine();
			 //chatArea.append("Client Says:"+msg);
		   while(true){
			server();
		   }
		}catch(IOException e){}
	}//end Constructor
	
	public void server(){
		try{
			
		String msg=in.readLine();
		chatArea.append("\nClient Says:"+msg);
		}catch(IOException e){}
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==tf){
			String servermsg=tf.getText();
			if(servermsg!=null){
				chatArea.append("\nServer Says:"+servermsg);
				out.println(servermsg);
			}
			tf.setText("");
		}
		if(e.getSource()==send){
			String servermsg=tf.getText();
			if(servermsg!=null){
				chatArea.append("\nServer Says:"+servermsg);
				out.println(servermsg);
			}
			tf.setText("");
		}
	}//end Action Performed
	
	public static void main(String arg[])throws Exception{
		ChatAppServer ob1=new ChatAppServer();
	}
}
	
		