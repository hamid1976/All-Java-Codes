import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
public class ChatAppClientWithotThread implements ActionListener {
    Frame win = new Frame("Client");
    TextArea chatArea = new TextArea();
    TextField tf = new TextField();
    Button send = new Button("Send");
    PrintStream out;
    DataInputStream in;
	DataInputStream ob;

    public ChatAppClient() {
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
			Socket socket=new Socket("127.0.0.1",1010);
		    in=new DataInputStream(socket.getInputStream());
			out=new PrintStream(socket.getOutputStream());
			ob=new DataInputStream(System.in);
			
			while(true){
				client();
			}
		}catch(IOException e){}
	}//end Constructor
	
	public void client(){
		try{
		String msg=in.readLine();
		chatArea.append("\nServer Says:"+msg);
		}catch(IOException e){}
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==tf){
			String clientmsg=tf.getText();
			if(clientmsg!=null){
				chatArea.append("\nClient Says:"+clientmsg);
				out.println(clientmsg);
			}
			tf.setText("");
		}
		if(e.getSource()==send){
			String clientmsg=tf.getText();
			if(clientmsg!=null){
				chatArea.append("\nClient Says:"+clientmsg);
				out.println(clientmsg);
			}
			tf.setText("");
		}
	}//end Action Performed
	
	public static void main(String arg[])throws Exception{
		ChatAppClient ob1=new ChatAppClient();
	}
}
	
		