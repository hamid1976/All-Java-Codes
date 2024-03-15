import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class Employeeslistener  implements ActionListener{
	
	Label label1=new Label("Employees Salary Calculate");
	Label label2=new Label("Enter Employees basic Salary");
	Label label3=new Label("House Rent 45%");
	Label label4=new Label("Medical allowance 15%");
	Label label5=new Label("Bonns 5%");
	Label label6=new Label("Gross Pay");
	Label label7=new Label("Income Tax 3%");
	Label label8=new Label("Zukawat 2.5%");
	Label label9=new Label("Convace Akkaiwabce 8%");
	Label label10=new Label("Total Income");
	
	TextField text1=new TextField();
	TextField text2=new TextField();
	TextField text3=new TextField();
	TextField text4=new TextField();
	TextField text5=new TextField();
	TextField text6=new TextField();
	TextField text7=new TextField();
	TextField text8=new TextField();
	TextField text9=new TextField();
	
	Button calculatebutton=new Button("Calculate");
	Button clearbutton=new Button("Clear");
	Button exitbutton=new Button("Exit");
	Button aboutbutton=new Button("About");
	
	Font f=new Font("arial",Font.PLAIN,18);
	Font f2=new Font("arial",Font.PLAIN,15);
	
	Frame frame=new Frame();
	
	Employeeslistener(){
		

		frame.setLayout(null);
		frame.setBounds(300,50,350,770);
		
		label1.setBounds(50,20,250,50);
		label2.setBounds(20,70,180,50);
		label3.setBounds(20,150,180,50);
		label4.setBounds(20,220,180,50);
		label5.setBounds(20,290,180,50);
		label6.setBounds(20,360,180,50);
		label7.setBounds(20,430,180,50);
		label8.setBounds(20,500,180,50);
		label9.setBounds(20,570,180,50);
		label10.setBounds(20,640,180,50);
		
		text1.setBounds(210,80,120,30);
		text2.setBounds(210,160,120,30);
		text3.setBounds(210,230,120,30);
		text4.setBounds(210,300,120,30);
		text5.setBounds(210,370,120,30);
		text6.setBounds(210,440,120,30);
		text7.setBounds(210,510,120,30);
		text8.setBounds(210,580,120,30);
		text9.setBounds(210,640,120,30);
		
		calculatebutton.setBounds(20,120,80,30);
		clearbutton.setBounds(20,700,50,30);
		exitbutton.setBounds(80,700,50,30);
		aboutbutton.setBounds(140,700,50,30);
		
		label1.setFont(f);
		
		label2.setFont(f2);
		label3.setFont(f2);
		label4.setFont(f2);
		label5.setFont(f2);
		label6.setFont(f2);
		label7.setFont(f2);
		label8.setFont(f2);
		label9.setFont(f2);
		label10.setFont(f2);
		
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
		
		frame.add(text1);
		frame.add(text2);
		frame.add(text3);
		frame.add(text4);
		frame.add(text5);
		frame.add(text6);
		frame.add(text7);
		frame.add(text8);
		frame.add(text9);
		
		frame.add(calculatebutton);
		frame.add(clearbutton);
		frame.add(exitbutton);
		frame.add(aboutbutton);
		
		calculatebutton.addActionListener(this);
		aboutbutton.addActionListener(this);
		exitbutton.addActionListener(this);
		clearbutton.addActionListener(this);
		
		frame.show();
		
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(exitbutton==e.getSource()){
			System.exit(0);
		}
		if(aboutbutton==e.getSource()){
		JOptionPane.showMessageDialog(null,"CottEng: abc\nOrganization: xyz\nEmail: abc@xyz290com\nContact: 03144124925");
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
			int house=a*45/100;
			int medical=a*15/100;
			int bonns=a*5/100;
			int gross=house+medical+bonns;
			int incometax=a*3/100;
			double zukawat=a*2.5/100;
			int convace=a*8/100;
			double totalincome=gross-(incometax+zukawat+convace);
			
			text2.setText(""+(house));
			text3.setText(""+(medical));
			text4.setText(""+(bonns));
			text5.setText(""+(gross));
			text6.setText(""+(incometax));
			text7.setText(""+(zukawat));
			text8.setText(""+(convace));
			text9.setText(""+(totalincome));
		}
			
	}
	
	public static void main(String arg[]){
		Employeeslistener as=new Employeeslistener();
		
	}
}