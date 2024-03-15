import javax.swing.*;

class Test{
	
	public static void main(String arg[]){
		
		String name=JOptionPane.showInputDialog("Enter the Name ?");
		String subject=JOptionPane.showInputDialog("Enter your Subject ?");
		String rollno=JOptionPane.showInputDialog("Enter Roll Number ? ");
		
		JOptionPane.showMessageDialog(null,"Name: "+name+"\nSubject: "+subject+"\nRoll Number: "+rollno);
	}

}