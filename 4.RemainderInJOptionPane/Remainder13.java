import javax.swing.*;
class Remainder13{
    public static void main(String arg[]){
	   String a=JOptionPane.showInputDialog("Enter ounce");
	   int ounce=Integer.parseInt(a);
	   int stone=ounce/224;
	   int remounce=ounce%224;
	   JOptionPane.showMessageDialog(null,"stone is="+(stone) + "\n rem ounce="+(remounce));
	}
}