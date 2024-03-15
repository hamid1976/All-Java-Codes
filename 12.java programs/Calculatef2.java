import java.awt.*;

class Calculatef2{
	
	TextField t=new TextField();
	
	Button b1=new Button("MC");
	Button b2=new Button("MR");
	Button b3=new Button("MS");
	Button b4=new Button("M+");
	Button b5=new Button("M");
	Button b6=new Button("<-");
	Button b7=new Button("CE");
	Button b8=new Button("C");
	Button b9=new Button("+_");
	Button b10=new Button(":/");
	Button b11=new Button("7");
	Button b12=new Button("8");
	Button b13=new Button("9");
	Button b14=new Button("/");
	Button b15=new Button("%");
	Button b16=new Button("4");
	Button b17=new Button("5");
	Button b18=new Button("6");
	Button b19=new Button("*");
	Button b20=new Button("1/X");
	Button b21=new Button("1");
	Button b22=new Button("2");
	Button b23=new Button("3");
	Button b24=new Button("-");
	Button b25=new Button("=");
	Button b26=new Button("0");
	Button b27=new Button(".");
	Button b28=new Button("+");
	
	Frame frame=new Frame();
	
	Calculatef2(){
		
		frame.setLayout(null);
		frame.setBounds(300,200,280,340);
		
		t.setBounds(20,40,240,40);
		
		b1.setBounds(20,90,40,30);
		b2.setBounds(70,90,40,30);
		b3.setBounds(120,90,40,30);
		b4.setBounds(170,90,40,30);
		b5.setBounds(220,90,40,30);
		b6.setBounds(20,130,40,30);
		b7.setBounds(70,130,40,30);
		b8.setBounds(120,130,40,30);
		b9.setBounds(160,130,40,30);
		b10.setBounds(220,130,40,30);
		b11.setBounds(20,170,40,30);
		b12.setBounds(70,170,40,30);
		b13.setBounds(120,170,40,30);
		b14.setBounds(160,170,40,30);
		b15.setBounds(220,170,40,30);
		b16.setBounds(20,210,40,30);
		b17.setBounds(70,210,40,30);
		b18.setBounds(120,210,40,30);
		b19.setBounds(160,210,40,30);
		b20.setBounds(220,210,40,30);
		b21.setBounds(20,250,40,30);
		b22.setBounds(70,250,40,30);
		b23.setBounds(120,250,40,30);
		b24.setBounds(170,250,40,30);
		b25.setBounds(220,250,40,70);
		b26.setBounds(20,290,80,30);
		b27.setBounds(120,290,40,30);
		b28.setBounds(170,290,40,30);
		
		
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
		frame.add(b18);
		frame.add(b19);
		frame.add(b20);
		frame.add(b21);
		frame.add(b22);
		frame.add(b23);
		frame.add(b24);
		frame.add(b25);
		frame.add(b26);
		frame.add(b27);
		frame.add(b28);
		
		
		frame.show();
		
	}
	
	public static void main(String arg[]){
		
		Calculatef2 as=new Calculatef2();
		
	}
}