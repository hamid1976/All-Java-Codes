import java.awt.*;
class TestGUI{
	public static void main(String arg[]){
		Frame w1=new Frame();
		Frame w2=new Frame();
		Frame w3=new Frame();
		Frame w4=new Frame();
		Frame w5=new Frame();
		Frame w6=new Frame();
		Frame w7=new Frame();
		Frame w8=new Frame();
		Frame w9=new Frame();
		
		w1.setTitle("Red");
		w2.setTitle("Green");
		w3.setTitle("Yelow");
		w4.setTitle("Orange");
		w5.setTitle("Pink");
		w6.setTitle("Black");
		w7.setTitle("White");
		w8.setTitle("Brown");
		w9.setTitle("Gray");
		
		//setSize(width,height);
		w1.setSize(1000,900);
		w2.setSize(900 ,800);
		w3.setSize(800 ,700);
		w4.setSize(700 ,600);
		w5.setSize(600 ,500);
		w6.setSize(500 ,400);
		w7.setSize(400 ,300);
		w8.setSize(300 ,200);
		w9.setSize(200 ,100);
		
		w1.setBackground(Color.red);
		w2.setBackground(Color.green);
		w3.setBackground(Color.yellow);
		w4.setBackground(Color.orange);
		w5.setBackground(Color.pink);
		w6.setBackground(Color.black);
		w7.setBackground(Color.white);
		w8.setBackground(Color.yellow);
		w9.setBackground(Color.gray);
		
		w1.show();
		w2.show();
		w3.show();
		w4.show();
		w5.show();
		w6.show();
		w7.show();
		w8.show();
		w9.show();
		
	}
}