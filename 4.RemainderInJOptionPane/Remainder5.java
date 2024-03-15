import javax.swing.*;
class Remainder5{
    public static void main(String arg[]){
	   String a=JOptionPane.showInputDialog("Enter hours");
	   int hours=Integer.parseInt(a);
	   int weeks=hours/168;
	   int remhours=hours%168;
	   JOptionPane.showMessageDialog(null,"weeks ="+(weeks) + "\n rem hours="+(remhours));
	}
}