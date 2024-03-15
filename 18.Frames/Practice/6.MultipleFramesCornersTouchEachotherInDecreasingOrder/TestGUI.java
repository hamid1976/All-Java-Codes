import java.awt.*;
class TestGUI{
	public static void main(String arg[]){
		Frame w1=new Frame();
		Frame w2=new Frame();
		Frame w3=new Frame();
		Frame w4=new Frame();
		Frame w5=new Frame();
		Frame w6=new Frame();
		
		
	    w1.setTitle("Red");
		w2.setTitle("Green");
		w3.setTitle("Yelow");
		w4.setTitle("Orange");
		w5.setTitle("Pink");
		w6.setTitle("Black");
		
		
		w1.setSize(240,129);
		w2.setSize(240,129);
		w3.setSize(240,129);
		w4.setSize(240,129);
		w5.setSize(240,129);
		w6.setSize(240,129);
		
		
		w1.setLocation(0,0);
		w2.setLocation(225,120);
		w3.setLocation(450,240);
		w4.setLocation(676,360);
		w5.setLocation(902,480);
		w6.setLocation(1128,600);
		
		
		w1.setBackground(Color.red);
		w2.setBackground(Color.green);
		w3.setBackground(Color.yellow);
		w4.setBackground(Color.orange);
		w5.setBackground(Color.pink);
		w6.setBackground(Color.black);
		
		
		w1.show();
		w2.show();
		w3.show();
		w4.show();
		w5.show();
		w6.show();
		
		
	}
}