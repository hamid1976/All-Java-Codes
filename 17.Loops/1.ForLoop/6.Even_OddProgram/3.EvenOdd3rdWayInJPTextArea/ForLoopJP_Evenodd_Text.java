import javax.swing.*;
import java.awt.*;
class ForLoopJP_Evenodd_Text{
      public static void main(String arg[]){

       
        
        
		
		String a=JOptionPane.showInputDialog("Enter any no?");
		int anyNo=Integer.parseInt(a);
	    String s="";
		TextArea area=new TextArea();
		
		for(int i=1; i<=anyNo; i++){
			if(i%2==0)
				s+=i+"\n";
				
			if(i%2!=0)
				s+=i+"            ";	
            area.append(i+"\n");			
		}
		  JOptionPane.showMessageDialog(null,area);
		 
	}
}
	    