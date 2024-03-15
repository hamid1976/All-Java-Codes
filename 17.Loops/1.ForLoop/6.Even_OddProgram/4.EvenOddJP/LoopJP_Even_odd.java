import javax.swing.*;
class LoopJP_Even_odd{
	public static void main(String args[]){
		
		
		String a=JOptionPane.showInputDialog("Enter any no?");
		int anyNo=Integer.parseInt(a);
	    String s="";
		
		
		for(int i=1; i<=anyNo; i++){
			if(i%2==0)
				s+=i+"\n";
				
			if(i%2!=0)
				s+=i+"            ";		
		}
		  JOptionPane.showMessageDialog(null,"Odd    Even\n"+s);
		 
	}
}