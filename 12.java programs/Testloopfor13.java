import javax.swing.*;

class Testloopfor13{
	
	public static void main(String arg[]){
		
		String s1=JOptionPane.showInputDialog("Enter Table No ");
		
		String s2=JOptionPane.showInputDialog("Enter Counter No ");
		
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		
		String str="";
	
		
		for(int i=1; i<=b; i++){
			
			str+=a+"X"+""+i+"="+i*a+"\n";
			
		
			
			
		}
		
		JOptionPane.showMessageDialog(null,str);
		
	}
}
		