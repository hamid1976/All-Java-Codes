import java.awt.*;
class EmployeeBasicPay{
	public static void main(String arg[]){
		Frame win=new Frame();
		
		Label Employee=new Label("     Employee Salary Calculator");
		
		Label l1=new Label("Enter Employee Basic Pay");
		Label l2=new Label("HouseRent 45%");
		Label l3=new Label("MedicalAllowance 15%");
		Label l4=new Label("Bonus 5%");
		Label l5=new Label("GrossPay");
		Label l6=new Label("ConvanceAllowance 8%");
		Label l7=new Label("Zakwat 2.5%");
		Label l8=new Label("IncomeTax 5%");
		Label l9=new Label("NetIncome");
		
		TextField t1=new TextField();
		TextField t2=new TextField();
		TextField t3=new TextField();
		TextField t4=new TextField();
		TextField t5=new TextField();
		TextField t6=new TextField();
		TextField t7=new TextField();
		TextField t8=new TextField();
		TextField t9=new TextField();
		
		
		Button b1=new Button("Calculate");
		Button b2=new Button("About");
		Button b3=new Button("Clear");
		Button b4=new Button("Exit");
		
		Employee.setSize(180,30);
		Employee.setLocation(170,40);
		
		l1.setSize(150,30);
		l1.setLocation(50,130);
		
		l2.setSize(150,30);
		l2.setLocation(50,170);
		
		l3.setSize(150,30);
		l3.setLocation(50,210);
		
		l4.setSize(150,30);
		l4.setLocation(50,250);
		
		l5.setSize(150,30);
		l5.setLocation(50,290);
		
		l6.setSize(150,30);
		l6.setLocation(50,330);
		
		l7.setSize(150,30);
		l7.setLocation(50,370);
		
		l8.setSize(150,30);
		l8.setLocation(50,410);
		
		l9.setSize(150,30);
		l9.setLocation(50,450);
		
		t1.setSize(100,30);
		t1.setLocation(220,130);
		
		t2.setSize(100,30);
		t2.setLocation(220,170);
		
		t3.setSize(100,30);
		t3.setLocation(220,210);
		
		t4.setSize(100,30);
		t4.setLocation(220,250);
		
		t5.setSize(100,30);
		t5.setLocation(220,290);
		
		t6.setSize(100,30);
		t6.setLocation(220,330);
		
		t7.setSize(100,30);
		t7.setLocation(220,370);
		
		t8.setSize(100,30);
		t8.setLocation(220,410);
		
		t9.setSize(100,30);
		t9.setLocation(220,450);
		
		b1.setSize(130,30);
		b1.setLocation(340,130);
		
		b2.setSize(130,30);
		b2.setLocation(50,520);
		
		b3.setSize(130,30);
		b3.setLocation(200,520);
		
		b4.setSize(130,30);
		b4.setLocation(350,520);
		
		Employee.setBackground(Color.green);
		
		l1.setBackground(Color.green);
		l2.setBackground(Color.green);
		l3.setBackground(Color.green);
		l4.setBackground(Color.green);
		l5.setBackground(Color.green);
		l6.setBackground(Color.green);
		l7.setBackground(Color.green);
		l8.setBackground(Color.green);
		l9.setBackground(Color.green);
		
		b1.setBackground(Color.red);
		b2.setBackground(Color.red);
		b3.setBackground(Color.red);
		b4.setBackground(Color.red);
		
		win.setBackground(Color.orange);
		
		win.add(Employee);
		win.add(l1);
		win.add(l2);
		win.add(l3);
		win.add(l4);
		win.add(l5);
		win.add(l6);
		win.add(l7);
		win.add(l8);
		win.add(l9);
		win.add(t1);
		win.add(t2);
		win.add(t3);
		win.add(t4);
		win.add(t5);
		win.add(t6);
		win.add(t7);
		win.add(t8);
		win.add(t9);
		win.add(b1);
		win.add(b2);
		win.add(b3);
		win.add(b4);
		
		win.setSize(500,700);
		win.setLayout(null);
		win.show();
	}
}