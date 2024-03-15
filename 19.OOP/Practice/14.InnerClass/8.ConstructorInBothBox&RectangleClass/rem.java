import javax.*;
class rem{
	public static void main (String arg[]){
	String a=JOptionPane.showInputDialog("Enter days:");
	int days=Integer.parseInt(a);
	int year=days/365;
	int rem=days%365;
	int month=days/30;
	int rem=days%30
	int week=days/7;
	int rem=days%7;
	JOptionPane.MessageDialog(null,"year="+year+"month="+month+"week="+week+\n "remaining days=" +rem);
	}
}