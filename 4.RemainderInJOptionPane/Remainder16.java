import javax.swing.*;
class Remainder16{
    public static void main(String arg[]){
	   String a=JOptionPane.showInputDialog("Enter days");
	   int days=Integer.parseInt(a);
	   int month=days/30;
	   int remday=days%30;
	   int week=remday/7;
	   int remdays=remday%7;
	   
	   JOptionPane.showMessageDialog(null,"month ="+(month)+"\n week="+(week)+"\n rem days="+(remdays));
	}
}