import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.TargetDataLine;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;

import javax.swing.*;
import java.io.*; 
import java.awt.*;
import java.awt.event.*;

class RecordTest3 implements ActionListener{
	
	Play PlayClip=new Play();
		
	Playback playback=new Playback();
	
	Frame frame=new Frame("Recording with save Testing");
	
	Button recordButton=new Button("Record");
	Button playButton=new Button("Play");
	Button saveButton=new Button("Save");
	
	TargetDataLine targetLine;
	
	RecordTest3(){
		
		frame.setLayout(null);
		frame.setBounds(100,100,500,500);
		
		recordButton.setBounds(200,100,100,40);
		playButton.setBounds(200,150,100,40);
		saveButton.setBounds(200,200,100,40);
		
		recordButton.addActionListener(this);
		playButton.addActionListener(this);
		saveButton.addActionListener(this);
		
		
		frame.add(recordButton);
		frame.add(playButton);
		frame.add(saveButton);
		
		frame.show(); 
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(playButton==e.getSource()){
			// targetLine.stop();
			PlayClip.start();
			// System.out.println("play Button start...");
			recordButton.setEnabled(true);
			saveButton.setEnabled(true);
			playButton.setEnabled(false);
		}else{
			
			PlayClip.stop();
		}
		
		if(recordButton==e.getSource()){
			// System.out.println("recordButton start...");
			playback.start();
			recordButton.setEnabled(false);
			saveButton.setEnabled(true);
			playButton.setEnabled(true);
		}else{
			// System.out.println("recordButton start... 2");
			playback.stop();
			
		}
 		
		if(saveButton==e.getSource()){
			// System.out.println("save Button start...");
			targetLine.stop();
			targetLine.close();
			recordButton.setEnabled(true);
			saveButton.setEnabled(false);
			playButton.setEnabled(true);
		}		
	}
	
	public class Playback implements Runnable {
		
		Thread thread;
		
		public void start() {
		  thread = new Thread(this);
		  thread.setName("Playback");
		  thread.start();
		}

		public void stop() {
		  thread = null;
		}

		public void run(){			
			try{
				AudioFormat audioFormat=new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, 44100, 16, 2, 4, 44100, false);
				
				DataLine.Info dataInfo=new DataLine.Info(TargetDataLine.class, audioFormat);
				if((!AudioSystem.isLineSupported(dataInfo))){
					System.out.println("Not Supported");
				}
				
				targetLine=(TargetDataLine)AudioSystem.getLine(dataInfo);
				targetLine.open();
				
				// JOptionPane.showMessageDialog(null," Hit ok to start recording");
				targetLine.start();
				
				Thread audioRecorderThread=new Thread(){
					
					@Override public void run(){
						AudioInputStream recordingStream= new AudioInputStream(targetLine);
						File outputFile=new File("record.wav");
						try{
							AudioSystem.write(recordingStream, AudioFileFormat.Type.WAVE, outputFile);		
						}catch(IOException ex){
							System.out.println(ex);
						}
						System.out.println("Stopeed recording ");
					}
				};
				audioRecorderThread.start();
				// JOptionPane.showMessageDialog(null,"hit ok to stop recording ");
				// targetLine.stop();
				// targetLine.close();
			}catch(Exception e){System.out.println(e);}
		}
	}
	
	public class Play implements Runnable {
		Thread thread;
		
		public void start() {
		  thread = new Thread(this);
		  thread.setName("Play");
		  thread.start();
		}

		public void stop() {
		  thread = null;
		}

		public void run(){
			
			File clip1=new File("record.wav");
			try{
				
				Clip clip= AudioSystem.getClip();
				clip.open(AudioSystem.getAudioInputStream(clip1));
				clip.start();
				
				Thread.sleep(clip.getMicrosecondLength());
				
			}catch(Exception e){}	
		}
	}
	
	public static void main(String arg[])throws LineUnavailableException{
		
		RecordTest3 ob=new RecordTest3();		
	}
}	