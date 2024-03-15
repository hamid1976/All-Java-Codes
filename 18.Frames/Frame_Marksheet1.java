import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Frame_Marksheet1 implements ActionListener {
	Frame win =new Frame ("Marksheet");
	
	        Label l1=new Label("Enter Java Marks");
			Label l2=new Label("Enter PHP Marks");
			Label l3=new Label("Enter C++ Marks");
			Label l4=new Label("Enter English Marks");
			Label l5=new Label("Enter Python Marks");
			Label l6=new Label("Obtained Marks");
			Label l7=new Label("Total Marks");
			Label l8=new Label("Percentage");
			Label l9=new Label("Grade");
			Label l10=new Label("Marksheet");
			
			TextField t1=new TextField();
			TextField t2=new TextField();
			TextField t3=new TextField();
			TextField t4=new TextField();
			TextField t5=new TextField();
			TextField t6=new TextField();
			TextField t7=new TextField("500");
			TextField t8=new TextField("%");
			TextField t9=new TextField("");
			
			Button b1=new Button("Calculate");
			Button b2=new Button("About");
			Button b3=new Button("Clear");
			Button b4=new Button("Exit");
			
	Frame_Marksheet1(){
		    win.setLayout(null);
			win.setBounds(50,50,380,650);
			
			l1.setBounds(50,90,100,30);
			l2.setBounds(50,130,100,30);
			l3.setBounds(50,170,100,30);
			l4.setBounds(50,210,100,30);
			l5.setBounds(50,250,100,30);
			l6.setBounds(50,340,100,30);
			l7.setBounds(50,390,100,30);
			l8.setBounds(50,440,100,30);
			l9.setBounds(50,490,100,30);
			l10.setBounds(100,20,200,50);
			
			t1.setBounds(200,90,100,30);
			t2.setBounds(200,130,100,30);
			t3.setBounds(200,170,100,30);
			t4.setBounds(200,210,100,30);
			t5.setBounds(200,250,100,30);
			t6.setBounds(200,340,100,30);
			t7.setBounds(200,390,100,30);
			t8.setBounds(200,440,100,30);
			t9.setBounds(200,490,100,30);
			
			Font f=new Font("Marksheet",Font.ITALIC,30);
		    l10.setFont(f);
			
			b1.setBounds(50,300,100,30);
			b2.setBounds(50,550,70,30);
			b3.setBounds(140,550,70,30);
			b4.setBounds(230,550,70,30);
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
			
			win.setLayout(null);
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
		    String s1=t1.getText();
			String s2=t2.getText();
			String s3=t3.getText();
			String s4=t4.getText();
			String s5=t5.getText();
			String s6=t6.getText();
			
			int a=Integer.parseInt(s1);
			int b=Integer.parseInt(s2);
			int c=Integer.parseInt(s3);
			int d=Integer.parseInt(s4);
			int e=Integer.parseInt(s5);
			int f=(a+b+c+d+e);
			int G=f*100/500;
			
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			c=Integer.parseInt(t3.getText());
			d=Integer.parseInt(t4.getText());
			e=Integer.parseInt(t5.getText());
			
			if(calculateButton==h.getSource());
			
			t6.setText(""+(f));
			t8.setText(""+(G)+"%");
			
			if(G>=90 ){
                 	if(G<=100){
	        t9.setText("A1");
			}
			}
			if(G>=80 ){
				if( G<90){
	        t9.setText("A");
			}
			}
			if(G>=70){
				if(G<80){
	        t9.setText("B");
			}
			}
			if(G>=60){
				if(G<70){
	        t9.setText("C");
			}
			}
			if(G>=50){
				if (G<60){
	        t9.setText("D");
			}
			}
			if(G>=40){
				if(G<50){
	        t9.setText("E");
			}
			}
			if( G<40){
	        t9.setText("Fail");}
			
	}
			
			

	

public static void main(String arg[]){
			Frame_Marksheet1 ob=new Frame_Marksheet1();
			
		}
}
			