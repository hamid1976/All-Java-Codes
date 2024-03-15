import java.awt.*;
class Frame5{
	public static void main(String arg[]){
		
		Frame win=new Frame("Button");
		
		Button b1=new Button("Addition");
		Button b2=new Button("Subtraction");
		Button b3=new Button("Multiplication");
		
		b1.setLocation(100,100);
		b1.setSize(100,30);
		
		b2.setLocation(100,140);
		b2.setSize(100,30);
		
		b3.setLocation(100,190);
		b3.setSize(100,30);
		
		win.add(b1);
		win.add(b2);
		win.add(b3);
		
		win.setSize(500,500);
		win.setLayout(null);
		
		win.show();
		
	}
}