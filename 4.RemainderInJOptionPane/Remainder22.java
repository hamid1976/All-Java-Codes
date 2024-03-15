import javax.swing.*;
class Remainder22{
    public static void main(String arg[]){
	   String a=JOptionPane.showInputDialog("Enter inchs");
	   int inchs=Integer.parseInt(a);
	   int yard=inchs/36;
	   int reminch=inchs%36;
	   int feet=reminch/12;
	   int reminchs=reminch%12;
	   
	   JOptionPane.showMessageDialog(null,"yard ="+(yard)+"\n feet="+(feet)+"\n rem inchs="+(reminchs));
	}
}
