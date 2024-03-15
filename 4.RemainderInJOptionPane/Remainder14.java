import javax.swing.*;
class Remainder14{
    public static void main(String arg[]){
	   String a=JOptionPane.showInputDialog("Enter days");
	   int days=Integer.parseInt(a);
	   int month=days/30;
	   int remdays=days%30;
	   JOptionPane.showMessageDialog(null,"month is="+(month) + "\n rem days="+(remdays));
	}
}