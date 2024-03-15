import javax.swing.*;
class ali{
	public static void main (String arg[]){
		String a=JOptionPane.showInputDialog("Enter days:");
		int days=Integer.ParseInt(a);
		int year=days/365;
		int rem=%365;
		int month=days/30;
		int rem=days%30;
		int week=days/7; 
		int week=days*7;
		JOptionPane.showMessageDialog(null,"year="+year+"\n"month="+month+\n"week="+week+\n remaining days=+"rem);
	}
}