import javax.swing.*;
class Remainder21{
    public static void main(String arg[]){
	   String a=JOptionPane.showInputDialog("Enter weeks");
	   int weeks=Integer.parseInt(a);
	   int year=weeks/52;
	   int remweek=weeks%52;
	   int month=remweek/4;
	   int remweeks=remweek%4;
	   
	   JOptionPane.showMessageDialog(null,"year ="+(year)+"\n month="+(month)+"\n rem weeks="+(remweeks));
	}
}
