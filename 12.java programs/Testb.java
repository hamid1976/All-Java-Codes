import java.awt.event.*;
import java.awt.*;

class Testb implements ActionListener{
	
	Button b1=new Button("red");
	Button b2=new Button("green");
	Button b3=new Button("orange");
	Button b4=new Button("yellow");
	Button b5=new Button("cyan");
	Button b6=new Button("white");
	Button b7=new Button("black");
	Button b8=new Button("gray");
	Button b9=new Button("blue");
	Button b10=new Button("pink");
	
	Frame f=new Frame();
	
	Testb(){
		
		f.setLayout(null);
		f.setBounds(300,200,330,360);
		
		b1.setBounds(100,40,100,25);
		b2.setBounds(100,70,100,25);
		b3.setBounds(100,100,100,25);
		b4.setBounds(100,130,100,25);
		b5.setBounds(100,160,100,25);
		b6.setBounds(100,190,100,25);
		b7.setBounds(100,220,100,25);
		b8.setBounds(100,250,100,25);
		b9.setBounds(100,280,100,25);
		b10.setBounds(100,310,100,25);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b10);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		
		f.show();
		
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==b1)
			f.setBackground(Color.red);
		
		if(e.getSource()==b2)
			f.setBackground(Color.green);
		
		if(e.getSource()==b3)
			f.setBackground(Color.orange);
		
		if(e.getSource()==b4)
			f.setBackground(Color.yellow);
		
		if(e.getSource()==b5)
			f.setBackground(Color.cyan);
		
		if(e.getSource()==b6)
			f.setBackground(Color.white);
		
		if(e.getSource()==b7)
			f.setBackground(Color.black);
		
		if(e.getSource()==b8)
			f.setBackground(Color.gray);
		
		if(e.getSource()==b9)
			f.setBackground(Color.blue);
		
		if(e.getSource()==b10)
			f.setBackground(Color.pink);
		
	}
		
		public static void main(String arg[]){
			
			Testb as=new Testb();
			
		}
}
		