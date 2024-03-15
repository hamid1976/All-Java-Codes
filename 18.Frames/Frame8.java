import java.awt.*;
class Frame8{
	public static void main(String arg[]){
		Frame win=new Frame();
		
		Button b1=new Button("Button");
		TextField t1=new TextField();
		Label l1=new Label("Hello");
		
		b1.setLocation(100,100);
		b1.setSize(100,30);
		
		t1.setLocation(100,140);
		t1.setSize(100,30);
		
		l1.setLocation(100,190);
		l1.setSize(100,30);
		
		win.add(b1);
		win.add(t1);
		win.add(l1);
		
		win.setSize(500,500);
		
		win.setLayout(null);
		win.show();
		
	}
}