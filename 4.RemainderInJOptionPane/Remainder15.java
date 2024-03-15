import javax.swing.*;
class Remainder15{
    public static void main(String arg[]){
	   String a=JOptionPane.showInputDialog("Enter weeks");
	   int weeks=Integer.parseInt(a);
	   int month=weeks/4;
	   int remweeks=weeks%4;
	   JOptionPane.showMessageDialog(null,"month is="+(month) + "\n rem weeks="+(remweeks));
	}
}