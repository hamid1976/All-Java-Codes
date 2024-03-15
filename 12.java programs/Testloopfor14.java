import javax.swing.*;

class Testloopfor14{
	
	public static void main(String arg[]){
		
		String s1=JOptionPane.showInputDialog("Enter aany No ");
		
		int a=Integer.parseInt(s1);
		
		
		int str=1;
		for(int i=1; i<=a; i++){
			
			
			str= str*i;
		
		
		
		JOptionPane.showMessageDialog(null,str);
		str= str;
			
		
		}
	//	int c=Integer.parseInt(s2);
	JOptionPane.showMessageDialog(null,str);
		
	}
}