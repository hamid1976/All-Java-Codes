import javax.swing.*;
class Remainder8{
    public static void main(String arg[]){
	   String a=JOptionPane.showInputDialog("Enter meter");
	   int meter=Integer.parseInt(a);
	   int mile=meter/1609;
	   int remmeter=meter%1609;
	   JOptionPane.showMessageDialog(null,"mile is="+(mile) + "\n rem meter="+(remmeter));
	}
}