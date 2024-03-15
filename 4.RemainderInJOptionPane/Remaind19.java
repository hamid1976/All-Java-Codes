import javax.swing.*;
class Remaind19{
    public static void main(String arg[]){
	   String a=JOptionPane.showInputDialog("Enter days");
	   int days=Integer.parseInt(a);
	   int month=days/30;
	   int bachyaldiha=days%30;
	   int week=bachyaldiha/7;
	   int bachyaldihan=bachyaldiha%7;
	   
	   JOptionPane.showMessageDialog(null,"month ="+(month)+"\n week="+(week)+"\n bachyaldiha="+(bachyaldiha));
	}
}
