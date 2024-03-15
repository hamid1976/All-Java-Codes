import java.awt.*;

class Frametest8{
	
	public static void main(String arg[]){
		Frame frame=new Frame();
		
		frame.setLayout(null);
		frame.setBounds(300,200,360,250);
		
		Label l1=new Label("Enter Days");
		l1.setBounds(20,40,80,30);
		
		Label l2=new Label("Years");
		l2.setBounds(20,80,50,30);
		
		Label l3=new Label("Weeks");
		l3.setBounds(20,120,50,30);
		
		Label l4=new Label("Days");
		l4.setBounds(20,160,50,30);
		
		
		TextField t1=new TextField();
		t1.setBounds(130,40,100,30);
		
		TextField t2=new TextField();
		t2.setBounds(130,80,100,30);
		
		TextField t3=new TextField();
		t3.setBounds(130,120,100,30);
		
		TextField t4=new TextField();
		t4.setBounds(130,160,100,30);
		
		
		Button  b1=new Button("Convert");
		b1.setBounds(240,40,100,30);
		
		Button  b2=new Button("About");
		b2.setBounds(20,200,100,30);
		
		Button  b3=new Button("Clear");
		b3.setBounds(130,200,100,30);
		
		Button  b4=new Button("Exit");
		b4.setBounds(240,200,100,30);
		
		
		Font f=new Font("arial",Font.PLAIN,15);
		l1.setFont(f);
		l2.setFont(f);
		l3.setFont(f);
		l4.setFont(f);
		
		
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		
		frame.add(t1);
		frame.add(t2);
		frame.add(t3);
		frame.add(t4);
		
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		
		frame.show();
		
	}
}