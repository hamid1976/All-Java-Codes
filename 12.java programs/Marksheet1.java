import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class Marksheet1 implements ActionListener{
	
	Label label1=new Label("Mark Sheet");
	Label label2=new Label("Enter Jave Marks");
	Label label3=new Label("Enter Oracle Marks");
	Label label4=new Label("Enter VB Marks");
	Label label5=new Label("Enter Php Marks");
	Label label6=new Label("Enter C Marks");
	Label label7=new Label("Obtained Marks");
	Label label8=new Label("Tatol Marks");
	Label label9=new Label("Percentage");
	
	TextField text1=new TextField();
	TextField text2=new TextField();
	TextField text3=new TextField();
	TextField text4=new TextField();
	TextField text5=new TextField();
	TextField text6=new TextField();
	TextField text7=new TextField();
	TextField text8=new TextField();

	
	Button calculatebutton=new Button("Calculate");
	Button exitbutton=new Button("Exit");
	Button aboutbutton=new Button("About");
	Button clearbutton=new Button("Clear");
	
	Frame frame=new Frame();
	
	Font f=new Font("arial",Font.PLAIN,20);
	Font f2=new Font("arial",Font.PLAIN,15);
	
	Marksheet1(){
		
		frame.setLayout(null);
		frame.setBounds(300,50,350,700);
		
		label1.setBounds(120,20,150,50);
		label2.setBounds(20,70,170,50);
		label3.setBounds(20,140,170,50);
		label4.setBounds(20,210,170,50);
		label5.setBounds(20,280,170,50);
		label6.setBounds(20,350,170,50);
		label7.setBounds(20,430,170,50);
		label8.setBounds(20,500,170,50);
		label9.setBounds(20,570,170,50);
		
		text1.setBounds(200,80,120,30);
		text2.setBounds(200,150,120,30);
		text3.setBounds(200,220,120,30);
		text4.setBounds(200,290,120,30);
		text5.setBounds(200,360,120,30);
		text6.setBounds(200,440,120,30);
		text7.setBounds(200,510,120,30);
		text8.setBounds(200,580,120,30);
		
		calculatebutton.setBounds(80,400,150,30);
		exitbutton.setBounds(50,620,50,30);
		aboutbutton.setBounds(110,620,100,30);
		clearbutton.setBounds(220,620,50,30);
		
		
		calculatebutton.addActionListener(this);
		exitbutton.addActionListener(this);
		aboutbutton.addActionListener(this);
		clearbutton.addActionListener(this);
		
		label1.setFont(f);
		
		label2.setFont(f2);
		label3.setFont(f2);
		label4.setFont(f2);
		label5.setFont(f2);
		label6.setFont(f2);
		label7.setFont(f2);
		label8.setFont(f2);
		label9.setFont(f2);
		
		
		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		frame.add(label4);
		frame.add(label5);
		frame.add(label6);
		frame.add(label7);
		frame.add(label8);
		frame.add(label9);
		
		frame.add(text1);
		frame.add(text2);
		frame.add(text3);
		frame.add(text4);
		frame.add(text5);
		frame.add(text6);
		frame.add(text7);
		frame.add(text8);
		
		frame.add(calculatebutton);
		frame.add(exitbutton);
		frame.add(aboutbutton);
		frame.add(clearbutton);
		
		frame.show();
		
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(aboutbutton==e.getSource()){
			JOptionPane.showMessageDialog(null,"CottEng: abc\nOrganization: xyz\nEmail: abc@xyz290com\nContact: 03144124925");
		}
		if(exitbutton==e.getSource()){
			System.exit(0);
		}
		if(clearbutton==e.getSource()){
			text1.setText("");
			text2.setText("");
			text3.setText("");
			text4.setText("");
			text5.setText("");
			text6.setText("");
			text7.setText("");
			text8.setText("");
		}
		if(calculatebutton==e.getSource()){
			int a=Integer.parseInt(text1.getText());
			int b=Integer.parseInt(text2.getText());
			int c=Integer.parseInt(text3.getText());
			int d=Integer.parseInt(text4.getText());
			int f=Integer.parseInt(text5.getText());
			
			int Obtained=a+b+c+d+f;
			int Percentage=100*Obtained/500;
			
			text6.setText(""+(Obtained));
			text7.setText("500");
			text8.setText(""+(Percentage));
		}
		
		
	}
	
	public static void main(String arg[]){
		
		Marksheet1 as=new Marksheet1();
	}
}