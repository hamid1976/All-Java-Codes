import javax.swing.*;
class LoopJP_Factorial1{
	public static void main(String args[]){
		
		
		String j=JOptionPane.showInputDialog("Enter any No?");
		int anyNo=Integer.parseInt(j);
		
		int i=1;
		for(int a=1; a<=anyNo; a++){
		i=i*a;
		}
		JOptionPane.showMessageDialog(null,i);
		
	}
}