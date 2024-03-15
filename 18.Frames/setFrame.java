import java.awt.*;
class setFrame{
	
	public static void main(String arg[]){
		Frame w1=new Frame();
		Frame w2=new Frame();
		Frame w3=new Frame();
		Frame w4=new Frame();
		Frame w5=new Frame();
		Frame w6=new Frame();
		Frame w7=new Frame();
		
		w1.setSize(800,600);
		w2.setSize(700,500);
		w3.setSize(600,400);
		w4.setSize(500,300);
		w5.setSize(400,200);
		w6.setSize(300,100);
		w7.setSize(200,70);
		
		w1.setLocation(100,100);
		w2.setLocation(150,150);
		w3.setLocation(200,200);
		w4.setLocation(250,250);
		w5.setLocation(300,300);
		w6.setLocation(350,350);
		w7.setLocation(390,360);
		
		w1.show();
		w2.show();
		w3.show();
		w4.show();
		w5.show();
		w6.show();
		w7.show();
	}
}