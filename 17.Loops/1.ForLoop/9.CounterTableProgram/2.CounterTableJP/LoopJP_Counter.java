import javax.swing.*;
class LoopJP_Counter{
	public static void main(String args[]){
		
		
		String a=JOptionPane.showInputDialog("Enter Table No?");
		int Table=Integer.parseInt(a);
		
		
		String s=JOptionPane.showInputDialog("Enter Counter No?");
		int CounterNo=Integer.parseInt(s);
		
		String j="";
		for(int i=1; i<=CounterNo; i++){
		
		
		j+=Table+"x"+i+"="+(Table*i)+"\n";
		
		}
		JOptionPane.showMessageDialog(null,j+"\n");
		
		
	}
}
		
		