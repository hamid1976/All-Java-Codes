import java.awt.*;

class Marksheet{
	
	Label l1=new Label("Mark sheet");
	Label l2=new Label("Enter java Marks");
	Label l3=new Label("Enter Oracle Marks");
	Label l4=new Label("Enter VB Marks");
	Label l5=new Label("Enter Php Marks");
	Label l6=new Label("Enter C Marks");
	Label l7=new Label("Obtained Marks");
	Label l8=new Label("Total Marks");
	Label l9=new Label("Percentage");
	
	TextField t1=new TextField();
	TextField t2=new TextField();
	TextField t3=new TextField();
	TextField t4=new TextField();
	TextField t5=new TextField();
	TextField t6=new TextField();
	TextField t7=new TextField();
	TextField t8=new TextField();
	
	Button b1=new Button("Calculate");
	Button b2=new Button("Exit");
	Button b3=new Button("About");
	Button b4=new Button("Clear");
	
	Frame frame=new Frame();
	
	Marksheet(){
		
		frame.setBounds(300,50,300,700);
		frame.setLayout(null);
		
		l1.setBounds(120,20,100,50);
		l2.setBounds(20,70,100,50);
		l3.setBounds(20,140,100,50);
		l4.setBounds(20,210,100,50);
		l5.setBounds(20,280,100,50);
		l6.setBounds(20,350,100,50);
		l7.setBounds(20,430,100,50);
		l8.setBounds(20,500,100,50);
		l9.setBounds(20,570,100,50);
		
		t1.setBounds(150,80,120,30);
		t2.setBounds(150,150,120,30);
		t3.setBounds(150,220,120,30);
		t4.setBounds(150,290,120,30);
		t5.setBounds(150,360,120,30);
		t6.setBounds(150,440,120,30);
		t7.setBounds(150,510,120,30);
		t8.setBounds(150,580,120,30);
		
		b1.setBounds(80,400,150,30);
		b2.setBounds(50,620,50,30);
		b3.setBounds(110,620,100,30);
		b4.setBounds(220,620,50,30);
		
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
		 Marksheet as=new Marksheet();
		 
	}
}
		
		