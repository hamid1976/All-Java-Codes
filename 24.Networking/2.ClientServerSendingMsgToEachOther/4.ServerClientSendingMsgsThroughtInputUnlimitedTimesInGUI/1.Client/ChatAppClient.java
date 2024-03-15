import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;

public class ChatAppClient implements ActionListener {
    Frame win = new Frame("Client");
    TextArea chatArea = new TextArea();
    TextField tf = new TextField();
    Button send = new Button("Send");
    PrintStream out;
    DataInputStream in;

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

		
		win.setVisible(true);;
		
        try {
            Socket socket = new Socket("192.168.43.76", 9090);
            in=new DataInputStream(socket.getInputStream());
		    out=new PrintStream(socket.getOutputStream());

			ClientSays cs=new ClientSays();
			cs.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	class ClientSays extends Thread{
		public void run(){
			try{
				while(true){
					String msg=in.readLine();
					chatArea.append("Server Says:"+msg+"\n");
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tf) {
            String clientMsg = tf.getText();
            if (clientMsg!=null) {
                chatArea.append("Client Says: " + clientMsg + "\n");
                out.println(clientMsg);
                tf.setText(""); // Clear the text field
            }
        }
		if (e.getSource() == send) {
            String clientMsg = tf.getText();
            if (clientMsg!=null) {
                chatArea.append("Client Says: " + clientMsg + "\n");
                out.println(clientMsg);
                tf.setText(""); // Clear the text field
            }
        }
    }

    public static void main(String[] args) {
        ChatAppClient ob1 = new ChatAppClient();
    }
}
