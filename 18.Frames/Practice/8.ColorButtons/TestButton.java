import java.awt.*;
class TestButton{
	public static void main(String arg[]){
		Frame win=new Frame();
		
		Button b1=new Button("Red");
		Button b2=new Button("Green");
		Button b3=new Button("Yellow");
		Button b4=new Button("Blue");
		Button b5=new Button("Orange");
		Button b6=new Button("Pink");
		Button b7=new Button("Gray");
		
		b1.setSize(100,30);
		b1.setLocation(100,100);
		
		b2.setSize(100,30);
		b2.setLocation(100,140);
		
		b3.setSize(100,30);
		b3.setLocation(100,180);
		
		b4.setSize(100,30);
		b4.setLocation(100,220);
		
		b5.setSize(100,30);
		b5.setLocation(100,260);
		
		b6.setSize(100,30);
		b6.setLocation(100,300);
		
		b7.setSize(100,30);
		b7.setLocation(100,340);
		
		b1.setBackground(Color.red);
		b2.setBackground(Color.green);
		b3.setBackground(Color.yellow);
		b4.setBackground(Color.blue);
		b5.setBackground(Color.orange);
		b6.setBackground(Color.pink);
		b7.setBackground(Color.gray);
		win.add(b1);
		win.add(b2);
		win.add(b3);
		win.add(b4);
		win.add(b5);
		win.add(b6);
		win.add(b7);
		
		win.setSize(500,500);win.setLayout(null);
		win.show();

	}
}