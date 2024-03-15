import javax.swing.*;
class Remainder4{
    public static void main(String arg[]){
	   String a=JOptionPane.showInputDialog("Enter seconds");
	   int seconds=Integer.parseInt(a);
	   int minutes=seconds/60;
	   int remseconds=seconds%60;
	   JOptionPane.showMessageDialog(null,"minutes ="+(minutes) + "\n rem seconds="+(remseconds));
	}
}