import java.awt.*;

class Atm{
	
	Label l1=new Label("Enter Rupees");
	Label l2=new Label("5000");
	Label l3=new Label("1000");
	Label l4=new Label("500");
	Label l5=new Label("100");
	Label l6=new Label("50");
	Label l7=new Label("20");
	Label l8=new Label("10");
	Label l9=new Label("5");
	Label l10=new Label("2");
	Label l11=new Label("1");
	
	
	
	TextField t1=new TextField();
	TextField t2=new TextField();
	TextField t3=new TextField();
	TextField t4=new TextField();
	TextField t5=new TextField();
	TextField t6=new TextField();
	TextField t7=new TextField();
	TextField t8=new TextField();
	TextField t9=new TextField();
	TextField t10=new TextField();
	TextField t11=new TextField();
	
	
	Button b1=new Button("Convert");
	Button b2=new Button("About");
	Button b3=new Button("Clear");
	Button b4=new Button("Exit");
	
	Font f=new Font("arial",Font.PLAIN,20);
	
	
	Atmc(){
		
		frame.setLayout(null);
		frame.setBounds(300,200,360,580)
		
		
		l1.setBounds(20,50,200,30);
		l2.setBounds(20,120,50,30);
		l3.setBounds(20,160,50,30);
		l4.setBounds(20,200,50,30);
		l5.setBounds(20,240,50,30);
		l6.setBounds(20,280,50,30);
		l7.setBounds(20,320,50,30);
		l8.setBounds()20,360,50,30;
		l9.setBounds(20,400,50,30);
		l10.setBounds(20,440,50,30);
		l11.setBounds(20,480,50,30);
		
		
		t1.setBounds(20,80,200,30);
		t2.setBounds(100,120,120,30);
		t3.setBounds(100,160,120,30);
		t4.setBounds(100,200,120,30);
		t5.setBounds(100,240,120,30);
		t6.setBounds(100,280,120,30);
		t7.setBounds(100,320,120,30);
		t8.setBounds(100,360,120,30);
		t9.setBounds(100,400,120,30);
		t10.setBounds(100,440,120,30);
		t11.setBounds(100,480,120,30);
		
		
		b1.setBounds(240,100,100,30);
		b2.setBounds(20,530,100,30);
		b3.setBounds(130,530,100,30);
		b4.setBounds(240,530,100,30);
		
		
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		frame.add(l6);
		frame.add(l7);
		frame.add(l8);
		frame.add(l9);
		frame.add(l10);
		frame.add(l11);
		
		
		frame.add(t1);
		frame.add(t2);
		frame.add(t3);
		frame.add(t4);
		frame.add(t5);
		frame.add(t6);
		frame.add(t7);
		frame.add(t8);
		frame.add(t9);
		frame.add(t10);
		frame.add(t11);
		
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		
		
		frame.show();
		
	}
	
	
	public static void main(String arg[]){
		
		Atmc as=new Atmc();
		
		
	}
}
	
	
	