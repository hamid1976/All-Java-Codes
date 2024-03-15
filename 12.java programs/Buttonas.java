import java.awt.*;

class Buttonas{
	
	public static void main(String arg[]){
		Frame f=new Frame ();
		
		f.setLayout(null);
		f.setBounds(300,200,400,400);
		
		
		Button b1=new Button("");
		b1.setBounds(250,100,100,30);
		b1.setBackground(Color.white);
		
		Button b2=new Button("");
		b2.setBounds(250,170,100,30);
		b2.setBackground(Color.white);
		
		Button b3=new Button("");
		b3.setBounds(250,210,100,30);
		b3.setBackground(Color.white);
		
		Button b4=new Button("");
		b4.setBounds(250,240,100,30);
		b4.setBackground(Color.white);
		
		Button b5=new Button("");
		b5.setBounds(250,270,100,30);
		b5.setBackground(Color.white);
		
		Label l1=new Label ("Mark Sheet");
		l1.setBounds(200,00,100,100);
		
		Label l2=new Label("Ent Java Marks");
		l2.setBounds(10,70,100,100);
		
		Label l3=new Label("Enter  Oracle Marks");
		l3.setBounds(10,130,100,100);
		
		Label l4=new Label("Enter Vb Marks");
		l4.setBounds(10,70,100,100);
		
		Label l5=new Label("Enter Php Marks");
		l5.setBounds(10,70,100,100);
		
		Label l6=new Label("Enter Marks");
		l6.setBounds(10,70,100,100);
		
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		
		f.show();
	}
}