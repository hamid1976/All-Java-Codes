import java.awt.*;
class Frame7{
     public static void main(String arg[]){
		 
		 Frame win=new Frame();
		 
		 Button  b1=new Button("Red");
		 Button  b2=new Button("Blue");
		 Button  b3=new Button("Green");
		 Button  b4=new Button("Yellow");
		 Button  b5=new Button("Purple");
		 Button  b6=new Button("Orange");
		 Button  b7=new Button("Brown");
		 Button  b8=new Button("Black");
		 Button  b9=new Button("Skyblue");
		 Button  b10=new Button("Gray");
		 
		 b1.setLocation(100,100);
		 b1.setSize(100,30);
		 
		 b2.setLocation(100,140);
		 b2.setSize(100,30);
		 
		 b3.setLocation(100,190);
		 b3.setSize(100,30);
		 
		 b4.setLocation(100,240);
		 b4.setSize(100,30);
		 
		 b5.setLocation(100,290);
		 b5.setSize(100,30);
		 
		 b6.setLocation(100,340);
		 b6.setSize(100,30);
		 
		 b7.setLocation(100,390);
		 b7.setSize(100,30);

         b8.setLocation(100,440);
         b8.setSize(100,30);
		  
		 b9.setLocation(100,490);
		 b9.setSize(100,30);
		 
		 b10.setLocation(100,540);
		 b10.setSize(100,30);
		 
		
		 
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
		 
		
		 
		 win.setSize(500,700);
		 win.setLayout(null);
		 win.show();
		 
	 }
}