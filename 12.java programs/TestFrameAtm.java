import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class TestFrameAtm implements ActionListener{
	
	Label label1=new Label("Enter Rupees");
	Label label2=new Label("5000");
	Label label3=new Label("1000");
	Label label4=new Label("500");
	Label label5=new Label("100");
	Label label6=new Label("50");
	Label label7=new Label("20");
	Label label8=new Label("10");
	Label label9=new Label("5");
	Label label10=new Label("2");
	Label label11=new Label("1");
	
	TextField text1=new TextField();
	TextField text2=new TextField();
	TextField text3=new TextField();
	TextField text4=new TextField();
	TextField text5=new TextField();
	TextField text6=new TextField();
	TextField text7=new TextField();
	TextField text8=new TextField();
	TextField text9=new TextField();
	TextField text10=new TextField();
	TextField text11=new TextField();
	
	Button convertbutton=new Button("Convert");
	Button aboutbutton=new Button("Abuot");
	Button clearbutton=new Button("Clear");
	Button exitbutton=new Button("Exit");
	
	Frame frame=new Frame("ATM");
	
	Font f=new Font("arial",Font.PLAIN,15);
	Font f2=new Font("arial",Font.PLAIN,20);
	
	TestFrameAtm(){
		
		frame.setLayout(null);
		frame.setBounds(300,200,300,570);
		
		label1.setBounds(20,30,100,30);
		label2.setBounds(20,110,50,30);
		label3.setBounds(20,150,50,30);
		label4.setBounds(20,190,50,30);
		label5.setBounds(20,230,50,30);
		label6.setBounds(20,270,50,30);
		label7.setBounds(20,310,50,30);
		label8.setBounds(20,350,50,30);
		label9.setBounds(20,390,50,30);
		label10.setBounds(20,430,50,30);
		label11.setBounds(20,470,50,30);
		
		
		text1.setBounds(20,70,160,30);
		text2.setBounds(80,110,100,30);
		text3.setBounds(80,150,100,30);
		text4.setBounds(80,190,100,30);
		text5.setBounds(80,230,100,30);
		text6.setBounds(80,270,100,30);
		text7.setBounds(80,310,100,30);
		text8.setBounds(80,350,100,30);
		text9.setBounds(80,390,100,30);
		text10.setBounds(80,430,100,30);
		text11.setBounds(80,470,100,30);
		
		
		convertbutton.setBounds(190,70,100,30);
		aboutbutton.setBounds(20,510,70,30);
		clearbutton.setBounds(100,510,70,30);
		exitbutton.setBounds(180,510,70,30);
		
		convertbutton.addActionListener(this);
		aboutbutton.addActionListener(this);
		clearbutton.addActionListener(this);
		exitbutton.addActionListener(this);
		
		label1.setFont(f2);
		label2.setFont(f);
		label3.setFont(f);
		label4.setFont(f);
		label5.setFont(f);
		label6.setFont(f);
		label7.setFont(f);
		label8.setFont(f);
		label9.setFont(f);
		label10.setFont(f);
		label11.setFont(f);
		
		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		frame.add(label4);
		frame.add(label5);
		frame.add(label6);
		frame.add(label7);
		frame.add(label8);
		frame.add(label9);
		frame.add(label10);
		frame.add(label11);
		
		frame.add(text1);
		frame.add(text2);
		frame.add(text3);
		frame.add(text4);
		frame.add(text5);
		frame.add(text6);
		frame.add(text7);
		frame.add(text8);
		frame.add(text9);
		frame.add(text10);
		frame.add(text11);
		
		frame.add(convertbutton);
		frame.add(aboutbutton);
		frame.add(clearbutton);
		frame.add(exitbutton);
		
		frame.show();
		
		
	}
	public void actionPerformed(ActionEvent e){
		
		if(aboutbutton==e.getSource())
			JOptionPane.showMessageDialog(null,"Name: Faizan hussain \nEmail: abc@xyz.com \nContcat No: 03144124925");
		
		if(exitbutton==e.getSource())
			System.exit(0);
		
		if(clearbutton==e.getSource()){
			text1.setText("");
			text2.setText("");
			text3.setText("");
			text4.setText("");
			text5.setText("");
			text6.setText("");
			text7.setText("");
			text8.setText("");
			text9.setText("");
			text10.setText("");
			text11.setText("");
		}
		if(convertbutton==e.getSource()){
			int a=Integer.parseInt(text1.getText());
			
			int fivethousand=a/5000;
			a = a%5000;
			int thousand=a/1000;
			a = a%1000;
			int fivehundred=a/500;
			a = a%500;
			int hundred=a/100;
			a = a%100;
			int fifty=a/50;
			a = a%50;
			int twoty=a/20;
			a = a%20;
			int ten=a/10;
			a = a%10;
			int five=a/5;
			a = a%5;
			int two=a/2;
			a = a%2;
			int one=a/1;
			a = a%1;
			
			text2.setText(""+fivethousand);
			text3.setText(""+thousand);
			text4.setText(""+fivehundred);
			text5.setText(""+hundred);
			text6.setText(""+fifty);
			text7.setText(""+twoty);
			text8.setText(""+ten);
			text9.setText(""+five);
			text10.setText(""+two);
			text11.setText(""+one);
		
		
		
		}
		
		
	}
	
	public static void main(String arg[]){
		
		TestFrameAtm as=new TestFrameAtm();
		
	}
}
	
	