import java.awt.*;

class Calculatef{
	
	public static void main(String arg[]){
		
		Frame frame=new Frame("Calcutater");
		
		frame.setLayout(null);
		frame.setBounds(300,50,350,310);
		
		TextField t=new TextField();
		t.setBounds(20,40,310,30);
		
		Button b1=new Button("1");
		b1.setBounds(20,80,70,30);
		
		Button b2=new Button("2");
		b2.setBounds(100,80,70,30);
		
		Button b3=new Button("3");
		b3.setBounds(180,80,70,30);
		
		Button b4=new Button("4");
		b4.setBounds(260,80,70,30);
		
		Button b5=new Button("5");
		b5.setBounds(20,120,70,30);
		
		Button b6=new Button("6");
		b6.setBounds(100,120,70,30);
		
		Button b7=new Button("7");
		b7.setBounds(180,120,70,30);
		
		Button b8=new Button("8");
		b8.setBounds(260,120,70,30);
		
		Button b9=new Button("9");
		b9.setBounds(20,160,70,30);
		
		Button b10=new Button("0");
		b10.setBounds(100,160,70,30);
		
		Button b11=new Button("+");
		b11.setBounds(180,160,70,30);
		
		Button b12=new Button("-");
		b12.setBounds(260,160,70,30);
		
		Button b13=new Button("*");
		b13.setBounds(20,200,70,30);
		
		Button b14=new Button("/");
		b14.setBounds(100,200,70,30);
		
		Button b15=new Button("%");
		b15.setBounds(180,200,70,30);
		
		Button b16=new Button("=");
		b16.setBounds(260,200,70,30);
		
		Button b17=new Button("Clear all");
		b17.setBounds(20,240,310,50);
		
	
		
	   
		
		
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
		
		frame.add(t);
		frame.show();
	}
}
		