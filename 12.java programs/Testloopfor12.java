import javax.swing.*;

class Testloopfor12{
	
	public static void main(String arg[]){
		
		String s1=JOptionPane.showInputDialog("Enter any No");
		
		int a=Integer.parseInt(s1);
		
	
	String str=" ";

	
	
		for(int i=1; i<=a; i++){
			if(i%2==0){
		
			 str+=i+"\n";
			 
			}
			 if(i%2!=0){
				 str+=i+"         ";
			 }
			
					
		}
		
		JOptionPane.showMessageDialog(null,"Odd    Even\n"+str);
		
	}
}