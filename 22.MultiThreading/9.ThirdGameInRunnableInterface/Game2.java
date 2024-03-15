import java.awt.*;
import java.awt.event.*;
public class Game2 implements ActionListener{
	Frame win=new Frame();
	Button openButton=new Button("Open");
	Button startButton=new Button("Start");
	Button stopButton=new Button("Stop");
	Button suspendButton=new Button("Suspend");
	Button resumeButton=new Button("Resume");
	Button exitButton=new Button("Exit");
	
	Button demo =new Button("DemoThread");
	
	Game2(){
		win.setBackground(Color.pink);
		
		startButton.setSize(120,40);
		startButton.setLocation(100,100);
		startButton.setBackground(Color.green);
		
		stopButton.setSize(120,40);
		stopButton.setLocation(100,160);
		stopButton.setBackground(Color.red);
		
		suspendButton.setSize(120,40);
		suspendButton.setLocation(100,220);
		suspendButton.setBackground(Color.blue);
		
		resumeButton.setSize(120,40);
		resumeButton.setLocation(100,280);
		resumeButton.setBackground(Color.yellow);
		
		openButton.setSize(120,40);
		openButton.setLocation(100,340);
		openButton.setBackground(Color.white);
		
		exitButton.setSize(120,40);
		exitButton.setLocation(100,400);
		exitButton.setBackground(Color.gray);
		
		demo.setSize(150,40);
		demo.setLocation(200,500);
		demo.setBackground(Color.orange);
		
		
		win.add(startButton);
		win.add(stopButton);
		win.add(suspendButton);
		win.add(resumeButton);
		win.add(openButton);
		win.add(exitButton);
		win.add(demo);
		
		win.setBounds(0,0,500,600);
		win.setLayout(null);
		win.show();
		
		startButton.addActionListener(this);
		stopButton.addActionListener(this);
		suspendButton.addActionListener(this);
		resumeButton.addActionListener(this);
		openButton.addActionListener(this);
		demo.addActionListener(this);
		exitButton.addActionListener(this);
		
	}//end Game2 Constructor
	public class Demo implements Runnable{
		public void run(){
			do{
				for(int i=1; i<=350; i++){
					demo.setLocation(i,500);
					try{
						Thread.sleep(5);
					}catch(Exception e){}
				}
				for(int i=350; i>=1; i--){
					demo.setLocation(i,500);
					try{
						Thread.sleep(5);
					}catch(Exception e){}
				}
			}while(true);
		}
	}//end class demoThread button
	Demo a=new Demo();
	Thread t=new Thread(a);
	
	public void actionPerformed(ActionEvent e){
		
		if(startButton==e.getSource()){
			t.start();
		}
		if(stopButton==e.getSource()){
			t.stop();
		}
		if(suspendButton==e.getSource()){
			t.suspend();
		}
		if(resumeButton==e.getSource()){
			t.resume();
		}
		if(openButton==e.getSource()){
			win.dispose(); // Close the current window
            Game g2 = new Game(); // Open Game2 window
		}
		if(exitButton==e.getSource()){
			System.exit(0);
		}
	}
	public static void main(String arg[]){
		Game2 g1=new Game2();
	}
}