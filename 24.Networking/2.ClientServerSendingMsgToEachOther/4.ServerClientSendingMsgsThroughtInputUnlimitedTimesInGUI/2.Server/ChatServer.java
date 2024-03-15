import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;

public class ChatServer implements ActionListener {
    private Frame win = new Frame("Server");
    private TextArea chatArea = new TextArea();
    private TextField tf = new TextField();
    private Button send = new Button("Send");
    private ServerSocket serverSocket;
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;

    public ChatServer() {
        win.setLayout(null);
        win.setBounds(0, 0, 400, 400);
        win.setBackground(Color.BLACK);

        chatArea.setBounds(50, 50, 300, 300);

        tf.setBounds(10, 360, 300, 30);
        tf.setBackground(Color.WHITE);

        send.setBounds(305, 360, 90, 30);
        send.setBackground(Color.GREEN);

        win.add(chatArea);
        win.add(tf);
        win.add(send);

        tf.addActionListener(this);
        send.addActionListener(this);

        win.setVisible(true);

        try {
            serverSocket = new ServerSocket(9090);
            System.out.println("Server is waiting for a client...");
            socket = serverSocket.accept();
            System.out.println("Client connected.");
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            startCommunication();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void startCommunication() {
        Thread serverThread = new Thread(() -> {
            try {
                String msg;
                while ((msg = in.readLine()) != null) {
                    chatArea.append("Client Says: " + msg + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        serverThread.start();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tf) {
            String serverMsg = tf.getText();
            if (!serverMsg.isEmpty()) {
                chatArea.append("Server Says: " + serverMsg + "\n");
                out.println(serverMsg);
                tf.setText(""); // Clear the text field
            }
        }
    }

    public static void main(String[] args) {
        ChatServer ob1 = new ChatServer();
    }
}
