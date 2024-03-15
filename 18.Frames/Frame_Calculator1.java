import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Frame_Calculator1 implements ActionListener {
	Frame win =new Frame ("Calculator ");
	
	Label l1=new Label("Calculator");
	Label l2=new Label("Enter 1st value");
	Label l3=new Label("Enter 2nd value");
	Label l4=new Label("Result");
	
	TextField t1=new TextField();
	TextField t2=new TextField();
	TextField t3=new TextField();
	
	Button addButton=new Button("+");
	Button subButton=new Button("-");
	Button mulButton=new Button("*");
	Button divButton=new Button("/");
	Button remButton=new Button("%");
	
	Button aboutButton=new Button("About");
	Button clearButton=new Button("Clear");
	Button exitButton=new Button("Exit");
	
	Frame_Calculator1(){
		win.setBounds(100,100,350,350);
		win.setLayout(null);
		
		l1.setBounds(100,30,150,40);
		l2.setBounds(50,70,150,50);
		l3.setBounds(50,120,150,50);
		l4.setBounds(50,230,150,50);
		
	    t1.setBounds(200,80,100,30);
	    t2.setBounds(200,120,100,30);
		t3.setBounds(200,240,100,30);
		
		addButton.setBounds(50,180,40,30);
		subButton.setBounds(100,180,40,30);
		mulButton.setBounds(150,180,40,30);
		divButton.setBounds(205,180,40,30);
		remButton.setBounds(259,180,40,30);
		addButton.addActionListener(this);
	    subButton.addActionListener(this);
		mulButton.addActionListener(this);
		divButton.addActionListener(this);
		remButton.addActionListener(this);
		 
		
		aboutButton.setBounds(50,280,50,30);
	    clearButton.setBounds(150,280,50,30);
	    exitButton.setBounds(250,280,50,30);
	    aboutButton.addActionListener(this);
	    clearButton.addActionListener(this);
	    exitButton.addActionListener(this);
		
		Font f=new Font("Calculator",Font.ITALIC,25);
		l1.setFont(f);
		
		// Font f1=new Font("Enter 1st value",Font.BOLD,1);
		 // l2.setFont(f);
		
		 // Font f2=new Font("Enter 2nd value",Font.BOLD,1);
		 // l3.setFont(f);
		
		Font f3=new Font("Result",Font.ITALIC,20);
		l4.setFont(f);
		
			
			win.add(l1);
		    win.add(l2);
			win.add(l3);
			win.add(l4);
				
			win.add(t1);
		    win.add(t2);
			win.add(t3);
			
				
			win.add(addButton);
		    win.add(subButton);
			win.add(mulButton);
			win.add(divButton);
		    win.add(remButton);
			win.add(aboutButton);
			win.add(clearButton);
			win.add(exitButton);
			win.show();
		
	}
	
	public void actionPerformed(ActionEvent z){
		if(addButton==z.getSource()){
			String s1=t1.getText();
			String s2=t2.getText();
			int a=Integer.parseInt(s1);
			int b=Integer.parseInt(s2);
			
			t3.setText(""+(a+b));
		}
		
		if(subButton==z.getSource()){
			String s3=t1.getText();
			String s4=t2.getText();
			int c=Integer.parseInt(s3);
			int d=Integer.parseInt(s4);
			
			t3.setText(""+(c-d));
		}
		if(mulButton==z.getSource()){
			String s5=t1.getText();
			String s6=t2.getText();
			int e=Integer.parseInt(s5);
			int f=Integer.parseInt(s6);
			
			t3.setText(""+(e*f));
		}
		if(divButton==z.getSource()){
			String s7=t1.getText();
			String s8=t2.getText();
			int g=Integer.parseInt(s7);
			int h=Integer.parseInt(s8);
			
			t3.setText(""+(g/h));
		}
		if(remButton==z.getSource()){
			String s9=t1.getText();
			String s10=t2.getText();
			int i=Integer.parseInt(s9);
			int j=Integer.parseInt(s10);
			
			t3.setText(""+(i%j));
		}
		
		if(aboutButton==z.getSource())
			JOptionPane.showMessageDialog(null,"Developer name:Hamid \nOrganization:sindh university \nEmail: abc@.com \ncontact :03163124966");
        if(exitButton==z.getSource())
             System.exit(0);
        if(clearButton==z.getSource()){
            t1.setText("");
		    t2.setText("");
			t3.setText("");
	}
	}//end action
public static void main(String arg[]){
 Frame_Calculator1 ob=new 	Frame_Calculator1();
}
}