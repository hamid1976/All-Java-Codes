import java.awt.*;
class Calculator{
	public static void main(String arg[]){
		Frame win=new Frame();
		
		Label Calculator=new Label("      Calculator");
		
		TextField t1=new TextField();
		
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
		Button b13=new Button("X");
		Button b14=new Button("/");
		Button b15=new Button("%");
		Button b16=new Button("=");
		Button b17=new Button("AC");
		
		Calculator.setSize(100,40);
		Calculator.setLocation(150,40);
		
		t1.setSize(300,40);
		t1.setLocation(50,100);
		
		b1.setSize(60,60);
		b1.setLocation(50,160);
		
		b2.setSize(60,60);
		b2.setLocation(130,160);
		
		b3.setSize(60,60);
		b3.setLocation(210,160);
		
		b4.setSize(60,60);
		b4.setLocation(290,160);
		
		b5.setSize(60,60);
		b5.setLocation(50,240);
		
		b6.setSize(60,60);
		b6.setLocation(130,240);
		
		b7.setSize(60,60);
		b7.setLocation(210,240);
		
		b8.setSize(60,60);
		b8.setLocation(290,240);
		
		b9.setSize(60,60);
		b9.setLocation(50,320);
		
		b10.setSize(60,60);
		b10.setLocation(130,320);
		
		b11.setSize(60,60);
		b11.setLocation(210,320);
		
		b12.setSize(60,60);
		b12.setLocation(290,320);
		
		b13.setSize(60,60);
		b13.setLocation(50,400);
		
		b14.setSize(60,60);
		b14.setLocation(130,400);
		
		b15.setSize(60,60);
		b15.setLocation(210,400);
		
		b16.setSize(60,60);
		b16.setLocation(290,400);
		
		b17.setSize(60,60);
		b17.setLocation(50,480);
		
		Calculator.setBackground(Color.pink);
		
		t1.setBackground(Color.white);
		b1.setBackground(Color.orange);
		b2.setBackground(Color.orange);
		b3.setBackground(Color.orange);
		b4.setBackground(Color.orange);
		b5.setBackground(Color.orange);
		b6.setBackground(Color.orange);
		b7.setBackground(Color.orange);
		b8.setBackground(Color.orange);
		b9.setBackground(Color.orange);
		
		b10.setBackground(Color.green);
		b11.setBackground(Color.green);
		b12.setBackground(Color.green);
		b13.setBackground(Color.green);
		b14.setBackground(Color.green);
		b15.setBackground(Color.green);
		b16.setBackground(Color.green);
		b17.setBackground(Color.red);
		
		win.add(Calculator);
		win.add(t1);
		win.add(b1);
		win.add(b2);
		win.add(b3);
		win.add(b4);
		win.add(b5);
		win.add(b6);
		win.add(b7);
		win.add(b8);
		win.add(b9);
		win.add(b10);
		win.add(b11);
		win.add(b12);
		win.add(b13);
		win.add(b14);
		win.add(b15);
		win.add(b16);
		win.add(b17);
		
		win.setSize(400,600);
		win.setLayout(null);
		win.show();
		
	}
}