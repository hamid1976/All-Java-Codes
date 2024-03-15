import java.awt.*;
import java.awt.event.*;

class Game1 implements ActionListener{
	Frame win=new Frame();
	Button back=new Button("Back");
	Button b1=new Button("Thread 1");
	Button b2=new Button("Thread 2");
	
	
	Game1(){
		win.setLayout(null);
		win.setBackground(Color.red);
		
		b1.setBounds(350,100,120,40);
		b2.setBounds(200,400,120,40);
		back.setBounds(50,50,120,40);
		back.setBackground(Color.yellow);
		b1.setBackground(Color.green);
		b2.setBackground(Color.green);
		
		
		win.add(b1);
		win.add(b2);
		win.add(back);
		
		win.setBounds(0,0,500,500);
		win.show();
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		back.addActionListener(this);
	}

	class Butt extends Thread{
			public void run(){
				do{
					for(int i=30; i<=465; i++){
						b1.setLocation(350,i);
						try{
							Thread.sleep(5);
							}catch(Exception e){}
							
					}
					for(int j=465; j>=30; j--){
						b1.setLocation(350,j);
						try{
							Thread.sleep(5);
						}catch(Exception e){}
					}
				
				}while(true);
			}
	}
	class Butt2 extends Thread{
		public void run(){
			do{
				for(int i=1; i<=380; i++){
					b2.setLocation(i,400);
						try{
							Thread.sleep(5);
						}catch(Exception e){}
				}
				for(int j=380; j>=1; j--){
					b2.setLocation(j,400);
						try{
							Thread.sleep(5);
						}catch(Exception e){}
				}		
			}while(true);
		}
	}
	public void actionPerformed(ActionEvent e){
		if(b1==e.getSource()){
			Butt t=new Butt();
			t.start();
		}
		if(b2==e.getSource()){
				Butt2 t1=new Butt2();
				t1.start();
			
		}
		if(back==e.getSource()){
		  win.dispose(); // Close the current window
		  Game3 g1=new Game3();
		}
	}
	public static void main(String arg[]){
	Game1 g=new Game1();	
	}
}




