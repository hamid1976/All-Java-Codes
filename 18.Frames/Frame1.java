import java.awt.*;
class Frame1{
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
		
		
		w1.setSize(800,700);
		w2.setSize(700,600);
		w3.setSize(600,500);
		w4.setSize(500,400);
		w5.setSize(400,300);
		w6.setSize(300,200);
		w7.setSize(200,100);
		
		
		w1.setLocation(50,30);//left Top
		w2.setLocation(100,70);//left Top
		w3.setLocation(150,120);//left Top
		w4.setLocation(200,180);
		w5.setLocation(250,230);//left Top
		w6.setLocation(300,280);//left Top
		w7.setLocation(350,330);
		
		w1.setBackground(Color.red);
		w2.setBackground(Color.green);
		w3.setBackground(Color.blue);
		w4.setBackground(Color.pink);
		w5.setBackground(Color.yellow);
		w6.setBackground(Color.gray);
		w7.setBackground(Color.black);
		
		
		w1.show();
		w2.show();
		w3.show();
		w4.show();
		w5.show();
		w6.show();
		w7.show();
	
	}
}