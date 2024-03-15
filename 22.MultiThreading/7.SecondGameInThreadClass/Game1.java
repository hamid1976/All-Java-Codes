import java.awt.*;
import java.awt.event.*;
class Game1 implements ActionListener{
	Frame win=new Frame();
	
	Button startButton=new Button("Start");
	Button stopButton=new Button("Stop");
	Button suspendButton=new Button("Suspend");
	Button resumeButton=new Button("Resume");
	Button demo =new Button("DemoThread");
	
	Game1(){
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
		
		demo.setSize(150,40);
		demo.setLocation(200,400);
		demo.setBackground(Color.orange);
		
		win.add(startButton);
		win.add(stopButton);
		win.add(suspendButton);
		win.add(resumeButton);
		win.add(demo);
		
		win.setBounds(0,0,500,500);
		win.setLayout(null);
		//win.show();
		win.setVisible(true);
		
		startButton.addActionListener(this);
		stopButton.addActionListener(this);
		suspendButton.addActionListener(this);
		resumeButton.addActionListener(this);
		demo.addActionListener(this);
		
	}//end Game1 Constructor
	class Demo extends Thread{
		public void run(){
			do{
				for(int i=1; i<=350; i++){
					demo.setLocation(i,400);
					try{
						sleep(5);
					}catch(Exception e){}
				}
				for(int i=350; i>=1; i--){
					demo.setLocation(i,400);
					try{
						sleep(5);
					}catch(Exception e){}
				}
			}while(true);
		}
	}//end class demoThread button
	
	Demo t=new Demo();
	public void actionPerformed(ActionEvent e){
		
		if(stopButton==e.getSource()){
			t.stop();
		}
		if(startButton==e.getSource()){
			t.start();
		}
		if(suspendButton==e.getSource()){
			t.suspend();
		}
		if(resumeButton==e.getSource()){
			t.resume();
		}
	}
	public static void main(String arg[]){
		Game1 g=new Game1();
	}
}