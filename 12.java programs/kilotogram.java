import javax.swing.*;

class kilotogram{
	
	     public static void main(String arg[]){
		 
		 
		     String s1= JOptionPane.showInputDialog("Enter kilo? ");
			 
			 
			 int kilo=Integer.parseInt(s1);
			 int grams=kilo*1000;
			 
			 JOptionPane.showMessageDialog(null,"Grams will be: "+grams);
			 
			 
		 }
    }	 