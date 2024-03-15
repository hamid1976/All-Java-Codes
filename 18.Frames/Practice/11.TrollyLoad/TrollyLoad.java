import java.awt.*;
class TrollyLoad{
	public static void main(String arg[]){
		Frame win=new Frame();
		
		Label TrollyLoad=new Label("     BellLabs Transport Coperation");
		
		Label l1=new Label("Enter TrollyLoad");
		Label l2=new Label("Total Income:");
		Label l3=new Label("Driver:");
		Label l4=new Label("Tax 10%:");
		Label l5=new Label("Disel:");
		Label l6=new Label("Profit:");
		
		TextField t1=new TextField();
		TextField t2=new TextField();
		TextField t3=new TextField();
		TextField t4=new TextField();
		TextField t5=new TextField();
		TextField t6=new TextField();
		
		Button b1=new Button("Calculate");
		Button b2=new Button("About");
		Button b3=new Button("Clear");
		Button b4=new Button("Exit");
		
		TrollyLoad.setSize(200,30);
		TrollyLoad.setLocation(150,40);
		
		l1.setSize(150,30);
		l1.setLocation(50,120);
		
		l2.setSize(150,30);
		l2.setLocation(50,160);
		
		l3.setSize(150,30);
		l3.setLocation(50,200);
		
		l4.setSize(150,30);
		l4.setLocation(50,240);
		
		l5.setSize(150,30);
		l5.setLocation(50,280);
		
		l6.setSize(150,30);
		l6.setLocation(50,320);
		
		t1.setSize(100,30);
		t1.setLocation(220,120);
		
		t2.setSize(100,30);
		t2.setLocation(220,160);
		
		t3.setSize(100,30);
		t3.setLocation(220,200);
		
		t4.setSize(100,30);
		t4.setLocation(220,240);
		
		t5.setSize(100,30);
		t5.setLocation(220,280);
		
		t6.setSize(100,30);
		t6.setLocation(220,320);
		
		b1.setSize(125,30);
		b1.setLocation(340,120);
		
		b2.setSize(125,30);
		b2.setLocation(50,380);
		
		b3.setSize(125,30);
		b3.setLocation(195,380);
		
		b4.setSize(125,30);
		b4.setLocation(340,380);
		
		win.setBackground(Color.yellow);
		
		TrollyLoad.setBackground(Color.red);
		
		l1.setBackground(Color.green);
		l2.setBackground(Color.green);
		l3.setBackground(Color.green);
		l4.setBackground(Color.green);
		l5.setBackground(Color.green);
		l6.setBackground(Color.green);
		
		b1.setBackground(Color.orange);
		b2.setBackground(Color.pink);
		b3.setBackground(Color.pink);
		b4.setBackground(Color.pink);
		
		win.add(TrollyLoad);
		win.add(l1);
		win.add(l2);
		win.add(l3);
		win.add(l4);
		win.add(l5);
		win.add(l6);
		win.add(t1);
		win.add(t2);
		win.add(t3);
		win.add(t4);
		win.add(t5);
		win.add(t6);
		win.add(b1);
		win.add(b2);
		win.add(b3);
		win.add(b4);
		
		win.setSize(500,600);
		
		win.setLayout(null);
		
		win.show();
	}
}