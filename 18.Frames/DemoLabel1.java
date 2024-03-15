import java.awt.*;
class DemoLabel1{
	public static void main(String arg []){
	Frame d1 = new Frame("Project");
	TextField  t1 = new TextField("hello");
    t1.setBounds(100,200, 200,30);

 Label lebel = new Label("Uzair");
 lebel.setBounds(100,50,30,30);

 Button b1 = new Button("Red");
 Button b2 = new Button("Blue");
 Button b3 = new Button("Green");

 b1.setBounds(100,100,100,25);
 b2.setBounds(190,100,100,25);
 b3.setBounds(280,100,100,25);
 
 
 d1.add(b1);
 d1.add(b2);
 d1.add(b3);
 d1.add(t1);
 d1.add(lebel);
 
d1.setBounds(100,100,500,400);
d1.setLayout(null);
d1.setVisible(true);
 	}
}