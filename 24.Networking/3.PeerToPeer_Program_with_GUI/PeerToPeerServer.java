import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class PeerToPeerServer implements KeyListener{
    private Frame win = new Frame("Server");
    private TextArea chatArea = new TextArea();
    private TextField tf = new TextField();
    private Label msg = new Label("Message");
    private Label lab = new Label("IP-Address:");
    private TextField iptext = new TextField();
    private ServerSocket serverSocket;
    private List<PrintStream> clientOutputStreams = new ArrayList<>();
    private TextField serverInput = new TextField();
    private Button sendButton = new Button("Send");

    public PeerToPeerServer() {
        win.setLayout(null);
        win.setBounds(0, 0, 400, 515);
        win.setBackground(new Color(173, 216, 230));

        Font stylishFont = new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14);
        Font style = new Font("and", Font.BOLD, 17);

        chatArea.setBounds(50, 50, 310, 350);
        chatArea.setBackground(Color.WHITE);
        chatArea.setEditable(false);
        chatArea.setFont(stylishFont);


        tf.setBounds(130, 420, 230, 30);
        tf.setBackground(Color.WHITE);
        tf.setFont(stylishFont);

        msg.setBounds(46, 420, 300, 30);
        msg.setFont(style);

        win.add(chatArea);
        win.add(tf);
        win.add(msg);
        tf.addKeyListener(this);  
     

        win.setVisible(true);

        try {
            serverSocket = new ServerSocket(9090);
            while (true) {
                    System.out.println("Server is waiting for a client...");
                    Socket socket = serverSocket.accept();
                    System.out.println("Client connected.");   
                    DataInputStream in = new DataInputStream(socket.getInputStream());
                    PrintStream out = new PrintStream(socket.getOutputStream());
                    clientOutputStreams.add(out);
               
                  ClientSays cs=new ClientSays(in);
                   cs.start();
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }// end of cons ChatAppServer()

   



       

      
    class ClientSays extends Thread{
        private final DataInputStream in;

        ClientSays(DataInputStream in){
            this.in = in;
        }
        public void run(){
            try{
                while(true){
                    String msg=in.readLine();
                     chatArea.append("Client Says: " + msg + "\n");
                      broadcastToClients("Client Says: " + msg);
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }



 


    private void broadcastToClients(String message) {
        synchronized (clientOutputStreams) {
            for (PrintStream clientOutputStream : clientOutputStreams) {
                clientOutputStream.println(message);
                clientOutputStream.flush();
            }
        }
    }


       public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                String serverMsg = tf.getText();
                chatArea.append("Server Says: " + serverMsg + "\n");
                // Broadcast the server's message to all clients
                broadcastToClients("Server Says: " + serverMsg);
                tf.setText(""); // Clear the text field
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        PeerToPeerServer ob1 = new PeerToPeerServer();
    }


}
