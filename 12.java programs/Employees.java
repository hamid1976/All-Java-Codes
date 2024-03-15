import java.awt.*;

class Employees{
	
	Label l1=new Label("Employees Salary Calculate");
	Label l2=new Label("Enter Employees basic Salary");
	Label l3=new Label("House Rent 45%");
	Label l4=new Label("Medical allowance 15%");
	Label l5=new Label("Bonns 5%");
	Label l6=new Label("Gross Pay");
	Label l7=new Label("Income Tax 3%");
	Label l8=new Label("Zukawat 2.5%");
	Label l9=new Label("Convace Akkaiwabce 8%");
	
	TextField t1=new TextField();
	TextField t2=new TextField();
	TextField t3=new TextField();
	TextField t4=new TextField();
	TextField t5=new TextField();
	TextField t6=new TextField();
	TextField t7=new TextField();
	TextField t8=new TextField();
	
	Button b1=new Button("Calculate");
	Button b2=new Button("Clear");
	Button b3=new Button("Exit");
	Button b4=new Button("About");
	
	Font f=new Font("arial",Font.PLAIN,18);
	
	Frame frame=new Frame();
	
	Employees(){
		

		frame.setLayout(null);
		frame.setBounds(300,50,350,700);
		
		l1.setBounds(50,20,250,50);
		l2.setBounds(20,70,180,50);
		l3.setBounds(20,150,180,50);
		l4.setBounds(20,220,180,50);
		l5.setBounds(20,290,180,50);
		l6.setBounds(20,360,180,50);
		l7.setBounds(20,430,180,50);
		l8.setBounds(20,500,180,50);
		l9.setBounds(20,570,180,50);
		
		t1.setBounds(210,80,120,30);
		t2.setBounds(210,160,120,30);
		t3.setBounds(210,230,120,30);
		t4.setBounds(210,300,120,30);
		t5.setBounds(210,370,120,30);
		t6.setBounds(210,440,120,30);
		t7.setBounds(210,510,120,30);
		t8.setBounds(210,580,120,30);
		
		b1.setBounds(20,120,80,30);
		b2.setBounds(20,630,50,30);
		b3.setBounds(80,630,50,30);
		b4.setBounds(140,630,50,30);
		
		l1.setFont(f);
		
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		frame.add(l6);
		frame.add(l7);
		frame.add(l8);
		frame.add(l9);
		
		frame.add(t1);
		frame.add(t2);
		frame.add(t3);
		frame.add(t4);
		frame.add(t5);
		frame.add(t6);
		frame.add(t7);
		frame.add(t8);
		
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		
		frame.show();
		
	}
	
	public static void main(String arg[]){
		Employees as=new Employees();
		
	}
}