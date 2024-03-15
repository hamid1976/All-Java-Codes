import javax.swing.*;

class hussain2{

         public static void main(String arg[]){
		 
		     String s1= JOptionPane.showInputDialog("Enter value?");
			 String s2= JOptionPane.showInputDialog("Enter 2nd value?");
			 
			 int a=Integer.parseInt (s1);
			 int b=Integer.parseInt (s2);
			 
			 JOptionPane.showMessageDialog(null,"Addition is: "+(a+b));
			 JOptionPane.showMessageDialog(null,"subraction is: "+(a-b));
			 JOptionPane.showMessageDialog(null,"mutiplication is: "+(a*b));
			 JOptionPane.showMessageDialog(null,"Division is: "+(a/b));
			 JOptionPane.showMessageDialog(null,"Remainder is: "+(a%b) );
			 
			 
			 
		}
	}	