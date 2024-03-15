import javax.swing.*;
class Remainder23{
    public static void main(String arg[]){
	   String a=JOptionPane.showInputDialog("Enter millimeters");
	   int millimeters=Integer.parseInt(a);
	   int kilometer=millimeters/1000000;
	   int remmillimeter=millimeters%1000000;
	   int meter=remmillimeter/1000;
	   int remmillimeters=remmillimeter%1000;
	   
	   JOptionPane.showMessageDialog(null,"kilometer ="+(kilometer)+"\n meter="+(meter)+"\n rem millimeters="+(remmillimeters));
	}
}
