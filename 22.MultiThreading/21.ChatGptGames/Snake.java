import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Snake implements KeyListener {
    JFrame win = new JFrame();
    ImageIcon[] runningFrames;
    JLabel heroLabel;
    int left = 100;
    int top = 100;
    int heroWidth = 50;
    int heroHeight = 50;
    int currentFrame = 0;

    Snake() {
        Toolkit kit = win.getToolkit();

        win.setBounds(0, 0, 500, 500);

        runningFrames = new ImageIcon[4];
        for (int i = 1; i < 4; i++) {                                
            runningFrames[i] = new ImageIcon("E:\\hero_" + i + ".jpg"); // Replace with your actual image files
        }

        heroLabel = new JLabel(runningFrames[0]);
        heroLabel.setBounds(left, top, heroWidth, heroHeight);
        
        Container con = win.getContentPane();
        con.setLayout(null);
        con.add(heroLabel);

        win.addKeyListener(this);
        win.setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        win.setTitle("Code: " + code);

        // Handle animation
        currentFrame = (currentFrame + 1) % runningFrames.length;
        heroLabel.setIcon(runningFrames[currentFrame]);
    }

    public void keyReleased(KeyEvent e) {}

    public void keyTyped(KeyEvent e) {}

    public static void main(String arg[]) {
        new Snake();
    }
}
