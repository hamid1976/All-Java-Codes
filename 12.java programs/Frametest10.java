import java.awt.*;

class Frametest10{
	
	Label l1=new Label("Enter Days");
	Label l2=new Label("Years");
	Label l3=new Label("Weeks");
	Label l4=new Label("Days");
	
	TextField t1=new TextField();
	TextField t2=new TextField();
	TextField t3=new TextField();
	TextField t4=new TextField();
	
	Button b1=new Button("Convert");
	Button b2=new Button("About");
	Button b3=new Button("Clear");
	Button b4=new Button("Exit");
	
	Frame frame=new Frame();
	
	Font f=new Font("arial",Font.PLAIN,15);
	
	Frametest10(){
		
		frame.setLayout(null);
		frame.setBounds(300,200,360,250);
		
		l1.setBounds(20,40,80,30);
		l2.setBounds(20,80,50,30);
		l3.setBounds(20,120,50,30);
		l4.setBounds(20,160,50,30);
		
		t1.setBounds(130,40,100,30);
		t2.setBounds(130,80,100,30);
		t3.setBounds(130,120,100,30);
		t4.setBounds(130,160,100,30);
		
		b1.setBounds(240,40,100,30);
		b2.setBounds(20,200,100,30);
		b3.setBounds(130,200,100,30);
		b4.setBounds(240,200,100,30);
		
		l1.setFont(f);
		l2.setFont(f);
		l3.setFont(f);
		l4.setFont(f);
		
		
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		
		frame.add(t1);
		frame.add(t2);
		frame.add(t3);
		frame.add(t4);
		
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		
		
		frame.show();
		
	}
	
	public static void main(String arg[]){
		
		Frametest10 as=new Frametest10();
		
	}
}
		
