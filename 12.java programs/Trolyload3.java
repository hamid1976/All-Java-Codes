import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class Trolyload3 implements ActionListener{
	
	Label label1=new Label("Troly load");
	Label label2=new Label("Enter Troly load");
	Label label3=new Label("Total Income");
	Label label4=new Label("Drive%");
	Label label5=new Label("Tax 10%");
	Label label6=new Label("Disel");
	Label label7=new Label("profit");
	
	TextField text1=new TextField();
	TextField text2=new TextField();
	TextField text3=new TextField();
	TextField text4=new TextField();
	TextField text5=new TextField();
	TextField text6=new TextField();
	
	Button calculatebutton=new Button("Calculate");
	Button clearbutton=new Button("Clear");
	Button exitbutton=new Button("Exit");
	Button aboutbutton=new Button("About");
	
	Font f=new Font("arial",Font.PLAIN,18);
	Font f2=new Font("arial",Font.PLAIN,15);
	
	Frame frame=new Frame();
	
	Trolyload3(){
		
		frame.setLayout(null);
		frame.setBounds(300,50,400,550);
		
		label1.setBounds(160,20,110,50);
		label2.setBounds(20,70,110,50);
		label3.setBounds(20,140,110,50);
		label4.setBounds(20,210,110,50);
		label5.setBounds(20,280,110,50);
		label6.setBounds(20,350,110,50);
		label7.setBounds(20,420,110,50);
		
		
		text1.setBounds(150,80,120,30);
		text2.setBounds(150,150,120,30);
		text3.setBounds(150,220,120,30);
		text4.setBounds(150,290,120,30);
		text5.setBounds(150,360,120,30);
		text6.setBounds(150,430,120,30);
		
		calculatebutton.setBounds(300,80,80,30);
		clearbutton.setBounds(20,480,80,30);
		exitbutton.setBounds(110,480,80,30);
		aboutbutton.setBounds(200,480,80,30);
		
		label1.setFont(f);
		label2.setFont(f2);
		label3.setFont(f2);
		label4.setFont(f2);
		label5.setFont(f2);
		label6.setFont(f2);
		label7.setFont(f2);
		
		
		
		
		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		frame.add(label4);
		frame.add(label5);
		frame.add(label6);
		frame.add(label7);
		
		
		frame.add(text1);
		frame.add(text2);
		frame.add(text3);
		frame.add(text4);
		frame.add(text5);
		frame.add(text6);
		
		
		frame.add(calculatebutton);
		frame.add(clearbutton);
		frame.add(exitbutton);
		frame.add(aboutbutton);
		
		
		
		calculatebutton.addActionListener(this);
		clearbutton.addActionListener(this);
		exitbutton.addActionListener(this);
		aboutbutton.addActionListener(this);
		
		frame.show();
	}
	
	public void actionPerformed(ActionEvent e){
		
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
		}
		if(exitbutton==e.getSource()){
			System.exit(0);
		}

		
		if(calculatebutton==e.getSource()){
			int a=Integer.parseInt(text1.getText());
			int Totalincome=a*800;
			int Driver=a*150;
			int Tax=Totalincome*10/100;
			int Disel=a*210;
			int Profit=Totalincome-(Driver+Tax+Disel);
			
			text2.setText(""+(Totalincome));
			text3.setText(""+(Driver));
			text4.setText(""+(Tax));
			text5.setText(""+(Disel));
			text6.setText(""+(Profit));
		}
		
	}
	
	public static void main(String arg[]){
		
		Trolyload3 as=new Trolyload3();
		
	}
}