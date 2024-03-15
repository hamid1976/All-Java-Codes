import javax.swing.*;

class Dialog{

	    public static void main(String arg[]){
		
		
		     String name = JOptionPane.showInputDialog("Enter name?");
			 
			 String subject = JOptionPane.showInputDialog("Enter Subject? ");
		     String rollno = JOptionPane.showInputDialog("Enter Roll No? ");
			 
			 //String name = "faizan";
			// String subject = "Java";
			 //String Roll no = "2k18-cse-40";
			 
			 
			 JOptionPane.showMessageDialog(null,"Name: "+name+"\nSubject:"+subject+"\nRoll no:"+rollno);
			 
			 
		}	 }