import java.awt.event.*;
import java.awt.*;

class Testgui2 implements ActionListener{
	
	Button b1=new Button ("red");
	Button b2=new Button ("green");
	Button b3=new Button ("yellow");
	
	Frame win=new Frame();
	
	Testgui2(){
		
		win.setLayout(null);
		win.setBounds(300,200,300,300);
		
		b1.setBounds(100,100,100,25);
		b2.setBounds(100,130,100,25);
		b3.setBounds(100,160,100,25);
		
		win.add(b1);
		win.add(b2);
		win.add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		win.show();
		
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==b1)
			win.setBackground(Color.red);
		
		if(e.getSource()==b2)
			win.setBackground(Color.green);
		
		if(e.getSource()==b3)
			win.setBackground(Color.yellow);
		
	}
	
	public static void main(String arg[]){
		
		Testgui2 as=new Testgui2();
		
	}
}
	
	