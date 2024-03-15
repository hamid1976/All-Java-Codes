import javax.swing.*;
class Remainder18{
    public static void main(String arg[]){
	   String a=JOptionPane.showInputDialog("Enter milligrams");
	   int milligrams=Integer.parseInt(a);
	   int kilo=milligrams/1000000;
	   int remmilligram=milligrams%1000000;
	   int grams=remmilligram/1000;
	   int remmilligrams=remmilligram%1000;
	   
	   JOptionPane.showMessageDialog(null,"kilo ="+(kilo)+"\n grams="+(grams)+"\n rem milligrams="+(remmilligrams));
	}
}
