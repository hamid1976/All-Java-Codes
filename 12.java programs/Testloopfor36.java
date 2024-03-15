import java.awt.*;
import javax.swing.*;

class Testloopfor36{
	
	public static void main(String arg[]){
		
		String s1=JOptionPane.showInputDialog("Enter Any No ");
		
		int a=Integer.parseInt(s1);
		
		TextArea area=new TextArea();
		
		int fact=1;
		
		for(int i=1; i<=a; i++){
			
			fact*=i;
			
			area.append(fact+"\n");
		}
		
		JOptionPane.showMessageDialog(null,area);
		
	}
}