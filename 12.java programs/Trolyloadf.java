import java.awt.*;

class Trolyloadf{
	
	public static void main(String arg[]){
		Frame frame=new Frame("Trolyload Frame");
		
		frame.setBounds(300,50,400,550);
		frame.setLayout(null);
		
		Label l1=new Label("Troly load");
		l1.setBounds(160,20,110,50);
		
		Label l2=new Label("Enter Troly load");
		l2.setBounds(20,70,110,50);
		
		Label l3=new Label("Total Income");
		l3.setBounds(20,140,110,50);
		
		Label l4=new Label("Driver");
		l4.setBounds(20,210,110,50);
		
		Label l5=new Label("Tax 10%");
		l5.setBounds(20,280,110,50);
		
		Label l6=new Label("Disel");
		l6.setBounds(20,350,110,50);
		
		Label l7=new Label("Profit");
		l7.setBounds(20,420,110,50);
		
		
		
		TextField t1=new TextField();
		t1.setBounds(150,80,120,30);
		
		TextField t2=new TextField();
		t2.setBounds(150,150,120,30);
		
		TextField t3=new TextField();
		t3.setBounds(150,220,120,30);
		
		TextField t4=new TextField();
		t4.setBounds(150,290,120,30);
		
		TextField t5=new TextField();
		t5.setBounds(150,360,120,30);
		
		TextField t6=new TextField();
		t6.setBounds(150,430,120,30);
		
		
		
		Button b1=new Button("Calculate");
		b1.setBounds(300,80,80,30);
		
	    Button b2=new Button("Clear");
		b2.setBounds(20,480,80,30);
		
		Button b3=new Button("Exit");
		b3.setBounds(110,480,80,30);
		
		Button b4=new Button("About");
		b4.setBounds(200,480,80,30);
		
		
		
		Font font=new Font("arial",Font.PLAIN,18);
		l1.setFont(font);
		
		Font font2=new Font("arial",Font.PLAIN,15);
		l2.setFont(font2);
		l3.setFont(font2);
		l4.setFont(font2);
		l5.setFont(font2);
		l6.setFont(font2);
		l7.setFont(font2);
		
		
		
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
}
