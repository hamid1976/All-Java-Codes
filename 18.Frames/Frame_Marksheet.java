import java.awt.*;
class Frame_Marksheet{
        public static void main(String arg[]){
			
			Frame f1=new Frame("Marksheet");
			
			Label l1=new Label("Enter Java Marks");
			Label l2=new Label("Enter PHP Marks");
			Label l3=new Label("Enter C++ Marks");
			Label l4=new Label("Enter English Marks");
			Label l5=new Label("Enter Python Marks");
			Label l6=new Label("Obtained Marks");
			Label l7=new Label("Total Marks");
			Label l8=new Label("Percentage");
			Label l9=new Label("Grade");
			
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
			
			
			f1.setBounds(100,10,500,700);
			
			l1.setBounds(50,30,100,30);
			l2.setBounds(50,90,100,30);
			l3.setBounds(50,150,100,30);
			l4.setBounds(50,210,100,30);
			l5.setBounds(50,270,100,30);
			l6.setBounds(50,330,100,30);
			l7.setBounds(50,390,100,30);
			l8.setBounds(50,450,100,30);
			l9.setBounds(50,510,100,30);
			
			t1.setBounds(200,30,100,30);
			t2.setBounds(200,90,100,30);
			t3.setBounds(200,150,100,30);
			t4.setBounds(200,210,100,30);
			t5.setBounds(200,270,100,30);
			t6.setBounds(200,330,100,30);
			t7.setBounds(200,390,100,30);
			t8.setBounds(200,450,100,30);
			t9.setBounds(200,510,100,30);
			
			b1.setBounds(50,300,70,30);
			b2.setBounds(20,580,70,30);
			b3.setBounds(200,580,70,30);
			b4.setBounds(400,580,70,30);
			
			f1.add(l1);
			f1.add(l2);
			f1.add(l3);
			f1.add(l4);
			f1.add(l5);
			f1.add(l6);
			f1.add(l7);
			f1.add(l8);
			f1.add(l9);
			
			f1.add(t1);
			f1.add(t2);
			f1.add(t3);
			f1.add(t4);
			f1.add(t5);
			f1.add(t6);
			f1.add(t7);
			f1.add(t8);
			f1.add(t9);
			
			f1.add(b1);
			f1.add(b2);
			f1.add(b3);
			f1.add(b4);
			
			
			
			f1.setLayout(null);
			f1.show();
			
		}
		
}
			