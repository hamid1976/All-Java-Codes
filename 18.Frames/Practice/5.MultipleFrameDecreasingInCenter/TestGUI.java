import java.awt.*;
class TestGUI{
	public static void main(String arg[]){
		Frame w1=new Frame();
		Frame w2=new Frame();
		Frame w3=new Frame();
		Frame w4=new Frame();
		Frame w5=new Frame();
		Frame w6=new Frame();
		Frame w7=new Frame();
		Frame w8=new Frame();
		
	    w1.setTitle("Red");
		w2.setTitle("Green");
		w3.setTitle("Yelow");
		w4.setTitle("Orange");
		w5.setTitle("Pink");
		w6.setTitle("Black");
		w7.setTitle("White");
		w8.setTitle("Gray");
		
		w1.setSize(1400,750);
		w2.setSize(1200,650);
		w3.setSize(1000,550);
		w4.setSize(800 ,450);
		w5.setSize(600 ,350);
		w6.setSize(400 ,250);
		w7.setSize(200 ,150);
		w8.setSize(100 ,50);
		
		w1.setLocation(0,0);
		w2.setLocation(100,50);
		w3.setLocation(200,100);
		w4.setLocation(300,150);
		w5.setLocation(400,200);
		w6.setLocation(500,250);
		w7.setLocation(600,300);
		w8.setLocation(630,350);
		
		w1.setBackground(Color.red);
		w2.setBackground(Color.green);
		w3.setBackground(Color.yellow);
		w4.setBackground(Color.orange);
		w5.setBackground(Color.pink);
		w6.setBackground(Color.black);
		w7.setBackground(Color.white);
		w8.setBackground(Color.gray);
		
		w1.show();
		w2.show();
		w3.show();
		w4.show();
		w5.show();
		w6.show();
		w7.show();
		w8.show();
		
	}
}