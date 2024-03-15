import javax.swing.*;
class LoopJP_Factorial2{
	public static void main(String args[]){
		
		
		String a=JOptionPane.showInputDialog("Enter any No?");
		int anyNo=Integer.parseInt(a);
		
		String k="\n1";
		String k2=k+"=1";
		anyNo=anyNo-1;
		int num=1;
		String k3="";
		for(int i=1; i<=anyNo; i++){
			num=num*(i+1);
			k+="*"+(i+1);
			k3+=k+"="+num;
		}
	JOptionPane.showMessageDialog(null,k2+k3);
	}
}