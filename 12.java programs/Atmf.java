import java.awt.*;

class Atmf{
		
    public static void main(String arg[]){
	
	    Frame frame=new Frame("ATM");
	
    	frame.setLayout(null);
    	frame.setBounds(300,200,360,580);
	
    	Label l1=new Label("Enter Rupees");
    	l1.setBounds(20,50,200,30);
	
    	Label l2=new Label("5000");
    	l2.setBounds(20,120,50,30);
	
    	Label l3=new Label("1000");
    	l3.setBounds(20,160,50,30);
	
    	Label l4=new Label("500");
    	l4.setBounds(20,200,50,30);
	
    	Label l5=new Label("100");
    	l5.setBounds(20,240,50,30);
	
    	Label l6=new Label("50");
    	l6.setBounds(20,280,50,30);
	
    	Label l7=new Label("20");
	    l7.setBounds(20,320,50,30);
	
    	Label l8=new Label("10");
    	l8.setBounds(20,360,50,30);
	
    	Label l9=new Label("5");
    	l9.setBounds(20,400,50,30);
	
    	Label l10=new Label("2");
    	l10.setBounds(20,440,50,30);
	
    	Label l11=new Label("1");
    	l11.setBounds(20,480,50,30);
		
		
		TextField t1=new TextField();
		t1.setBounds(20,80,200,30);
		
		TextField t2=new TextField();
		t2.setBounds(100,120,120,30);
		
		TextField t3=new TextField();
		t3.setBounds(100,160,120,30);
		
		TextField t4=new TextField();
		t4.setBounds(100,200,120,30);
		
		TextField t5=new TextField();
		t5.setBounds(100,240,120,30);
		
		TextField t6=new TextField();
		t6.setBounds(100,280,120,30);
		
		TextField t7=new TextField();
		t7.setBounds(100,320,120,30);
		
		TextField t8=new TextField();
		t8.setBounds(100,360,120,30);
		
		TextField t9=new TextField();
		t9.setBounds(100,400,120,30);
		
		TextField t10=new TextField();
		t10.setBounds(100,440,120,30);
		
		TextField t11=new TextField();
		t11.setBounds(100,480,120,30);
	
    	Button b1=new Button("Convert");
		b1.setBounds(240,80,100,30);
		
		Button b2=new Button("About");
		b2.setBounds(20,530,100,30);
		
		Button b3=new Button("Clear");
		b3.setBounds(130,530,100,30);
		
		Button b4=new Button("Exit");
		b4.setBounds(240,530,100,30);
		
		
		
		Font f=new Font("arial",Font.PLAIN,20);
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
}
	
   

	
   


	