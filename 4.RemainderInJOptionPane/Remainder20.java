import javax.swing.*;
class Remainder20{
    public static void main(String arg[]){
	   String a=JOptionPane.showInputDialog("Enter minutes");
	   int minutes=Integer.parseInt(a);
	   int month=minutes/43200;
	   int remminute=minutes%43200;
	   int week=remminute/10080;
	   int remminutes=remminute%10080;
	   
	   JOptionPane.showMessageDialog(null,"month ="+(month)+"\n week="+(week)+"\n rem minutes="+(remminutes));
	}
}
