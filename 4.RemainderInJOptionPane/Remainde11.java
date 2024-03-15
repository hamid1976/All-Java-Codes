import javax.swing.*;
class Remainde11{
    public static void main(String arg[]){
	   String a=JOptionPane.showInputDialog("Enter rupees");
	   int rupees=Integer.parseInt(a);
	   int euro=rupees/196;
	   int remrupees=rupees%196;
	   JOptionPane.showMessageDialog(null,"euro is="+(euro) + "\n rem rupees="+(remrupees));
	}
}