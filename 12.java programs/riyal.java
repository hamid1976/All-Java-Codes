import javax.swing.*;

class riyal{

         public static void main(String arg[]){
		 
		     String s1= JOptionPane.showInputDialog("Enter Riyal?");
			 
			 int riyal=Integer.parseInt(s1);
			 int s2=riyal*55;
			 
			 JOptionPane.showMessageDialog(null,"Rupees will be: "+s2);



         }
    }