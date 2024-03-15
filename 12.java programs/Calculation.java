import java.awt.*;

class Calculation{
	
	public static void main(String arg[]){
		
		Frame frame=new Frame("Calculation");
		
		frame.setLayout(null);
		frame.setBounds(300,200,340,300);
		
		
		Label l1=new Label("Enter 1st Value");
		l1.setBounds(20,50,170,30);
		
		Label l2=new Label("Enter 2nd Value");
		l2.setBounds(20,100,170,30);
		
		Label l3=new Label("Result");
		l3.setBounds(20,200,100,30);
		
		
		TextField  t1=new TextField();
		t1.setBounds(210,50,100,30);
		
		TextField  t2=new TextField();
		t2.setBounds(210,100,100,30);
		
		TextField  t3=new TextField();
		t3.setBounds(140,200,170,30);
		
		
		Button b1=new Button("+");
		b1.setBounds(20,150,50,30);
		
		Button b2=new Button("-");
		b2.setBounds(80,150,50,30);
		
		Button b3=new Button("%");
		b3.setBounds(140,150,50,30);
		
		Button b4=new Button("*");
		b4.setBounds(200,150,50,30);
		
		Button b5=new Button("/");
		b5.setBounds(260,150,50,30);
		
		Button b6=new Button("About");
		b6.setBounds(20,240,80,30);
		
		Button b7=new Button("Clear");
		b7.setBounds(120,240,80,30);
		
		Button b8=new Button("Exit");
		b8.setBounds(230,240,80,30);
		
		
		Font f=new Font("arial",Font.PLAIN,20);
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
}