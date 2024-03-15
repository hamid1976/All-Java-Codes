import java.awt.*;

class Tests{
	
	public static void main(String arg[]){
		Frame f= new Frame();
		
		f.setTitle("Button Example");
		f.setLayout(null);
		f.setLocation(300,200);
		f.setSize(400,400);
		
		Button button= new Button("Button");		
		button.setLocation(100,50);
		button.setSize(200,50);
		
		f.add(button);
		
		f.show();
		
	}
}
		
		