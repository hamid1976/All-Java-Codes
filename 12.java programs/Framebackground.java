import java.awt.*;

class Framebackground{
	
	public static void main(String arg[]){
		
		Frame f= new Frame("Background Example");
		f.setLocation(600,300);
		f.setSize(350,200);
		
		f.setBackground(Color.red);
		
		f.show();
	}
}