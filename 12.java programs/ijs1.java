import javax.swing.*;

class ijs1{

         public static void main(String arg[]){
		 
		 
		     String s1= JOptionPane.showInputDialog("Enter value");
			 String s2= JOptionPane.showInputDialog("Enter 2nd value");
			 
			 int a= Integer.parseInt(s1);
			 int b= Integer.parseInt(s2);
			 
			 
			 JOptionPane.showMessageDialog(null,"subtrcation is: "+(a-b));
			 
			 
		 }
    }