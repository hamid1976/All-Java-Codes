import java.awt.*;

class Calculation1{
	
	Label l1=new Label("Enter 1st value");
	Label l2=new Label("Enter 2nd value");
	Label l3=new Label("Result");
	
	TextField t1=new TextField();
	TextField t2=new TextField();
	TextField t3=new TextField();
	
	Button b1=new Button("+");
	Button b2=new Button("-");
	Button b3=new Button("%");
	Button b4=new Button("*");
	Button b5=new Button("/");
	Button b6=new Button("About");
	Button b7=new Button("Clear");
	Button b8=new Button("Exit");
	
	Frame frame=new Frame();
	
	Font f=new Font("arial",Font.PLAIN,20);
	
	Calculation1(){
		
		frame.setLayout(null);
		frame.setBounds(300,200,340,300);
		
		l1.setBounds(20,50,170,30);
		l2.setBounds(20,100,170,30);
		l3.setBounds(20,200,100,30);
		
		t1.setBounds(210,50,100,30);
		t2.setBounds(210,100,100,30);
		t3.setBounds(140,200,170,30);
		
		b1.setBounds(20,150,50,30);
		b2.setBounds(80,150,50,30);
		b3.setBounds(140,150,50,30);
		b4.setBounds(200,150,50,30);
		b5.setBounds(260,150,50,30);
		b6.setBounds(20,240,80,30);
		b7.setBounds(120,240,80,30);
		b8.setBounds(230,240,80,30);
		
		l1.setFont(f);
		l2.setFont(f);
		l3.setFont(f);
		
		
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		
		frame.add(t1);
		frame.add(t2);
		frame.add(t3);
		
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		frame.add(b6);
		frame.add(b7);
		frame.add(b8);
		
		
		frame.show();
		
	}
	
	public static void main(String arg[]){
		
		Calculation1 as=new Calculation1();
		
	}
}