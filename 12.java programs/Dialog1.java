import javax.swing.*;

class Dialog1{

        public static void main(String arg[]){
		
		
		     String name= JOptionPane.showInputDialog("Enter name?");
			 
			 String subject= JOptionPane.showInputDialog("Enter Subject?");

             String rollno= JOptionPane.showInputDialog("Enter Roll no?");


             JOptionPane.showMessageDialog(null,"name:"+name+"\nsubject:"+subject+"\nroll no:"+rollno );
			 
			 
			 
			 
		}	 }