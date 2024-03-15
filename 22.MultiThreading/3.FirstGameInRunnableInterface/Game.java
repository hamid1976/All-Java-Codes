import java.awt.*;
import java.awt.event.*;

class Game implements ActionListener{
	Frame win=new Frame();
	Button b1=new Button("Thread 1");
	Button b2=new Button("Thread 2");
	
	
	Game(){
		win.setLayout(null);
		win.setBackground(Color.red);
		
		b1.setBounds(350,100,100,30);
		b2.setBounds(200,350,100,30);
		b1.setBackground(Color.green);
		b2.setBackground(Color.green);
		
		
		win.add(b1);
		win.add(b2);
		
		win.setBounds(0,0,500,500);
		win.show();
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	class Butt implements Runnable{
			public void run(){
				for(int i=20; i<=465; i++){
					b1.setBounds(350,i,100,30);
					try{
						Thread.sleep(5);
						if(i==465){
							for(int j=465; j>=30; j--){
								b1.setBounds(350,j,100,30);
								Thread.sleep(5);
								if(j==30){
									i=20;
									break;
								}
						   }
						}
					}catch(Exception e){}
				}
			}
	}
	class Butt2 implements Runnable{
		public void run(){
			for(int i=10; i<=400; i++){
					b2.setBounds(i,350,100,30);
					try{
						Thread.sleep(5);
						if(i==400){
							for(int j=400; j>=10; j--){
								b2.setBounds(j,350,100,30);
								Thread.sleep(5);
								if(j==10){
									i=10;
									break;
								}
							}
						}
					}catch(Exception e){}
			}
		}
	}
	public void actionPerformed(ActionEvent e){
		if(b1==e.getSource()){
			Butt but1=new Butt();
			Thread t=new Thread(but1);
			t.start();
		}
		if(b2==e.getSource()){
				Butt2 but2=new Butt2();
				Thread t1=new Thread(but2);
				t1.start();
			
		}
	}
	public static void main(String arg[]){
	Game g=new Game();	
	}
}




