import javax.swing.*;

class Dialog2{

         public static void main (String arg[]){

             String name= JOptionPane.showInputDialog("Enter your name?");
			 String lastname= JOptionPane.showInputDialog("Enter your last name?");
			 String houseno= JOptionPane.showInputDialog("Enter your house no?");
			 String subject= JOptionPane.showInputDialog("Enter your subject?");
			 String rollno= JOptionPane.showInputDialog("Enter your roll no?");
			 
			 JOptionPane.showMessageDialog(null,"name: "+name+"\nlast name:"+lastname+"\nhouse no:"+houseno+"\nsubject:"+subject+"\nroll no:"+rollno);
			 
			 
			 
			 
		}	 }