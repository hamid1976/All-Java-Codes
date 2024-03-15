import javax.swing.*;
class Remainder3{
    public static void main(String arg[]){
	   String a=JOptionPane.showInputDialog("Enter days");
	   int days=Integer.parseInt(a);
	   int week=days/7;
	   int remdays=days%7;
	   JOptionPane.showMessageDialog(null,"week ="+(week) + "\n rem days="+(remdays));
	}
}