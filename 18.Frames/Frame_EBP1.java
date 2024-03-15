import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Frame_EBP1 implements ActionListener {
	Frame win =new Frame ("EmployeeBasicpay ");
	
	        Label l1=new Label("Enter EmployeeBasicpay     ");
			Label l2=new Label("Houserent 45%");
			Label l3=new Label("Medical Allowance 15%");
			Label l4=new Label("Bonus 5%");
			Label l5=new Label("Grosspay");
			Label l6=new Label("ConvenceAllowance 8%");
			Label l7=new Label("Zakwat 2.5%");
			Label l8=new Label("Income Tax 5%");
			Label l9=new Label("Net Income");
			Label l10=new Label("Employee Salary Calculator");
			
			TextField t1=new TextField();
			TextField t2=new TextField();
			TextField t3=new TextField();
			TextField t4=new TextField();
			TextField t5=new TextField();
			TextField t6=new TextField();
			TextField t7=new TextField();
			TextField t8=new TextField();
			TextField t9=new TextField();
			
			Button b1=new Button("Calculate");
			Button b2=new Button("About");
			Button b3=new Button("Clear");
			Button b4=new Button("Exit");
			
	Frame_EBP1(){
		    win.setBounds(50,50,450,550);
			win.setLayout(null);
			
			l1.setBounds(10,80,140,25);
			t1.setBounds(200,80,100,25);
			
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
			
			l7.setBounds(10,320,100,25);
			t7.setBounds(200,320,100,25);
			
			l8.setBounds(10,360,140,25);
			t8.setBounds(200,360,100,25);
			
			l9.setBounds(10,400,100,25);
			t9.setBounds(200,400,100,25);
			
			l10.setBounds(100,20,300,50);
			
			Font f=new Font("Employee Salary Calculator",Font.ITALIC,20);
		    l10.setFont(f);
			
			calculateButton.setBounds(320,80,80,30);
			aboutButton.setBounds(10,450,100,30);
			clearButton.setBounds(155,450,100,30);
			exitButton.setBounds(300,450,100,30);
			calculateButton.addActionListener(this);
			aboutButton.addActionListener(this);
			clearButton.addActionListener(this);
			exitButton.addActionListener(this);
			
			
			
			win.add(l1);
		    win.add(l2);
			win.add(l3);
			win.add(l4);
		    win.add(l5);
		    win.add(l6);
		    win.add(l7);
			win.add(l8);
			win.add(l9);
			win.add(l10);
			
			win.add(t1);
		    win.add(t2);
			win.add(t3);
			win.add(t4);
		    win.add(t5);
		    win.add(t6);
		    win.add(t7);
			win.add(t8);
			win.add(t9);
             
            win.add(calculateButton);
		    win.add(AboutButton);
			win.add(clearButton);
			win.add(exitButton);
			
			// win.setLayout(null);
			win.show();
			
	}
	public void actionPerformed(ActionEvent h){
		
		if(aboutButton==h.getSource()){
			JOptionPane.showMessageDialog(null,"Eng :abc \norganization :xyz \nEmail :abc@.com \ncontact:12345");  }
		
		if(exitButton==h.getSource()) 
			System.exit(0);
		
		if(clearButton==h.getSource()){
			
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			t6.setText("");
			t7.setText("");
			t8.setText("");
			t9.setText("");
		}
	   if(calculateButton==h.getSource()){
		   
       int a=Integer.parseInt(t1.getText());
       int Houserent=(a*45)/100;

       int MedicalAllowance=(a*15)/100;

	   int Bonus=(a*5)/100;
	   
	   int Grosspay=a+Houserent+MedicalAllowance+Bonus;
	   
	   double Zakwat=(a*2.5)/100;
	   
	   int IncomeTax=(a*5)/100;
	   
	   int ConvenceAllowance=(a*15)/100;
	   
	   double NetIncome=Grosspay-(IncomeTax+Zakwat+ConvenceAllowance);
	   
	   t1.setText("");
			t2.setText(""+(Houserent));
			t3.setText(""+(MedicalAllowance));
			t4.setText(""+(Bonus));
			t5.setText(""+(Grosspay));
			t6.setText(""+(IncomeTax));
			t7.setText(""+(Zakwat));
			t8.setText(""+(ConvenceAllowance));
			t9.setText(""+(NetIncome));
		}
	}
	        public static void main(String arg[]){
			Frame_EBP1 ob=new Frame_EBP1();
			
		}
}
			