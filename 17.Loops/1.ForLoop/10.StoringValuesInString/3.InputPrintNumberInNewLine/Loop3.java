import javax.swing.*;
class Loop3{
	public static void main(String args[]){
		
		
		String s=JOptionPane.showInputDialog("Enter any no?");
		int a=Integer.parseInt(s);
		
		 
		 String str="";
		 for(int i=0; i<=a; i++){
			 str+=i+"\n"; 
		
		 }		
			 JOptionPane.showMessageDialog(null,str);
		
			
	}
}