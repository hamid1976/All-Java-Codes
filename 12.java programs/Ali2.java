import java.awt.*;

class Ali2{
	
	public static void main(String arg[]){
		Frame f=new Frame ();
		
		f.setLayout(null);
		f.setBounds(300,100,400,750);
		
		Button b1=new Button("Red");
		b1.setBounds(30,50,200,50);
		b1.setBackground(Color.red);
		
		Button b2=new Button("Green");
		b2.setBounds(30,120,200,50);
		b2.setBackground(Color.green);
		
		Button b3=new Button("Yellow");
		b3.setBounds(30,190,200,50);
		b3.setBackground(Color.yellow);
		
		Button b4=new Button("pink");
		b4.setBounds(30,260,200,50);
		b4.setBackground(Color.pink);
		
		Button b5=new Button("orange");
		b5.setBounds(30,330,200,50);
		b5.setBackground(Color.orange);
		
		Button b6=new Button("black");
		b6.setBounds(30,400,200,50);
		b6.setBackground(Color.black);
		
		Button b7=new Button("White");
		b7.setBounds(30,470,200,50);
		b7.setBackground(Color.white);
		
		Button b8=new Button("blue");
		b8.setBounds(30,540,200,50);
		b8.setBackground(Color.blue);
		
		Button b9=new Button("About");
		b9.setBounds(30,610,200,50);
		b9.setBackground(Color.cyan);
		
		Button b10=new Button("Exit");
		b10.setBounds(30,680,200,50);
		b10.setBackground(Color.red);
		
  		
	
		f.add(b1);
		f.add(b2);
		f.add(b3);
	    f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
	    f.add(b8);
		f.add(b9);
		f.add(b10);
		
		
		
		
		
		
		f.show();
		
	}
}