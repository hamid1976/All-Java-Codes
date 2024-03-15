import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class Calculater implements ActionListener{
	
	Label label1=new Label("Enter 1st value");
	Label label2=new Label("Enter 2nd value");
	Label label3=new Label("Result");
	
	TextField text1=new TextField();
	TextField text2=new TextField();
	TextField text3=new TextField();
	
	Button addButton=new Button("+");
	Button divButton=new Button("/");
	Button subButton=new Button("-");
	Button mulButton=new Button("*");
	Button remButton=new Button("%");
	Button clearButton=new Button("Clear");
	Button aboutButton=new Button("About");
	Button exitButton=new Button("Exit");
	
	
	Frame frame=new Frame("Calculater");
	
	Font f=new Font ("arial",Font.PLAIN,15);
	
	Calculater(){
		
		frame.setLayout(null);
		frame.setBounds(300,200,340,300);
		
		label1.setBounds(20,50,170,30);
		label2.setBounds(20,100,170,30);
		label3.setBounds(20,200,100,30);
		
		text1.setBounds(210,50,100,30);
		text2.setBounds(210,100,100,30);
		text3.setBounds(140,200,170,30);
		
		addButton.setBounds(20,150,50,30);
		divButton.setBounds(80,150,50,30);
		subButton.setBounds(140,150,50,30);
		mulButton.setBounds(200,150,50,30);
		remButton.setBounds(260,150,50,30);
		clearButton.setBounds(20,240,80,30);
		aboutButton.setBounds(120,240,80,30);
		exitButton.setBounds(230,240,80,30);
		
		label1.setFont(f);
		label2.setFont(f);
		label3.setFont(f);
		
		
		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		
		frame.add(text1);
		frame.add(text2);
		frame.add(text3);
		
		frame.add(addButton);
		frame.add(divButton);
		frame.add(subButton);
		frame.add(mulButton);
		frame.add(remButton);
		frame.add(clearButton);
		frame.add(aboutButton);
		frame.add(exitButton);
		
		
		addButton.addActionListener(this);
		divButton.addActionListener(this);
		subButton.addActionListener(this);
		mulButton.addActionListener(this);
		remButton.addActionListener(this);
		clearButton.addActionListener(this);
		aboutButton.addActionListener(this);
		exitButton.addActionListener(this);
		
		
		
		frame.show();
		
	}

			 
		public void actionPerformed(ActionEvent e){
			
			if(clearButton==e.getSource()){
				text1.setText("");
			    text2.setText("");
			    text3.setText("");
			}
			 
			 if(exitButton==e.getSource())
				 System.exit(0);
			 
			
			 if(aboutButton==e.getSource())
				JOptionPane.showMessageDialog(null,"cottEng: abc\norgauization: xyz\nEmail: abc@xy20.com\nContact: 03144124925 ");
			
			
			int a=Integer.parseInt(text1.getText());
			int b=Integer.parseInt(text2.getText());
			
			if(addButton==e.getSource())
				text3.setText(""+(a+b));
			
			if(divButton==e.getSource())
				text3.setText(""+(a/b));
			
			if(subButton==e.getSource())
				text3.setText(""+(a-b));
			
			if(mulButton==e.getSource())
				text3.setText(""+(a*b));
			
			if(remButton==e.getSource())
				text3.setText(""+(a%b));
			
			

				 
		}
		
		public static void main(String arg[]){
			
			Calculater as=new Calculater();
			
		}
}
			 
				
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
	