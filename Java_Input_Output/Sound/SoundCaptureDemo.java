import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SoundCaptureDemo extends JFrame{
     JButton record,play,save;
     JLabel lbl;
     SoundCaptureDemo(){
          record = new JButton("Record");
          play = new JButton ("Play");
          save = new JButton ("Save");
          lbl = new JLabel ("");
          setLayout (new GridLayout(4,1));
          setSize (400,200);
          add(record);
          add(play);
          add(save);
          add(lbl);
          setVisible(true);

          //setDefaultsaveOperation(JFrame.EXIT_PLAY_SAVE);
          ButtonHandler bh = new ButtonHandler();
          record.addActionListener(bh);
          record.addActionListener(bh);
          play.addActionListener(bh);
          save.addActionListener(bh);
     }
     class ButtonHandler implements ActionListener{
          public void actionPerformed(ActionEvent ae){
               if (ae.getSource()==record){
                    lbl.setText("Button Record is pressed");
               }
                    
               if (ae.getSource()==play){
                    lbl.setText("Button Play is pressed");
                    // get an AudioInputStream of the desired format for playback


               }
               if (ae.getSource()==save){
                    lbl.setText("Button Save is pressed");
               }
          }
     }
     public static void main(String args[]){
          SoundCaptureDemo ob = new SoundCaptureDemo();
     }
}