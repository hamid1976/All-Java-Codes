import java.awt.*;
class Frame_Calculator{
        public static void main(String arg[]){
		
		Frame win=new Frame("Calculator ");
		
		
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
		
		TextField t1=new TextField();
		
		win.setBounds(  100,100,500,300    );
		
		b1.setBounds(30,100,100,30);
		b2.setBounds(140,100,100,30);
		b3.setBounds(250,100,100,30);
		b4.setBounds(360,100,100,30);
		b5.setBounds(30,140,100,30);
		b6.setBounds(140,140,100,30);
		b7.setBounds(250,140,100,30);
		b8.setBounds(360,140,100,30);
		b9.setBounds(30,180,100,30);
		b10.setBounds(140,180,100,30);
		b11.setBounds(250,180,100,30);
		b12.setBounds(360,180,100,30);
		b13.setBounds(30,220,100,30);
		b14.setBounds(140,220,100,30);
		b15.setBounds(250,220,100,30);
		b16.setBounds(360,220,100,30);
		
		
	    t1.setBounds(30,50,430,30);
		
		
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
		
		win.add(t1);
		
	
win.setLayout(null);
			win.show();
			
	}
	
}
		   			 
				