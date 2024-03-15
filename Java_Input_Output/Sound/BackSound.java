import sun.audio.*;
import java.awt.event.ActionEvent;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.*;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.*;

//2nd we create our method inside our class
public class BackSound extends JFrame{


    public static void main(String[] args){
      JFrame frame = new JFrame("BackSound");   
      frame.setSize(300, 300);
      JButton button = new JButton("Turn On Sound"); //we create the buttons to click
      frame.add(button);
      button.addActionListener(new AL());
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static class AL implements ActionListener{
        public final void actionPerformed(ActionEvent e){
        //here we creates a method AL that implements ActionListener for the button
            music();
        }}

    public static void music(){
        AudioPlayer MGP = AudioPlayer.player; //here we create an AudioPlayer from sun.audio
        AudioStream BGM; //here we create an AudioStream from sun.audio
        AudioData MD; //here we create an AudioData from sun.audio


        ContinuousAudioDataStream loop = null;
        //here we loop our audio inside the program

        try{
        BGM = new AudioStream(new FileInputStream("subhanallah.mp3")); //here we find our sound file
        MD = BGM.getData();
        loop = new ContinuousAudioDataStream(MD);
        }catch(IOException error){
            System.out.println("yo");
        }

        MGP.start(loop); 
    }
}