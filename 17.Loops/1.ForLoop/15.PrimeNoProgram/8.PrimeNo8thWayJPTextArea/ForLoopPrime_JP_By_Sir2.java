import javax.swing.*;
import java.awt.*;
class ForLoopPrime_JP_By_Sir2{

	public static void main (String arg[]){
		  String a=JOptionPane.showInputDialog("Enter any No?");
		  int num=Integer.parseInt(a);
		  TextArea area=new TextArea();
		  
		   boolean found=true;
		   for(int t=2;  t<=num/2;  t++)
			 if(num%t==0){
				 found=false;
				 break;
			 }
		  if(found)
			 area.append("Prime No");
		  else
		     area.append("Not a Prime No");
			JOptionPane.showMessageDialog(null,area); 
			 }
		}