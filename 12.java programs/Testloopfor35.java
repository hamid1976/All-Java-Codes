import java.awt.*;
import javax.swing.*;

class Testloopfor35{
	
	public static void main(String arg[]){
		
	
    	String s1=JOptionPane.showInputDialog("Enter Table No ");
	
    	String s2=JOptionPane.showInputDialog("Enter Counter No ");
	
    	int a=Integer.parseInt(s1);
	
    	int b=Integer.parseInt(s2);
	
    	TextArea area=new TextArea();
		
		for(int i=1; i<=b; i++){
			
			area.append(a+"X"+i+"="+i*a+"\n");
		}
		
		JOptionPane.showMessageDialog(null,area);
		
	}
}
			
		