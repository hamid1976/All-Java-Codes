import java.awt.*;

class Trolyload2{
	
	Label l1=new Label("Troly load");
	Label l2=new Label("Enter Troly load");
	Label l3=new Label("Total Income");
	Label l4=new Label("Drive%");
	Label l5=new Label("Tax 10%");
	Label l6=new Label("Disel");
	Label l7=new Label("profit");
	
	TextField t1=new TextField();
	TextField t2=new TextField();
	TextField t3=new TextField();
	TextField t4=new TextField();
	TextField t5=new TextField();
	TextField t6=new TextField();
	
	Button b1=new Button("Calculate");
	Button b2=new Button("Clear");
	Button b3=new Button("Exit");
	Button b4=new Button("About");
	
	Font f=new Font("arial",Font.PLAIN,18);
	Font f2=new Font("arial",Font.PLAIN,15);
	
	Frame frame=new Frame();
	
	Trolyload2(){
		
		frame.setLayout(null);
		frame.setBounds(300,50,400,550);
		
		l1.setBounds(160,20,110,50);
		l2.setBounds(20,70,110,50);
		l3.setBounds(20,140,110,50);
		l4.setBounds(20,210,110,50);
		l5.setBounds(20,280,110,50);
		l6.setBounds(20,350,110,50);
		l7.setBounds(20,420,110,50);
		
		
		t1.setBounds(150,80,120,30);
		t2.setBounds(150,150,120,30);
		t3.setBounds(150,220,120,30);
		t4.setBounds(150,290,120,30);
		t5.setBounds(150,360,120,30);
		t6.setBounds(150,430,120,30);
		
		b1.setBounds(300,80,80,30);
		b2.setBounds(20,480,80,30);
		b3.setBounds(110,480,80,30);
		b4.setBounds(200,480,80,30);
		
		l1.setFont(f);
		l2.setFont(f2);
		l3.setFont(f2);
		l4.setFont(f2);
		l5.setFont(f2);
		l6.setFont(f2);
		l7.setFont(f2);
		
		
		
		
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		frame.add(l6);
		frame.add(l7);
		
		
		frame.add(t1);
		frame.add(t2);
		frame.add(t3);
		frame.add(t4);
		frame.add(t5);
		frame.add(t6);
		
		
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		
		
		frame.show();
	}
	
	public static void main(String arg[]){
		
		Trolyload2 as=new Trolyload2();
		
	}
}