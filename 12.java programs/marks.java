import javax.swing.*;

class marks{
	
	public static void main(String arg[]){
		
		String s1= JOptionPane.showInputDialog("Enter Java Marks ?");
		String s2= JOptionPane.showInputDialog("Enter C++ Marks ?");
		String s3= JOptionPane.showInputDialog("Enter Oracle Marks?");
		String s4= JOptionPane.showInputDialog("Enter VB Marks?");
		String s5= JOptionPane.showInputDialog("Enter C marks?");
		
		int java=Integer.parseInt(s1);
		int cpp=Integer.parseInt(s2);
		int oracle=Integer.parseInt(s3);
		int vb=Integer.parseInt(s4);
		int c=Integer.parseInt(s5);
			
		
		int ObtainMarks=(java+cpp+oracle+vb+c);
		int percentage=(100*ObtainMarks)/500;
		
		JOptionPane.showMessageDialog(null,"Obtain Marks: "+ObtainMarks+"\nTotal Marks: "+500+"\npercentage: "+percentage);
		
	}
}
		
		