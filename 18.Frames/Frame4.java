import java.awt.*;
class Frame4{
	public static void main(String arg[]){
		Frame w1=new Frame();
		Frame w2=new Frame();
		Frame w3=new Frame();
		Frame w4=new Frame();
		Frame w5=new Frame();
		Frame w6=new Frame();
		Frame w7=new Frame();
		
		
		w1.setTitle("calculator");
		w2.setTitle("Trollyload");
		w3.setTitle("Employbasicpay");
		w4.setTitle("operator");
		w5.setTitle("unit converter");
		w6.setTitle("logical operator");
		w7.setTitle("Application");
		
		w1.setSize(200,115);
		w2.setSize(200,115);
		w3.setSize(200,115);
		w4.setSize(200,115);
		w5.setSize(200,115);
		w6.setSize(200,115);
		w7.setSize(200,115);
		
		
		w1.setLocation(-10,0);//left Top
		w2.setLocation(175,105);//left Top
		w3.setLocation(360,210);//left Top
		w4.setLocation(545,315);
		w5.setLocation(730,420);//left Top
		w6.setLocation(915,525);//left Top
		w7.setLocation(1100,630);
		
		w1.setBackground(Color.red);
		w2.setBackground(Color.green);
		w3.setBackground(Color.blue);
		w4.setBackground(Color.pink);
		w5.setBackground(Color.yellow);
		w6.setBackground(Color.gray);
		w7.setBackground(Color.black);
		
		
		// w1.setVisible(true);
		// w2.setVisible(true);
		// w3.setVisible(true);
		// w4.setVisible(true);
		// w5.setVisible(true);
		// w6.setVisible(true);
		// w7.setVisible(true
		w1.show();
	    w2.show();
		w3.show();
		w4.show();
		w5.show();
		w6.show();
		w7.show();
	}
}