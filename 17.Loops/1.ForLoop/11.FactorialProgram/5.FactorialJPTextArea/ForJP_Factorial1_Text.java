import java.awt.*;
import javax.swing.*;
class ForJP_Factorial1_Text{
      public static void main(String arg[]){
		  
          
		  
		  String a=JOptionPane.showInputDialog("Enter any No?");
		  int anyNo=Integer.parseInt(a);
		  TextArea area=new TextArea();
		  int fact=1;
		  
		  
		  for(int  i=1; i<=anyNo; i++){
		  fact=fact*i;
		  
		  area.append(fact+"\n");
		  }
		  JOptionPane.showMessageDialog(null,area);
	  }
}
		  