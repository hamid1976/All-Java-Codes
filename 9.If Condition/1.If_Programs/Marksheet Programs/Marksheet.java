import javax.swing.*;
class Marksheet{
    public static void main(String arg[]){
	   String java=JOptionPane.showInputDialog("Enter The Java Marks");
	   String php=JOptionPane.showInputDialog("Enter The PHP Marks");
	   String science=JOptionPane.showInputDialog("Enter The Science Marks");
	   String history=JOptionPane.showInputDialog("Enter The History Marks");
	   String geography=JOptionPane.showInputDialog("Enter The Geography Marks");
	   int j=Integer.parseInt(java);
	   int p=Integer.parseInt(php);
	   int s=Integer.parseInt(science);
	   int h=Integer.parseInt(history);
	   int g=Integer.parseInt(geography);
	   int TotalMarks=500;
	   int ObtainedMarks=j+p+s+h+g;
	   int percentage=ObtainedMarks*100/TotalMarks;
	   JOptionPane.showMessageDialog(null,"Java Marks is:"+j+"\n PHP Marks is:"+p+"\n Science Marks is:"+s+"\n History Marks is:"+h+"\n Geography Marks is:"+g+"\n Total Marks is:"+TotalMarks+"\n Obtained Marks is:"+ObtainedMarks+"\n Percentage is:"+percentage);
	}
}