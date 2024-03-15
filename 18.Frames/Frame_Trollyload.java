import java.awt.*;
class Frame_Trollyload{
        public static void main(String arg[]){
		
		Frame win=new Frame("Trollyload");
		// w1.setTitle("Trollyload");
		    Label l1=new Label("Enter Trollyload ");
			Label l2=new Label("Total Income ?");
			Label l3=new Label("Driver?");
			Label l4=new Label("Tax 10% ?");
			Label l5=new Label("Diesel?");
			Label l6=new Label("Profit?");
			
			TextField t1=new TextField();
			TextField t2=new TextField();
			TextField t3=new TextField();
			TextField t4=new TextField();
			TextField t5=new TextField();
			TextField t6=new TextField();
			
			Button b1=new Button("Calculate");
			Button b2=new Button("Aboute");
			Button b3=new Button("Clear");
			Button b4=new Button("Exit");
			
			win.setBounds(100,50,500,600);
			
			l1.setBounds(10,40,140,25);
			t1.setBounds(200,40,100,25);
			
			l2.setBounds(10,120,140,25);
			t2.setBounds(200,120,100,25);
			
			l3.setBounds(10,160,140,25);
			t3.setBounds(200,160,100,25);
			
			l4.setBounds(10,200,100,25);
			t4.setBounds(200,200,100,25);
			
			l5.setBounds(10,240,100,25);
			t5.setBounds(200,240,100,25);
			
			l6.setBounds(10,280,100,25);
			t6.setBounds(200,280,100,25);
			
			
			b1.setBounds(320,40,80,25);
			b2.setBounds(10,350,50,25);
			b3.setBounds(150,350,50,25);
			b4.setBounds(300,350,50,25);
			
			// win.setBounds(20 ,30,100,200);
				
			win.add(l1);
		    win.add(l2);
			win.add(l3);
			win.add(l4);
		    win.add(l5);
		    win.add(l6);
			
			win.add(t1);
		    win.add(t2);
			win.add(t3);
			win.add(t4);
		    win.add(t5);
		    win.add(t6);
			
			win.add(b1);
		    win.add(b2);
			win.add(b3);
			win.add(b4);
			
			win.setLayout(null);
			win.show();
			
	}
	
}
		   			 
			