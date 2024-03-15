import javax.swing.*;

class feet{

         public static void main(String arg[]){
   
             String s1= JOptionPane.showInputDialog("Enter feet? ");
			 
			 int feet=Integer.parseInt(s1);
			 int s2=feet*12;
			 
			 JOptionPane.showMessageDialog(null,"Inches will be: "+s2);
     	
		
		 }
    }