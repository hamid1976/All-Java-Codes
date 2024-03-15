import javax.swing.*;
class Remainder2{
    public static void main(String arg[]){
	   String a=JOptionPane.showInputDialog("Enter inches");
	   int inch=Integer.parseInt(a);
	   int feet=inch/12;
	   int reminch=inch%12;
	   JOptionPane.showMessageDialog(null,"feet ="+(feet) + "\n rem inchs="+(reminch));
	}
}