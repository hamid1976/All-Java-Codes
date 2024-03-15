import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnumExample extends JFrame {
    // Enum definition
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    private JComboBox<Day> dayComboBox;

    public EnumExample() {
        // Set up the JFrame
        super("Enum Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(null);

        // Create and populate the JComboBox with enum values
        dayComboBox = new JComboBox<>(Day.values());
        dayComboBox.setBounds(50, 50, 200, 30);
        add(dayComboBox);

        // Create a button to display the selected day
        JButton displayButton = new JButton("Display Day");
        displayButton.setBounds(100, 100, 100, 30);
        add(displayButton);

        // Add ActionListener to the button
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieve the selected day from the JComboBox
                Day selectedDay = (Day) dayComboBox.getSelectedItem();

                // Display a message with the selected day
                JOptionPane.showMessageDialog(EnumExample.this, "Selected Day: " + selectedDay);
            }
        });

        // Set the JFrame visibility to true
        setVisible(true);
    }

    public static void main(String[] args) {
        // Run the GUI on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EnumExample();
            }
        });
    }
}
