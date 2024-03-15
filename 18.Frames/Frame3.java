import java.awt.*;
class Frame3{
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
		
		w1.setSize(250,150);
		w2.setSize(250,150);
		w3.setSize(250,150);
		w4.setSize(250,150);
		w5.setSize(250,150);
		w6.setSize(250,150);
		w7.setSize(250,150);
		
		
		w1.setLocation(-10,0);//left Top
		w2.setLocation(225,140);//left Top
		w3.setLocation(460,280);//left Top
		w4.setLocation(695,420);
		w5.setLocation(930,560);//left Top
		w6.setLocation(1165,700);//left Top
		w7.setLocation(350,840);
		
		w1.setBackground(Color.red);
		w2.setBackground(Color.green);
		w3.setBackground(Color.blue);
		w4.setBackground(Color.pink);
		w5.setBackground(Color.yellow);
		w6.setBackground(Color.gray);
		w7.setBackground(Color.black);
		
		
		w1.setVisible(true);
		w2.setVisible(true);
		w3.setVisible(true);
		w4.setVisible(true);
		w5.setVisible(true);
		w6.setVisible(true);
		w7.setVisible(true);
	
	}
}