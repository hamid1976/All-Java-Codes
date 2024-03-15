import javax.swing.*;
class Remainder1{
    public static void main(String arg[]){
		
	   String a=JOptionPane.showInputDialog("Enter gram");
	   int gram=Integer.parseInt(a);
	   
	   int kilo=gram/1000;
	   int remgram=gram % 1000;
	   
	   JOptionPane.showMessageDialog(null,"kilo is="+(kilo) + "\n rem grams="+(remgram));
	}
}
