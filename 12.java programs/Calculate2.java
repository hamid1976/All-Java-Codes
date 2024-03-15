import java.awt.*;

class Calculate2{
	
	TextField t=new TextField();
	
	Button b1=new Button("1");
	Button b2=new Button("2");
	Button b3=new Button("3");
	Button b4=new Button("4");
	Button b5=new Button("5");
	Button b6=new Button("6");
	Button b7=new Button("7");
	Button b8=new Button("8");
	Button b9=new Button("9");
	Button b10=new Button("0");
	Button b11=new Button("+");
	Button b12=new Button("-");
	Button b13=new Button("*");
	Button b14=new Button("/");
	Button b15=new Button("%");
	Button b16=new Button("=");
	Button b17=new Button("Clear All");
	
	Frame frame=new Frame();
	
	Calculate2(){
		
		frame.setLayout(null);
		frame.setBounds(300,50,350,310);
		
		t.setBounds(20,40,310,30);
		
		b1.setBounds(20,80,70,30);
		b2.setBounds(100,80,70,30);
		b3.setBounds(180,80,70,30);
		b4.setBounds(260,80,70,30);
		b5.setBounds(20,120,70,30);
		b6.setBounds(100,120,70,30);
		b7.setBounds(180,120,70,30);
		b8.setBounds(260,120,70,30);
		b9.setBounds(20,160,70,30);
		b10.setBounds(100,160,70,30);
		b11.setBounds(180,160,70,30);
		b12.setBounds(260,160,70,30);
		b13.setBounds(20,200,70,30);
		b14.setBounds(100,200,70,30);
		b15.setBounds(180,200,70,30);
		b16.setBounds(260,200,70,30);
		b17.setBounds(20,240,310,50);
		
		
		frame.add(t);
		
		
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		frame.add(b6);
		frame.add(b7);
		frame.add(b8);
		frame.add(b9);
		frame.add(b10);
		frame.add(b11);
		frame.add(b12);
		frame.add(b13);
		frame.add(b14);
		frame.add(b15);
		frame.add(b16);
		frame.add(b17);
		
		
		frame.show();
		
	}
	
	public static void main(String arg[]){
		
		Calculate2 as=new Calculate2();
		
	}
}