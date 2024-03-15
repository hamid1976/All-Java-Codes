import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Frame_Calculator2 implements ActionListener {
	Frame win =new Frame ("Calculator ");
	String value1;
	String op;
	
	    Label l1=new Label("Calculator");
	
	    Button oneButton=new Button("1");
		Button twoButton=new Button("2");
		Button threeButton=new Button("3");
		Button fourButton=new Button("4");
		Button fiveButton=new Button("5");
		Button sixButton=new Button("6");
		Button sevenButton=new Button("7");
		Button eightButton=new Button("8");
		Button nineButton=new Button("9");
		Button zeroButton=new Button("0");
		Button addButton=new Button("+");
		Button subButton=new Button("-");
		Button mulButton=new Button("*");
		Button divButton=new Button("/");
		Button remButton=new Button("%");
		Button equalsButton=new Button("=");
		Button clearButton=new Button("AC");
		Button exitButton=new Button("Exit");
		
		
		TextField text=new TextField();
		
	Frame_Calculator2(){
		
		
		win.setBounds(  100,20,500,350    );
		win.setLayout(null);
		
		l1.setBounds(150,40,200,40);
		
		oneButton.setBounds(30,140,100,30);
		twoButton.setBounds(140,140,100,30);
		threeButton.setBounds(250,140,100,30);
		fourButton.setBounds(360,140,100,30);
		fiveButton.setBounds(30,180,100,30);
		sixButton.setBounds(140,180,100,30);
		sevenButton.setBounds(250,180,100,30);
		eightButton.setBounds(360,180,100,30);
		nineButton.setBounds(30,220,100,30);
		zeroButton.setBounds(140,220,100,30);
		addButton.setBounds(250,220,100,30);
		subButton.setBounds(360,220,100,30);
		mulButton.setBounds(30,260,100,30);
		divButton.setBounds(140,260,100,30);
		remButton.setBounds(250,260,100,30);
		equalsButton.setBounds(360,260,100,30);
		clearButton.setBounds(30,300,100,30);
		exitButton.setBounds(140,300,100,30);
		
		oneButton.addActionListener(this);
		twoButton.addActionListener(this);
		threeButton.addActionListener(this);
		fourButton.addActionListener(this);
		fiveButton.addActionListener(this);
		sixButton.addActionListener(this);
		sevenButton.addActionListener(this);
		eightButton.addActionListener(this);
		nineButton.addActionListener(this);
		zeroButton.addActionListener(this);
		addButton.addActionListener(this);
		subButton.addActionListener(this);
		mulButton.addActionListener(this);
		divButton.addActionListener(this);
		remButton.addActionListener(this);
		equalsButton.addActionListener(this);
		clearButton.addActionListener(this);
		exitButton.addActionListener(this);
		
		text.setBounds(30,100,430,30);
		
		Font f=new Font("Calculator",Font.ITALIC,35);
		l1.setFont(f);
		
		win.add(oneButton);
		win.add(twoButton);
	    win.add(threeButton);
	    win.add(fourButton);
	    win.add(fiveButton);
		win.add(sixButton);
	    win.add(sevenButton);
	    win.add(eightButton);
	    win.add(nineButton);
		win.add(zeroButton);
	    win.add(addButton);
	    win.add(subButton);
		win.add(mulButton);
		win.add(divButton);
	    win.add(remButton);
	    win.add(equalsButton);
		win.add(clearButton);
		win.add(exitButton);
		
		win.add(text);
		
		win.add(l1);
		
		win.show();
		
			
	}
	
	public void actionPerformed(ActionEvent z){
		
		
		if(oneButton==z.getSource()){
			String s=text.getText();
			text.setText(s+"1");
			}
		if(twoButton==z.getSource()){
			String s=text.getText();
			text.setText(s+"2");
			}
		if(threeButton==z.getSource()){
			String s=text.getText();
			text.setText(s+"3");
			}
		if(fourButton==z.getSource()){
			String s=text.getText();
			text.setText(s+"4");
			}
		if(fiveButton==z.getSource()){
			String s=text.getText();
			text.setText(s+"5");
			}
		if(sixButton==z.getSource()){
			String s=text.getText();
			text.setText(s+"6");
			}
		if(sevenButton==z.getSource()){
			String s=text.getText();
			text.setText(s+"7");
			}
		if(eightButton==z.getSource()){
			String s=text.getText();
			text.setText(s+"8");
			}
		if(nineButton==z.getSource()){
			String s=text.getText();
			text.setText(s+"9");
			}
		if(zeroButton==z.getSource()){
			String s=text.getText();
			text.setText(s+"0");
			}
		if(addButton==z.getSource()){
			value1=text.getText();
			text.setText("");
			op="+";
		}
		if(subButton==z.getSource()){
			value1=text.getText();
			text.setText("");
			op="-";
		}
		if(mulButton==z.getSource()){
			value1=text.getText();
			text.setText("");
			op="*";
		}
		if(divButton==z.getSource()){
			value1=text.getText();
			text.setText("");
			op="/";
		}
		if(remButton==z.getSource()){
			value1=text.getText();
			text.setText("");
			op="%";
		}
		if(equalsButton==z.getSource()){
			int a=Integer.parseInt(value1);
			int b=Integer.parseInt(text.getText());
		if(op.equals("+"))text.setText(""+(a+b));
		if(op.equals("-"))text.setText(""+(a-b));
		if(op.equals("*"))text.setText(""+(a*b));
		if(op.equals("/"))text.setText(""+(a/b));
		if(op.equals("%"))text.setText(""+(a%b));
		}
		
		
		if(clearButton==z.getSource()){
            text.setText("");
		}
		if(exitButton==z.getSource())
			System.exit(0);
		}//end actionPerformed
		public static void main(String arg[]){
 Frame_Calculator2 ob=new 	Frame_Calculator2();
}
}		