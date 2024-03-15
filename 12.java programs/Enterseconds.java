import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class Enterseconds implements ActionListener{
	
	
	Frame frame=new Frame();

	Label label1=new Label("Enter Seconds ?");
	Label label2=new Label("Hours");
	Label label3=new Label("Minutes");
	Label label4=new Label("Seconds");
	
	TextField text1=new TextField();
	TextField text2=new TextField();
	TextField text3=new TextField();
	TextField text4=new TextField();
	
	Button convertbutton=new Button("Convert");
	Button aboutbutton=new Button("About");
	Button clearbutton=new Button("Clear");
	Button exitbutton=new Button("Exit");
	
	Font f=new Font("arial",Font.PLAIN,15);
	
	
	Enterseconds(){
		
		frame.setLayout(null);
		frame.setBounds(300,200,360,250);
		
		label1.setBounds(20,40,90,30);
		label2.setBounds(20,80,80,30);
		label3.setBounds(20,120,80,30);
		label4.setBounds(20,160,80,30);
		
		text1.setBounds(130,40,100,30);
		text2.setBounds(130,80,100,30);
		text3.setBounds(130,120,100,30);
		text4.setBounds(130,160,100,30);
		
		convertbutton.setBounds(240,40,100,30);
		aboutbutton.setBounds(20,200,100,30);
		clearbutton.setBounds(130,200,100,30);
		exitbutton.setBounds(240,200,100,30);
		
		
		
		label1.setFont(f);
		label2.setFont(f);
		label3.setFont(f);
		label4.setFont(f);
		
		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		frame.add(label4);
		
		frame.add(text1);
		frame.add(text2);
		frame.add(text3);
		frame.add(text4);
		
		
		frame.add(convertbutton);
		frame.add(aboutbutton);
		frame.add(clearbutton);
		frame.add(exitbutton);
		
		convertbutton.addActionListener(this);
		aboutbutton.addActionListener(this);
		clearbutton.addActionListener(this);
		exitbutton.addActionListener(this);
		
		frame.show();
		
	}
	
	public void actionPerformed(ActionEvent e){
		
		if(aboutbutton==e.getSource()){
			JOptionPane.showMessageDialog(null,"CottEng: abc\nOrganization: xyz\nEmail: abc@xyz20com\nContact: 03144124925");
		}
		
		if(clearbutton==e.getSource()){
			text2.setText("");
			text3.setText("");
			text4.setText("");
		}
		
		if(exitbutton==e.getSource()){
			System.exit(0);
		}
		
		if(convertbutton==e.getSource()){
		int a=Integer.parseInt(text1.getText());
        int hours=a/3600;
        int minutes=a/60;
        int seconds=a/1;

         text2.setText(""+(hours));		
         text3.setText(""+(minutes));		
         text4.setText(""+(seconds));		
		}
		
	}
	
	public static void main(String arg[]){
		
		Enterseconds as=new Enterseconds();
            	
	}
}