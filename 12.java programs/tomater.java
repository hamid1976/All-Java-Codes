import javax.swing.*;

class tomater{

         public static void main(String arg[]){
		 
		 
		     String s1= JOptionPane.showInputDialog("Kilo tomater");
			 String s2= JOptionPane.showInputDialog("feet");
			 String s3= JOptionPane.showInputDialog("Enter  Kilo");
			 
			 int tomater=Integer.parseInt(s1);
			 int s4=tomater*50;
			 
			 int feet=Integer.parseInt(s2);
			 int s5=feet*12;
			 
			 int kilo=Integer.parseInt(s3);
			 int s6=kilo*1000;
			 
			 JOptionPane.showMessageDialog(null,"Kilo tomater: "+s4+"\nfeet: "+s5+"\nEntern kilo: "+s6);
			 
		 }
     }