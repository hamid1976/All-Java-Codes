import javax.swing.*;
class Remainder6{
    public static void main(String arg[]){
	   String a=JOptionPane.showInputDialog("Enter minutes");
	   int minutes=Integer.parseInt(a);
	   int days=minutes/1440;
	   int remminutes=minutes%1440;
	   JOptionPane.showMessageDialog(null,"days ="+(days) + "\n rem minutes="+(remminutes));
	}
}