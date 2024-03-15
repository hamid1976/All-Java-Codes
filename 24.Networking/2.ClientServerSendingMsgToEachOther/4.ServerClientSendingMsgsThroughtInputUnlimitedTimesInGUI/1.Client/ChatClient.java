import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;

public class ChatClient implements ActionListener {
    private Frame win = new Frame("Client");
    private TextArea chatArea = new TextArea();
    private TextField tf = new TextField();
    private Button send = new Button("Send");
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;

    public ChatClient() {
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
            socket = new Socket("127.0.0.1", 9090);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            startCommunication();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void startCommunication() {
        Thread clientThread = new Thread(() -> {
            try {
                String msg;
                while ((msg = in.readLine()) != null) {
                    chatArea.append("Server Says: " + msg + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        clientThread.start();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tf) {
            String clientMsg = tf.getText();
            if (!clientMsg.isEmpty()) {
                chatArea.append("Client Says: " + clientMsg + "\n");
                out.println(clientMsg);
                tf.setText(""); // Clear the text field
            }
        }
    }

    public static void main(String[] args) {
        ChatClient ob1 = new ChatClient();
    }
}
