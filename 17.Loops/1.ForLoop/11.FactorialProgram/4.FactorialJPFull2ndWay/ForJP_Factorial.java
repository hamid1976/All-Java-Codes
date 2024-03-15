import javax.swing.*;
class ForJP_Factorial{
      public static void main(String arg[]){



	String s=JOptionPane.showInputDialog("Enter anyNo:");
	int anyNo=Integer.parseInt(s);
	
	String k="\n1";
	String k2=k+"=1";
	int num =1;
	String k3="";
	
	for(int i=1;  i<anyNo; i++){
		
		num=num*(i+1);
		k+="*"+(i+1);
		k3+=k+"="+num;
	}
		JOptionPane.showMessageDialog(null,k3);
	
	}
}