import javax.swing.*;
class Remainder9{
    public static void main(String arg[]){
	   String a=JOptionPane.showInputDialog("Enter yard");
	   int yard=Integer.parseInt(a);
	   int mile=yard/1760;
	   int remyard=yard%1760;
	   JOptionPane.showMessageDialog(null,"mile is="+(mile) + "\n rem yard="+(remyard));
	}
}