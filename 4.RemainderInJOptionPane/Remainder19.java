import javax.swing.*;
class Remainder19{
    public static void main(String arg[]){
	   String a=JOptionPane.showInputDialog("Enter hours");
	   int hours=Integer.parseInt(a);
	   int month=hours/720;
	   int remhour=hours%720;
	   int week=remhour/168;
	   int remhours=remhour%168;
	   
	   JOptionPane.showMessageDialog(null,"month ="+(month)+"\n week="+(week)+"\n rem hours="+(remhours));
	}
}
