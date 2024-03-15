import javax.swing.*;

class Remainder24{
    public static void main(String arg[]){
	   String a=JOptionPane.showInputDialog("Enter micrometers");
	   int micrometers=Integer.parseInt(a);
	   int centimeter=micrometers/10000;
	   int remmicrometer=micrometers%10000;
	   int millimeter=remmicrometer/1000;
	   int remmicrometers=remmicrometer%1000;
	   
	   JOptionPane.showMessageDialog(null,"centimeter ="+(centimeter)+"\nmillimeter="+(millimeter)+"\n rem micrometers="+(remmicrometers));
	}
}
