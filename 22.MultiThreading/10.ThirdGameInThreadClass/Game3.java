import java.awt.*;
import java.awt.event.*;
public class Game3 implements ActionListener{
	Frame win=new Frame();
	Button open=new Button("Open");
	Button start=new Button("Start");
	Button stop=new Button("Stop");
	Button suspend=new Button("Suspend");
	Button resume=new Button("Resume");
	Button exit=new Button("Exit");
	Button demo =new Button("DemoThread");
	
	Game3(){
		win.setBounds(0,0,500,600);
		win.setLayout(null);
		win.show();
		win.setBackground(Color.pink);
		
		
		start.setBounds(100,100,120,40);
		stop.setBounds(100,160,120,40);
		suspend.setBounds(100,220,120,40);
		resume.setBounds(100,280,120,40);
		open.setBounds(100,340,120,40);
		exit.setBounds(100,400,120,40);
		demo.setBounds(200,500,150,40);
		
		
		start.setBackground(Color.green);
		stop.setBackground(Color.red);
		suspend.setBackground(Color.blue);
		resume.setBackground(Color.yellow);
		open.setBackground(Color.white);
		exit.setBackground(Color.gray);
		demo.setBackground(Color.orange);
		

		win.add(start);
		win.add(stop);
		win.add(suspend);
		win.add(resume);
		win.add(open);
		win.add(exit);
		win.add(demo);
		
		
		start.addActionListener(this);
		stop.addActionListener(this);
		suspend.addActionListener(this);
		resume.addActionListener(this);
		open.addActionListener(this);
		exit.addActionListener(this);
		demo.addActionListener(this);
		
	}//end Game3 Constructor
	public class Demo extends Thread{
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
	Demo t=new Demo();
	public void actionPerformed(ActionEvent e){
		
		if(start==e.getSource()){
			t.start();
		}
		if(stop==e.getSource()){
			t.stop();
		}
		if(suspend==e.getSource()){
			t.suspend();
		}
		if(resume==e.getSource()){
			t.resume();
		}
		if(open==e.getSource()){
			win.dispose(); // Close the current window
            Game1 g=new Game1(); // Open Game1 window
		}
		if(exit==e.getSource()){
			System.exit(0);
		}
	}
	public static void main(String arg[]){
		Game3 g1=new Game3();
	}
}