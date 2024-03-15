import java.awt.*;

class Employee{
	
	public static void main(String arg[]){
		Frame frame=new Frame("Employees Salary calculater");
		
		frame.setLayout(null);
		frame.setBounds(300,50,350,700);
		
		Label l1=new Label("Employees Salary Calcuate");
		l1.setBounds(50,20,250,50);
		
		Label l2=new Label("Enter Employee Basic Pay");
		l2.setBounds(20,70,180,50);
		
		Label l3=new Label("House Rent 45%");
		l3.setBounds(20,150,180,50);
		
		Label l4=new Label("Medical allowance 15% ");
		l4.setBounds(20,220,180,50);
		
		Label l5=new Label("Bonns 5%");
		l5.setBounds(20,290,180,50);
		
		Label l6=new Label("Gross Pay");
		l6.setBounds(20,360,180,50);
		
		Label l7=new Label("Income Tax 3%");
		l7.setBounds(20,430,180,50);
		
		Label l8=new Label("Zukwat 2.5%");
		l8.setBounds(20,500,180,50);
		
		Label l9=new Label("Convace Allowance 8%");
		l9.setBounds(20,570,180,50);
		
		
		
		TextField t1=new TextField();
		t1.setBounds(210,80,120,30);
		
		TextField t2=new TextField();
		t2.setBounds(210,160,120,30);
		
		TextField t3=new TextField();
		t3.setBounds(210,230,120,30);
		
		TextField t4=new TextField();
		t4.setBounds(210,300,120,30);
		
		TextField t5=new TextField();
		t5.setBounds(210,370,120,30);
		
		TextField t6=new TextField();
		t6.setBounds(210,440,120,30);
		
		TextField t7=new TextField();
		t7.setBounds(210,510,120,30);
		
		TextField t8=new TextField();
		t8.setBounds(210,580,120,30);
		
		
		
		Button b1=new Button("calculate");
		b1.setBounds(20,120,80,30);
		
		Button b2=new Button("Clear");
		b2.setBounds(20,630,50,30);
		
		Button b3=new Button("Exit");
		b3.setBounds(80,630,50,30);
		
		Button b4=new Button("About");
		b4.setBounds(140,630,50,30);
		
		
		Font font=new Font("arial",Font.PLAIN,18);
		l1.setFont(font);
		
		Font font2=new Font("arial",Font.PLAIN,15);
		l2.setFont(font2);
		l3.setFont(font2);
		l4.setFont(font2);
		l5.setFont(font2);
		l6.setFont(font2);
		l7.setFont(font2);
		l8.setFont(font2);
		l9.setFont(font2);
		
		
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
}