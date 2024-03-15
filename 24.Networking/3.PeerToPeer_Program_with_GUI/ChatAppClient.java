import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;

public class ChatAppClient implements ActionListener {
    Frame win = new Frame("Client");
    TextArea chatArea = new TextArea();
    TextField tf = new TextField();
    Label msg = new Label("Message:");
    Label lab = new Label("Server IP:");
    TextField iptext = new TextField();
    Button connect = new Button("Connect");
    PrintStream out;
    BufferedReader in;
    Socket socket;

    public ChatAppClient(){
        win.setLayout(null);
        win.setBounds(0, 0, 400, 530);
        win.setBackground(new Color(173, 216, 230));

        Font stylishFont = new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14);
        Font style = new Font("and", Font.BOLD, 17);

        chatArea.setBounds(50, 50, 310, 350);
        chatArea.setBackground(Color.WHITE);
        chatArea.setEditable(false);
        chatArea.setFont(stylishFont);

        iptext.setBounds(160, 410, 200, 30);
        iptext.setFont(stylishFont);
        win.add(iptext);

        lab.setBounds(55, 410, 100, 30);
        lab.setFont(style);
        win.add(lab);

        tf.setBounds(160, 450, 200, 30);
        tf.setBackground(Color.WHITE);
        tf.setFont(stylishFont);

        msg.setBounds(55, 450, 100, 30);
        msg.setFont(style);

        connect.setBounds(50, 490, 100, 30);
        connect.setBackground(new Color(37, 211, 102));
        connect.setForeground(Color.WHITE);
        connect.setFont(stylishFont);

        win.add(chatArea);
        win.add(tf);
        win.add(msg);
        win.add(connect);

        tf.addActionListener(this);
        connect.addActionListener(this);

        win.setVisible(true);
    }

    public void connectToServer() {
        try {
            String serverIP = iptext.getText();
            socket = new Socket(serverIP, 9090);
            out = new PrintStream(socket.getOutputStream());
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

           // Start a separate thread to receive messages from the server
            ClientSays cs = new ClientSays();
            Thread t = new Thread(cs);
            t.start();

            chatArea.setText("Connected to server at " + serverIP + "\n");
        } catch (IOException e) {
            e.printStackTrace();
            chatArea.setText("Connection failed. Check the server IP.\n");
        }
    }

    
    class ClientSays implements Runnable {
        public void run() {
            try {
                while (true) {
                    String msg = in.readLine();
                    if (msg != null) {
                        chatArea.append("Server Says: " + msg + "\n");
                        System.out.println("Testing....."+ msg);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tf) {
            String clientMsg = tf.getText();
            if (clientMsg != null) {
                chatArea.append("You Say: " + clientMsg + "\n");
                out.println(clientMsg);
                tf.setText(""); // Clear the text field
            }
        } else if (e.getSource() == connect) {
            connectToServer();
        }
    }

    public static void main(String[] args) {
        ChatAppClient ob1 = new ChatAppClient();
    }
}
