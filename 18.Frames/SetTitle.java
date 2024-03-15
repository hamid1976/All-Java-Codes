import java.awt.*;
class SetTitle{
	public static void main(String arg[]){
		
		Frame w1=new Frame();
		Frame w2=new Frame();
		Frame w3=new Frame();
		
		w1.setTitle("Calculator");
		w2.setTitle("Trollyload");
		w3.setTitle("basic pay");
		
		w1.setSize(500,400);
		w2.setSize(400,300);
		w3.setSize(300,200);

        w1.setBackground(Color.red);
        w2.setBackground(Color.blue);
		w3.setBackground(Color.green);
		
		w1.show();
		w2.show();
		w3.show();
	}
}
		
		
		