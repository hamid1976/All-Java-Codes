import java.awt.event.*;
import java.awt.*;

class Calculate3 implements ActionListener{
	
	TextField text=new TextField();
	
	Button button1=new Button("1");
	Button button2=new Button("2");
	Button button3=new Button("3");
	Button button4=new Button("4");
	Button button5=new Button("5");
	Button button6=new Button("6");
	Button button7=new Button("7");
	Button button8=new Button("8");
	Button button9=new Button("9");
	Button button0=new Button("0");
	Button addbutton=new Button("+");
	Button subbutton=new Button("-");
	Button mulbutton=new Button("*");
	Button divbutton=new Button("/");
	Button rembutton=new Button("%");
	Button equalbutton=new Button("=");
	Button clearbutton=new Button("Clear All");
	
	Frame frame=new Frame("Calculate");
	
	Calculate3(){
		
		frame.setLayout(null);
		frame.setBounds(300,50,350,310);
		
		text.setBounds(20,40,310,30);
		
		button1.setBounds(20,80,70,30);
		button2.setBounds(100,80,70,30);
		button3.setBounds(180,80,70,30);
		button4.setBounds(260,80,70,30);
		button5.setBounds(20,120,70,30);
		button6.setBounds(100,120,70,30);
		button7.setBounds(180,120,70,30);
		button8.setBounds(260,120,70,30);
		button9.setBounds(20,160,70,30);
		button0.setBounds(100,160,70,30);
		addbutton.setBounds(180,160,70,30);
		subbutton.setBounds(260,160,70,30);
		mulbutton.setBounds(20,200,70,30);
		divbutton.setBounds(100,200,70,30);
		rembutton.setBounds(180,200,70,30);
		equalbutton.setBounds(260,200,70,30);
		clearbutton.setBounds(20,240,310,50);
		
		frame.add(text);
		
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(button6);
		frame.add(button7);
		frame.add(button8);
		frame.add(button9);
		frame.add(button0);
		frame.add(addbutton);
		frame.add(subbutton);
		frame.add(mulbutton);
		frame.add(divbutton);
		frame.add(rembutton);
		frame.add(equalbutton);
		frame.add(clearbutton);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button0.addActionListener(this);
		addbutton.addActionListener(this);
		subbutton.addActionListener(this);
		mulbutton.addActionListener(this);
		divbutton.addActionListener(this);
		rembutton.addActionListener(this);
		equalbutton.addActionListener(this);
		clearbutton.addActionListener(this);
		
		frame.show();
		
	}
	
	public void actionPerformed(ActionEvent e){
		

		
		if(clearbutton==e.getSource())
			text.setText("");
		
		if(button1==e.getSource()){
			text.setText(text.getText()+"1");
		}
		
		if(button2==e.getSource()){
			text.setText(text.getText()+"2");
		}
		
		if(button3==e.getSource())
			text.setText(text.getText()+"3");
		
		if(button4==e.getSource())
			text.setText(text.getText()+"4");
		
		if(button5==e.getSource())
			text.setText(text.getText()+"5");
		
		if(button6==e.getSource())
			text.setText(text.getText()+"6");
		
		if(button7==e.getSource())
			text.setText(text.getText()+"7");
		
		if(button8==e.getSource())
			text.setText(text.getText()+"8");
		
		if(button9==e.getSource())
			text.setText(text.getText()+"9");
		
		if(button0==e.getSource())
			text.setText(text.getText()+"0");
		
		if(addbutton==e.getSource()){
			text.setText(text.getText()+"+");
			
		}
		
		if(subbutton==e.getSource())
			text.setText(text.getText()+"-");
		
		if(mulbutton==e.getSource())
			text.setText(text.getText()+"*");
		
		if(divbutton==e.getSource())
			text.setText(text.getText()+"/");
		
		if(rembutton==e.getSource())
			text.setText(text.getText()+"%");
		
		if(equalbutton==e.getSource()){
			text.setText(text.getText());
			Calculation(text.getText());
		}
		
		
		
		
	}
	
	private void Calculation(String data){
		if(data.contains("+")){
			String value = data.replace("+",":").trim();
			
			String temp[] = value.split(":");
			int firstValue = Integer.parseInt(temp[0]);
			int secondValue = Integer.parseInt(temp[1]);
			int thirdValue = Integer.parseInt(temp[2]);
			int cal = (firstValue+secondValue+thirdValue);
			text.setText("");
			text.setText(""+cal);
			System.out.println(cal);
		}
		if(data.contains("-")){
			String value = data.replace("-",":").trim();
			
			String temp[] = value.split(":");
			int firstValue = Integer.parseInt(temp[0]);
			int secondValue = Integer.parseInt(temp[1]);
			int cal = (firstValue-secondValue);
			text.setText("");
			text.setText(""+cal);
			System.out.println(cal);
		}
		if(data.contains("*")){
			String value = data.replace("*",":").trim();
			
			String temp[] = value.split(":");
			int firstValue = Integer.parseInt(temp[0]);
			int secondValue = Integer.parseInt(temp[1]);
			int cal = (firstValue*secondValue);
			text.setText("");
			text.setText(""+cal);
			System.out.println(cal);
		}
		if(data.contains("/")){
			String value = data.replace("/",":").trim();
			
			String temp[] = value.split(":");
			int firstValue = Integer.parseInt(temp[0]);
			int secondValue = Integer.parseInt(temp[1]);
			int cal = (firstValue/secondValue);
			text.setText("");
			text.setText(""+cal);
			System.out.println(cal);
		}
		if(data.contains("%")){
			String value = data.replace("%",":").trim();
			
			String temp[] = value.split(":");
			int firstValue = Integer.parseInt(temp[0]);
			int secondValue = Integer.parseInt(temp[1]);
			int cal = (firstValue%secondValue);
			text.setText("");
			text.setText(""+cal);
			System.out.println(cal);
		}
		
	}
	
	
	public static void main(String arg[]){
		
		Calculate3 as=new Calculate3();
		
	}
}