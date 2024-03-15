import java.awt.*;
class Marksheet{
	public static void main(String arg[]){
		Frame win=new Frame();
		
		Label Marksheet=new Label("           Marksheet");

		Label l1=new Label("Enter Java Marks");
		Label l2=new Label("Enter VB Marks");
		Label l3=new Label("Enter Oracle Marks");
		Label l4=new Label("Enter PHP Marks");
		Label l5=new Label("Enter C++ Marks");
		Label l6=new Label("Obtain Marks");
		Label l7=new Label("Total Marks");
		Label l8=new Label("Percentage");
		Label l9=new Label("Grade");
		
		Button b1=new Button("Calculate");
		Button b2=new Button("About");
		Button b3=new Button("Clear");
		Button b4=new Button("Exit");
		
		TextField t1=new TextField();
		TextField t2=new TextField();
		TextField t3=new TextField();
		TextField t4=new TextField();
		TextField t5=new TextField();
		TextField t6=new TextField();
		TextField t7=new TextField();
		TextField t8=new TextField();
		TextField t9=new TextField();
		
		Marksheet.setSize(130,30);
		Marksheet.setLocation(200,100);
		
		l1.setSize(150,30);
		l1.setLocation(100,150);
		
	    l2.setSize(150,30);
		l2.setLocation(100,190);
		
		l3.setSize(150,30);
		l3.setLocation(100,230);
		
		l4.setSize(150,30);
		l4.setLocation(100,270);
		
		l5.setSize(150,30);
		l5.setLocation(100,310);
		
		t1.setSize(100,30);
		t1.setLocation(300,150);
		
		t2.setSize(100,30);
		t2.setLocation(300,190);
		
		t3.setSize(100,30);
		t3.setLocation(300,230);
		
		t4.setSize(100,30);
		t4.setLocation(300,270);
		
	    t5.setSize(100,30);
		t5.setLocation(300,310);
		
		
		
		
		b1.setSize(150,30);
		b1.setLocation(100,350);
		
		
		
		
		l6.setSize(150,30);
		l6.setLocation(100,390);
		
	    l7.setSize(150,30);
		l7.setLocation(100,430);
		
		l8.setSize(150,30);
		l8.setLocation(100,470);
		
		l9.setSize(150,30);
		l9.setLocation(100,510);
		
		t6.setSize(100,30);
		t6.setLocation(300,390);
		
		t7.setSize(100,30);
		t7.setLocation(300,430);
		
		t8.setSize(100,30);
		t8.setLocation(300,470);
		
		t9.setSize(100,30);
		t9.setLocation(300,510);
		
		
		
		b2.setSize(100,30);
		b2.setLocation(100,590);
		
		b3.setSize(100,30);
		b3.setLocation(200,590);
		
		b4.setSize(100,30);
		b4.setLocation(300,590);
		
		win.setBackground(Color.gray);
		
		Marksheet.setBackground(Color.pink);
		
		l1.setBackground(Color.orange);
		l2.setBackground(Color.orange);
		l3.setBackground(Color.orange);
		l4.setBackground(Color.orange);
		l5.setBackground(Color.orange);
		l6.setBackground(Color.orange);
		l7.setBackground(Color.orange);
		l8.setBackground(Color.orange);
		l9.setBackground(Color.orange);
		
		b1.setBackground(Color.red);
		
		b2.setBackground(Color.green);
		b3.setBackground(Color.green);
		b4.setBackground(Color.green);

		win.add(Marksheet);
		
		win.add(l1);
		win.add(l2);
		win.add(l3);
		win.add(l4);
		win.add(l5);
		win.add(t1);
		win.add(t2);
		win.add(t3);
		win.add(t4);
		win.add(t5);
		
		
		win.add(b1);
		
		
		win.add(l6);
		win.add(l7);
		win.add(l8);
		win.add(l9);
		win.add(t6);
		win.add(t7);
		win.add(t8);
		win.add(t9);
		
		
		win.add(b2);
		win.add(b3);
		win.add(b4);
		
		
		
		win.setSize(500,700);
		win.setLayout(null);
		win.show();
		
	}
}