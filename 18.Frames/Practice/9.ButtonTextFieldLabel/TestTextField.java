import java.awt.*;
class TestTextField{
	public static void main(String arg[]){
		Frame win=new Frame();
		
		Button b1=new Button("Button");
		TextField t1=new TextField();
		Label l1=new Label("Hello");
		
		b1.setSize(100,30);
		b1.setLocation(100,100);
		
		t1.setSize(100,30);
		t1.setLocation(100,140);
		
		l1.setSize(100,30);
		l1.setLocation(100,180);
		
		win.add(b1);
		win.add(t1);
		win.add(l1);
		
		win.setSize(500,500);
		win.setLayout(null);
		win.show();
	}
}