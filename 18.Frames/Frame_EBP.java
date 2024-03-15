import java.awt.*;
class Frame_EBP{
	public static void main(String arg[]){
		
		Frame win=new Frame("Employee Basic Pay");
		
		    Label l1=new Label("Enter Employee Basicpay  ");
			Label l2=new Label("Houserent 45%");
			Label l3=new Label("Medical Allowance 15%");
			Label l4=new Label("Bonus 5%");
			Label l5=new Label("Grosspay");
			Label l6=new Label("Convence Aloowance 8%");
			Label l7=new Label("Zakwat 2.5%");
			Label l8=new Label("Income Tax 5%");
			Label l9=new Label("Net Income");
			
			
			TextField t1=new TextField();
			TextField t2=new TextField();
			TextField t3=new TextField();
			TextField t4=new TextField();
			TextField t5=new TextField();
			TextField t6=new TextField();
			TextField t7=new TextField();
			TextField t8=new TextField();
			TextField t9=new TextField();
			
			Button b1=new Button("Calculate");
			Button b2=new Button("Aboute");
			Button b3=new Button("Clear");
			Button b4=new Button("Exit");
			
			win.setBounds(50,50,500,600);
			// t1.setBounds(200,40,100,25);
			
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
			
			l7.setBounds(10,320,100,25);
			t7.setBounds(200,320,100,25);
			
			l8.setBounds(10,360,140,25);
			t8.setBounds(200,360,100,25);
			
			l9.setBounds(10,400,100,25);
			t9.setBounds(200,400,100,25);
			
			b1.setBounds(320,50,80,40);
			b2.setBounds(10,500,40,40);
			b3.setBounds(150,500,40,40);
			b4.setBounds(300,500,40,40);
			
			
			win.add(l1);
		    win.add(l2);
			win.add(l3);
			win.add(l4);
		    win.add(l5);
		    win.add(l6);
		    win.add(l7);
			win.add(l8);
			win.add(l9);
			
			win.add(t1);
		    win.add(t2);
			win.add(t3);
			win.add(t4);
		    win.add(t5);
		    win.add(t6);
		    win.add(t7);
			win.add(t8);
			win.add(t9);
             
            win.add(b1);
		    win.add(b2);
			win.add(b3);
			win.add(b4);
			
			win.setLayout(null);
			win.show();
			
	}
	
}
		   			 
			