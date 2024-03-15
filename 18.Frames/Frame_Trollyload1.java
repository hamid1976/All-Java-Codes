import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Frame_Trollyload1 implements ActionListener {
	Frame win =new Frame ("Trollyload ");
	
	        Label l1=new Label("Enter Trollyload ");
			Label l2=new Label("Total Income ?");
			Label l3=new Label("Driver?");
			Label l4=new Label("Tax 10% ?");
			Label l5=new Label("Diesel?");
			Label l6=new Label("Profit?");
			Label l7=new Label("Bell Labs Transport");
			
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
			
	Frame_Trollyload1(){
			
			win.setBounds(100,40,410,380);
			win.setLayout(null);
			
			l1.setBounds(10,70,140,25);
			t1.setBounds(200,70,100,25);
			
			l2.setBounds(10,120,140,25);
			t2.setBounds(200,120,100,25);
			
			l3.setBounds(10,160,140,25);
			t3.setBounds(200,160,100,25);
			
			l4.setBounds(10,200,100,25);
			t4.setBounds(200,200,100,25);
			
			l5.setBounds(10,240,100,25);
			t5.setBounds(200,240,100,25);
			
			l6.setBounds(10,280,100,25);
			t6.setBounds(200,280,100,25);
			
			l7.setBounds(50,20,200,50);
			
			b1.setBounds(320,70,80,25);
			b2.setBounds(10,320,100,25);
			b3.setBounds(160,320,100,25);
			b4.setBounds(300,320,100,25);
		    calculateButton.addActionListener(this);
			aboutButton.addActionListener(this);
			clearButton.addActionListener(this);
			exitButton.addActionListener(this);
			
			Font f=new Font("Bell Labs Transport",Font.ITALIC,20);
		    l7.setFont(f);
				
			win.add(l1);
		    win.add(l2);
			win.add(l3);
			win.add(l4);
		    win.add(l5);
		    win.add(l6);
			win.add(l7);
			
			win.add(t1);
		    win.add(t2);
			win.add(t3);
			win.add(t4);
		    win.add(t5);
		    win.add(t6);
			

		    win.add(calculateButton);
		    win.add(AboutButton);
			win.add(clearButton);
			win.add(exitButton);
			
			win.setLayout(null);
			win.show();
			
	}
	public void actionPerformed(ActionEvent h){
		
		if(aboutButton==h.getSource()){
			JOptionPane.showMessageDialog(null,"Eng :abc \norganization :xyz \nEmail :abc@.com \ncontact:12345");  }
		
		    if(exitButton==h.getSource()) 
			System.exit(0);
		
		    if(calculateButton==h.getSource()){
		    int a=Integer.parseInt(t1.getText());
		    int TotalIncome=800*a;
		    int Driver=150*a;
		    int Tax=10*a;
		    int Diesel=210*a;
		
		
		    int  Profit=TotalIncome-(Tax+Driver+Diesel);
		
		    t2.setText(""+(TotalIncome));
			t3.setText(""+(Driver));
			t4.setText(""+(Tax));
			t5.setText(""+(Diesel));
			t6.setText(""+(Profit));
			}
		    if(exitButton==h.getSource()){
			
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			t6.setText("");}
			
		
        
	}
         public static void main(String arg[]){
			Frame_Trollyload1 ob=new Frame_Trollyload1();
			
		}
}
				