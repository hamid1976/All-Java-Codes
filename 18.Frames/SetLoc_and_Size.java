import java.awt.*;
class SetLoc_and_Size{
	public static void main(String arg[]){
	Frame w1=new Frame();
	Frame w2=new Frame();
	Frame w3=new Frame();
	
	w1.setTitle("Calculator");
	w2.setTitle("Trollyload");
	w3.setTitle("Basicpay");
	
	w1.setSize(500,500);
	w2.setSize(400,400);
	w3.setSize(300,300);
	
	w1.setLocation(100,100);
	w2.setLocation(200,200);
	w3.setLocation(300,300);
	
	w1.setBackground(Color.red);
	w2.setBackground(Color.yellow);
	w3.setBackground(Color.green);
	
	w1.show();
	w2.show();
	w3.show();
}
}