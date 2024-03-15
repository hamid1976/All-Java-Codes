import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;

public class ChatAppServer implements ActionListener {
    Frame win = new Frame("Server");
    TextArea chatArea = new TextArea();
    TextField tf = new TextField();
    Button send = new Button("Send");
    PrintStream out;
    DataInputStream in;

    public ChatAppServer() {
        win.setLayout(null);
		win.setBounds(0, 0, 400, 500); 
		win.setBackground(new Color(173, 216, 230));
		
		Font stylishFont = new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14);
		
		//192.168.43.34
	
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

        try {	
            ServerSocket serverSocket = new ServerSocket(9090);
            System.out.println("Server is waiting for a client...");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");
			in=new DataInputStream(socket.getInputStream());
		    out=new PrintStream(socket.getOutputStream());
		
			ServerSays ss=new ServerSays();
			ss.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	class ServerSays extends Thread{
		public void run(){
			try{
				while(true){
					String msg=in.readLine();
					chatArea.append("Client Says:"+msg+"\n");
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tf) {
            String serverMsg = tf.getText();
            if (serverMsg!=null) {
                chatArea.append("Server Says: " + serverMsg + "\n");
                out.println(serverMsg);
                tf.setText(""); // Clear the text field
            }
        }
		if (e.getSource() == send) {
            String serverMsg = tf.getText();
            if (serverMsg!=null) {
                chatArea.append("Server Says: " + serverMsg + "\n");
                out.println(serverMsg);
                tf.setText(""); // Clear the text field
            }
        }
    }

    public static void main(String[] args) {
        ChatAppServer ob1 = new ChatAppServer();
    }
}
