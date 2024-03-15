import java.awt.*;
class TestGUI{
	public static void main(String arg[]){
		Frame win1=new Frame();
		Frame win2=new Frame();
		Frame win3=new Frame();
		
		
		win1.setTitle("Calculator");
		win2.setTitle("TrolyLoad");
		win3.setTitle("Employee Basic Pay");
		
		//w1.setSize(width,height)
		win1.setSize(500,400);
		win2.setSize(400,300);
		win3.setSize(300,200);
		
		//set Background color
		win1.setBackground(Color.red);
		win2.setBackground(Color.green);
		win3.setBackground(Color.blue);
		
		//Show Frames
		win1.show();
		win2.show();
		win3.show();
	}
}