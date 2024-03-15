import javax.swing.*;
import java.awt.*;
class ForLoopPrime_JP_By_Sir3{

	public static void main (String arg[]){
		  String a=JOptionPane.showInputDialog("Enter any No?");
		  int anyNo=Integer.parseInt(a);
		  TextArea area=new TextArea();
		 
		  int counter=0;
		 
		 for(int t=2;  t<=anyNo/2;  t++)
			 if(anyNo%t==0){
				 counter++;
				 break;
			 }
		if(counter==0)
		     area.append("Prime Number");
		
		 else
		     area.append("Not a Prime Number");
		 
		 JOptionPane.showMessageDialog(null,area);
		 
			 
			 }
		}