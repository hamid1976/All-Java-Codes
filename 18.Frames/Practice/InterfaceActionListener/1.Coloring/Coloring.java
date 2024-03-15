import java.awt.*;
import java.awt.event.*;
class Coloring implements ActionListener{
	Frame win=new Frame();
	
	Button b1=new Button("Red");
	Button b2=new Button("Green");
	Button b3=new Button("Blue");
	Button b4=new Button("Yellow");
	Button b5=new Button("Pink");
	Button b6=new Button("Orange");
	
	Coloring(){
		win.setLayout(null);
		
		b1.setBounds(100,100,100,40);
		b2.setBounds(100,150,100,40);
		b3.setBounds(100,200,100,40);
		b4.setBounds(220,100,100,40);
		b5.setBounds(220,150,100,40);
		b6.setBounds(220,200,100,40);
		
		win.add(b1);
		win.add(b2);
		win.add(b3);
		win.add(b4);
		win.add(b5);
		win.add(b6);
	
		win.setBounds(0,0,500,500);
		win.show();
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);

	}
	public void actionPerformed(ActionEvent e){
		if(b1==e.getSource())
			win.setBackground(Color.red);
		
		if(b2==e.getSource())
			win.setBackground(Color.green);
		
		if(b3==e.getSource())
			win.setBackground(Color.blue);
		
		if(b4==e.getSource())
			win.setBackground(Color.yellow);
		
		if(b5==e.getSource())
			win.setBackground(Color.pink);
		
		if(b6==e.getSource())
			win.setBackground(Color.orange);
	}
	public static void main(String arg[]){
		Coloring ob=new Coloring();
	}
}