import javax.swing.*;
class Remainder17{
    public static void main(String arg[]){
	   String a=JOptionPane.showInputDialog("Enter seconds");
	   int seconds=Integer.parseInt(a);
	   int hours=seconds/3600;
	   int remsecond=seconds%3600;
	   int minutes=remsecond/60;
	   int remseconds=remsecond%60;
	   
	   JOptionPane.showMessageDialog(null,"hours ="+(hours)+"\n minutes="+
	   (minutes)+"\n rem seconds="+(remseconds));
	}
}
