import javax.swing.*;
class Remainder7{
    public static void main(String arg[]){
	   String a=JOptionPane.showInputDialog("Enter rupees");
	   int rupees=Integer.parseInt(a);
	   int pound=rupees/217;
	   int remrupees=rupees%217;
	   JOptionPane.showMessageDialog(null,"pound is="+(pound) + "\n rem rupees="+(remrupees));
	}
}