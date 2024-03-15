import java.awt.*;

class Frametest6{
	
	public static void main(String arg[]){
		
		Frame f=new Frame("Frame Test6");
		
		f.setBounds(300,50,300,700);
		f.setLayout(null);
		
		Label l1=new Label ("Mark Sheet");
		l1.setBounds(120,20,100,50);
		
		Label l2=new Label ("Enter Java Marks");
		l2.setBounds(20,70,100,50);
				
		Label l3=new Label ("Enter Oracle Marks");
		l3.setBounds(20,140,100,50);
		
		Label l4=new Label ("Enter VB Marks");
		l4.setBounds(20,210,100,50);
		
		Label l5=new Label ("Enter Php Marks");
		l5.setBounds(20,280,100,50);
				
		Label l6=new Label ("Enter C Marks");
		l6.setBounds(20,350,100,50);
		
		Label l7=new Label ("Obtained Marks");
		l7.setBounds(20,430,100,50);
		
		Label l8=new Label ("TOtel Marks");
		l8.setBounds(20,500,100,50);
		
		Label l9=new Label ("Percentage");
		l9.setBounds(20,570,100,50);
		
		
		
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
		t6.setBounds(150,440,120,30);
		
		TextField t7=new TextField();
		t7.setBounds(150,510,120,30);
		
		TextField t8=new TextField();
		t8.setBounds(150,580,120,30);
		
		
		
		Button b1=new Button("Calculate");
		b1.setBounds(80,400,150,30);
		
		Button b2=new Button("Exit");
		b2.setBounds(50,620,50,30);
		
		Button b3=new Button("About");
		b3.setBounds(110,620,100,30);
		
		Button b4= new Button("Clear");
		b4.setBounds(220,620,50,30);
		
		
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(l7);
		f.add(l8);
		f.add(l9);
		
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(t5);
		f.add(t6);
		f.add(t7);
		f.add(t8);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
        f.add(b4);
		
		f.show();
		
	}
}
		