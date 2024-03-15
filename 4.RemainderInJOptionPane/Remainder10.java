import javax.swing.*;
class Remainder10{
    public static void main(String arg[]){
	   String a=JOptionPane.showInputDialog("Enter rupees");
	   int rupees=Integer.parseInt(a);
	   int dollar=rupees/160;
	   int remrupees=rupees%160;
	   JOptionPane.showMessageDialog(null,"dollar is="+(dollar) + "\n rem rupees="+(remrupees));
	}
}