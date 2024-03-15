import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Hero implements KeyListener{
	JFrame win=new JFrame();
	ImageIcon icon=new ImageIcon("E:\\hero4.jpg");
	JLabel heroLabel=new JLabel(icon);
	
	Label l1 =new Label();
	Label l2 =new Label();
	Label l3 =new Label();
	Label l4 =new Label();
	Label l5 =new Label();
	Label l6 =new Label();
	Label l7 =new Label();
	Label l8 =new Label();
	Label l9 =new Label();
	Label l10=new Label();

	Label b1=new Label();//label For Thread 1
	Label b2=new Label();//label For Thread 2
	Label b3=new Label();//label For Thread 3

	int left=30;
	int top=30;
	Hero(){
		heroLabel.setBounds(left,top,70,70);
		Container con=win.getContentPane();
		con.setLayout(null);
		con.add(heroLabel);
		
		win.setBounds(0,0,1400,1000);
		win.setBackground(Color.green);
		
						   //1350
		l1.setBounds(0,100,1000,70);
	    l2.setBounds(1100,100,400,70);
		l3.setBounds(100,250,700,70);
	    l4.setBounds(900,250,550,70);
		l5.setBounds(0,400,700,70);
		l6.setBounds(800,400,450,70);
	    l7.setBounds(0,550,300,70);
	    l8.setBounds(400,550,1000,70);
		b1.setBounds(500,185,120,50);
		b2.setBounds(400,335,120,50);
		b3.setBounds(300,485,120,50);
		
		l1.setBackground(new Color(48, 58, 71));        // Dark blue-gray
		l2.setBackground(new Color(34, 139, 34));       // Dark green
		l3.setBackground(new Color(65, 105, 225));      // Royal blue
		l4.setBackground(new Color(128, 0, 128));       // Dark magenta
		l5.setBackground(new Color(0, 139, 139));       // Dark cyan
		l6.setBackground(new Color(51, 51, 51));        // Charcoal
		l7.setBackground(new Color(255, 140, 0));       // Dark orange
		l8.setBackground(new Color(102, 51, 153));      // Dark purple
		
		b1.setBackground(Color.yellow);    
		b2.setBackground(new Color(25, 25, 112));   // Midnight blue
		b3.setBackground(new Color(139, 0, 0));     // Dark red


		win.add(l1);
		win.add(l2);
		win.add(l3);
		win.add(l4);
		win.add(l5);
		win.add(l6);
		win.add(l7);
		win.add(l8);
	    win.add(b1);
		win.add(b2);
		win.add(b3);
			
		try{
			t1.start();
			Thread.sleep(600);
			t2.start();
			Thread.sleep(400);
			t3.start();
			Thread.sleep(200);
		}catch(Exception e){}
	
		win.addKeyListener(this);
		win.setVisible(true);
		
	}//end Hero constructor
	
		Butt1 t1=new Butt1();
		Butt2 t2=new Butt2();
		Butt3 t3=new Butt3();
    public class Butt1 extends Thread{
		public void run(){
			try{
				do{
					for(int i=1;i<=1240; i++){
						b1.setLocation(i,185);
						Thread.sleep(2);
					}
					for(int i=1240;i>=1;i--){
						b1.setLocation(i,185);
						Thread.sleep(2);
					}
				}while(true);
			}catch(Exception e){}
		}
	}//end class Butt1
	
	public class Butt2 extends Thread{
		public void run(){
			try{
				do{
					for(int i=1;i<=1240; i++){
						b2.setLocation(i,335);
						Thread.sleep(2);
					}
					for(int i=1240;i>=1;i--){
						b2.setLocation(i,335);
						Thread.sleep(2);
					}
				}while(true);
			}catch(Exception e){}
		}
	}//end class Butt2
	
	public class Butt3 extends Thread{
		public void run(){
			try{
				do{
					for(int i=1;i<=1240; i++){
						b3.setLocation(i,485);
						Thread.sleep(2);
					}
					for(int i=1240;i>=1;i--){
						b3.setLocation(i,485);
						Thread.sleep(2);
					}
				}while(true);
			}catch(Exception e){}
		}
	}//end class Butt3
	
	public void keyPressed(KeyEvent e){
		int code=e.getKeyCode();
		if(code==37){
			left-=10;
			if(top>=0  &&  top<=30 &&left<=0){
				left=0;
				heroLabel.setLocation(left,top);
			}
			if(top>30  &&  top<=160 &&left<1000){
				left=1000;
				heroLabel.setLocation(left,top);
			}
			if(top>=170  &&  top<=330 &&left<=0){
				left=0;
				heroLabel.setLocation(left,top);
			}
			if(top>180 && top<=310 &&  left<800  &&  left >780){
				 left=800;
					heroLabel.setLocation(left,top);
			}//ok
			if(top>=340 && top<=460 &&  left<1250 && left>1230){
				 left=1250;
					heroLabel.setLocation(left,top);
			}//ok
			if(top>=340 && top<=460 &&  left<700 && left>680){
				 left=700;
					heroLabel.setLocation(left,top);
			}//ok
			if(top>=470 && top<=480 &&  left<0){
				 left=0;
					heroLabel.setLocation(left,top);
			}//ok
			if(top>=490 && top<=610 &&  left<300){
				 left=300;
					heroLabel.setLocation(left,top);
			}//ok
			if(top>=620 && top<=630 &&  left<0){
				 left=0;
					heroLabel.setLocation(left,top);
			}//ok
			// if(top>=170  &&  top<=180   && heroLabel==b1){
				// JOptionPane.showMessageDialog(null,"You Lose The Game");
			// }
		}//left side moving
		
		if(code==39){
			left+=10;
			if(top>=0  &&  top<=30 && left>=1290){
				left=1290;
				heroLabel.setLocation(left,top);
			}
			if(top>30  &&  top<=160 &&left>1030){
				left=1030;
				heroLabel.setLocation(left,top);
			}
			if(top>=170  &&  top<=180 &&left>1290){
				left=1290;
				heroLabel.setLocation(left,top);
			}
			if(top>180 && top<=310 &&  left>830){
				 left=830;
					heroLabel.setLocation(left,top);
			}//ok
			if(top>180 && top<=310 &&  left>30  && left<=40){
				 left=30;
					heroLabel.setLocation(left,top);
			}//ok
			if(top>=320 && top<=480 &&  left>1290){
				 left=1290;
					heroLabel.setLocation(left,top);
			}//ok
			if(top>=340 && top<=460 &&  left>730 && left<750){
				 left=730;
					heroLabel.setLocation(left,top);
			}//ok
			if(top>=490 && top<=610 &&  left>330){
				 left=330;
					heroLabel.setLocation(left,top);
			}//ok
			if(top>=620 && top<=630 &&  left>1290){
				 left=1290;
					heroLabel.setLocation(left,top);
			}//ok
		}//right side moving
		
		if(code==40){
			top+=10;
			if(top>=30 && top<=100 && left>=0 &&  left <1000){
				top=30;
					heroLabel.setLocation(left,top);
			}//ok
			if(top>=30 && top<=100 &&  left>=1040  &&  left <=1290){
				 top=30;
					heroLabel.setLocation(left,top);
			}//ok
			if(top>=180 && top<=250 && left>=40 &&  left <=790){
				top=180;
					heroLabel.setLocation(left,top);
			}//ok
			if(top>=180 && top<=250 &&  left>=840  &&  left <=1290){
				 top=180;
					heroLabel.setLocation(left,top);
			}//ok
			if(top>=330 && top<400 &&  left>=740  &&  left <=1240){
				 top=330;
					heroLabel.setLocation(left,top);
			}//ok
			if(top>=330 && top<400 &&  left>=0  &&  left <=690){
				 top=330;
					heroLabel.setLocation(left,top);
			}//ok
			if(top>=480 && top<550 &&  left>=0  &&  left <=290){
				 top=480;
					heroLabel.setLocation(left,top);
			}//ok
			if(top>=480 && top<550 &&  left>=340  &&  left <=1290){
				 top=480;
					heroLabel.setLocation(left,top);
			}//ok
			if(top>630 &&  left>=0  &&  left <=1290){
				 top=630;
					heroLabel.setLocation(left,top);
			}//ok
			if(top>=620 ){
				JOptionPane.showMessageDialog(null,"You Win The Game");
				 //top=630;
					//heroLabel.setLocation(left,top);
			}//ok
		}
			
		//down side moving
		if(code==38){
			top-=10;
			if(top>=100 && top<170&&  left>=0  &&  left <1000){
				 top=170;
					heroLabel.setLocation(left,top);
			}
			if(top>=100 && top<170 &&  left>=1040  &&  left <=1290){
				 top=170;
					heroLabel.setLocation(left,top);
			}//ok
			if(top>=250 && top<320 &&  left>=840  &&  left <=1290){
				 top=320;
					heroLabel.setLocation(left,top);
			}//ok
			if(top>=250 && top<=320 && left>=40 &&  left <=790){
				top=320;
					heroLabel.setLocation(left,top);
			}//ok
			if(top>=400 && top<470 && left>=740 &&  left <=1240){
				top=470;
					heroLabel.setLocation(left,top);
			}//ok
			if(top>=400 && top<470 && left>=0 &&  left <=690){
				top=470;
					heroLabel.setLocation(left,top);
			}//ok
			if(top>=550 && top<620 && left>=0 &&  left <=290){
				top=620;
					heroLabel.setLocation(left,top);
			}//ok
			if(top>=550 && top<620 && left>=340 &&  left <=1290){
				top=620;
					heroLabel.setLocation(left,top);
			}//ok
			if(left>=0 &&  left <=1290  &&  top<=0){
				top=0;
					heroLabel.setLocation(left,top);
			}//ok
		}//up side moving
		
		heroLabel.setLocation(left,top);
		win.setTitle("Left: "+left+" Top: "+top);
	}
	public void keyReleased(KeyEvent e){}
	
	public void keyTyped(KeyEvent e){}
	
	public static  void main(String arg[]){
		new Hero();
	}
}

