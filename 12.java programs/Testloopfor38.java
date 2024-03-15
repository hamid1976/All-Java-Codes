import java.awt.*;
import javax.swing.*;

class Testloopfor38{
	
	public static void main(String arg[]){
		
		String s1=JOptionPane.showInputDialog("Enter Any No ");
		
		int n=Integer.parseInt(s1);
		
		TextArea area=new TextArea();
		
		int a=0, b=0;
		
		for(int i=0; i<=n; i++){
			
			a=a+3+b;
			
			b=b+2;
			
			area.append(a+"\n");
			
			
		}
		JOptionPane.showMessageDialog(null,area);
		
		
		
	}
}
		
		
