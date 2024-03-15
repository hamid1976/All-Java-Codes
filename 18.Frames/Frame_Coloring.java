import java.awt.*;

import java.awt.event.*;

class Frame_Coloring implements ActionListener{

Frame win=new Frame();

Button b1=new Button("Red");
Button b2=new Button("Green");
Button b3=new Button("Blue");
Button b4=new Button("Yellow");
Button b5=new Button("Black");
Button b6=new Button("Orange");
Button b7=new Button("White");
Button b8=new Button("Pink");
Button b9=new Button("Gray");
Button b10=new Button("Magenta");


Frame_Coloring(){
	
	
	win.setLayout(null);
	
	b1.setBounds(100,100,100,25);
	b2.setBounds(100,130,100,25);
	b3.setBounds(100,160,100,25);
	b4.setBounds(100,190,100,25);
	b5.setBounds(100,220,100,25);
	b6.setBounds(100,250,100,25);
    b7.setBounds(100,280,100,25);
	b8.setBounds(100,310,100,25);
	b9.setBounds(100,340,100,25);
	b10.setBounds(100,370,100,25);
	
	win.add(b1);
    win.add(b2);
	win.add(b3);
	win.add(b4);
	win.add(b5);
	win.add(b6);
    win.add(b7);
	win.add(b8);
	win.add(b9);
    win.add(b10);
			
							
	
	win.setBounds(0,0,500,500);
	win.show();
	
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
		win.setBackground(Color.black);
	 
	 if(b6==e.getSource())
		 win.setBackground(Color.orange);
	 
	 if(b7==e.getSource())
		win.setBackground(Color.white);
	 
	 if(b8==e.getSource())
		 win.setBackground(Color.pink);
	 
	 if(b9==e.getSource())
		win.setBackground(Color.gray);
	 
	 if(b10==e.getSource())
	    win.setBackground(Color.magenta);
	 
}

 	 
        public static void main(String arg[]){
	 Frame_Coloring ob=new Frame_Coloring();
	 
 }

 }