import java.awt.*;
class TesGUI{
	public static void main(String arg[]){
		Frame w1=new Frame();
		Frame w2=new Frame();
		Frame w3=new Frame();
		
		w1.setSize(500,500);
		w2.setSize(400,400);
		w3.setSize(300,300);
		
		//setLocation(left,top);
		w1.setLocation(100,100);
		w2.setLocation(200,200);
		w3.setLocation(300,300);
		
		w1.show();
		w2.show();
		w3.show();
	}
}