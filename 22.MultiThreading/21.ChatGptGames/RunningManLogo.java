import javax.swing.*;
import java.awt.*;

public class RunningManLogo extends JFrame {
    public RunningManLogo() {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(3));
        
        int left = 50;
        int top = 50;

        // Body
        g2d.drawOval(left + 20, top + 20, 60, 100);

        // Legs
        g2d.drawLine(left + 50, top + 120, left + 30, top + 180);
        g2d.drawLine(left + 70, top + 120, left + 90, top + 180);

        // Arms
        g2d.drawLine(left + 30, top + 60, left - 20, top + 40);
        g2d.drawLine(left + 90, top + 60, left + 130, top + 40);

        // Head
        g2d.drawOval(left + 20, top - 20, 60, 60);

        // Eyes
        g2d.fillOval(left + 35, top + 5, 10, 10);
        g2d.fillOval(left + 55, top + 5, 10, 10);

        // Mouth
        g2d.drawArc(left + 35, top + 25, 30, 20, 0, -180);

        // Label
        g2d.setFont(new Font("Arial", Font.BOLD, 14));
        g2d.drawString("Running Man", left + 15, top + 210);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RunningManLogo());
    }
}
