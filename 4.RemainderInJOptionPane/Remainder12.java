import javax.swing.*;
class Remainder12{
    public static void main(String arg[]){
	   String a=JOptionPane.showInputDialog("Enter rupees");
	   int rupees=Integer.parseInt(a);
	   int singaporedollar=rupees/120;
	   int remrupees=rupees%120;
	   JOptionPane.showMessageDialog(null,"singaporedollar is="+(singaporedollar) + "\n rem rupees="+(remrupees));
	}
}