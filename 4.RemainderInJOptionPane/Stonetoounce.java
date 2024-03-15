import javax.swing.*;
class Stonetoounce{
	public static void main(String arg[]){
	String a=JOptionPane.showInputDialog("Enter Stone");
	int Stone=Integer.parseInt(a);
	int ounce=Stone*224;
	JOptionPane.showMessageDialog(null,"ounce="+ounce);
	}
}