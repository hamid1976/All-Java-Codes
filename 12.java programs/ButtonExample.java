import java.awt.*;
class ButtonExample {
	
	public static void main(String arg[]){
		
		Frame f=new Frame("Button");
		f.setLayout(null);
		f.setBounds(300,200,400,400);
		
		Button b1=new Button("red");
		b1.setBounds(100,50,200,50);
		b1.setBackground(Color.red);
		
		Button b2=new Button("green");
		b2.setBounds(100,120,200,50);
		b2.setBackground(Color.green);
		
	
		Button b3=new Button("yellow");
		b3.setBounds(100,190,200,50);
		b3.setBackground(Color.yellow);
		
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		f.show();
		
	}
}