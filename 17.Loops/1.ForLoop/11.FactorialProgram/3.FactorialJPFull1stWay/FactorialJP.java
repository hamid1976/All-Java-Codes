import javax.swing.*;
import java.util.*;
class FactorialJP{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		String s=JOptionPane.showInputDialog("Enter any no:");
		int no=Integer.parseInt(s);
		String k="\n1";
		String k2=k+"=1";
		String k3="";
		int num=1;
		for(int i=1; i<no; i++){
			num=num*(i+1);
			k+="*"+(i+1);
			k3+=k+"="+num;
		}
			JOptionPane.showMessageDialog(null,k2+k3);
	}
}