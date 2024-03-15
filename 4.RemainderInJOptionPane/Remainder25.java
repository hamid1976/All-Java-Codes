import javax.swing.*;
class Remainder25{
    public static void main(String arg[]){
	   String a=JOptionPane.showInputDialog("Enter grams");
	   int grams=Integer.parseInt(a);
	   int tonne=grams/1000000;
	   int remgram=grams%1000000;
	   int kilo=remgram/1000;
	   int remgrams=remgram%1000;
	   
	   JOptionPane.showMessageDialog(null,"tonne ="+(tonne)+"\n kilo="+(kilo)+"\n rem grams="+(remgrams));
	}
}

