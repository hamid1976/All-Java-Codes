import java.awt.event.*;
import java.awt.*;

class Test3 implements ActionListener{
	
	Button b1=new Button("red");
	Button b2=new Button("green");
	Button b3=new Button("orange");
	Button b4=new Button("yellow");
	Button b5=new Button("cyan");
	
	Frame frame=new Frame("Action Listener");
	
	Test3(){
		
		frame.setLayout(null);
		frame.setBounds(300,200,300,300);
		
		b1.setBounds(100,40,100,25);
		b2.setBounds(100,70,100,25);
		b3.setBounds(100,100,100,25);
		b4.setBounds(100,130,100,25);
		b5.setBounds(100,160,100,25);
		
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		frame.show();
		
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==b1)
			frame.setBackground(Color.red);
		
		if(e.getSource()==b2)
			frame.setBackground(Color.green);
		
		if(e.getSource()==b3)
			frame.setBackground(Color.orange);
		
		if(e.getSource()==b4)
			frame.setBackground(Color.yellow);
		
		if(e.getSource()==b5)
			frame.setBackground(Color.cyan);
	}
	
	public static void main(String arg[]){
		
		Test3 as=new Test3();
		
	}
}