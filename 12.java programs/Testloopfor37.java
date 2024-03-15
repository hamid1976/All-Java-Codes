import java.awt.*;
import javax.swing.*;

class Testloopfor37{
	
	public static void main(String arg[]){
		
		String s1=JOptionPane.showInputDialog("Enter Any No ");
		
		int n=Integer.parseInt(s1);
		
		TextArea area=new TextArea();
		
		int a=0, c, b=1;
		
		for(int i=1; i<=n; i++){
			
			c=a+b;
			
			area.append(c+"\n");
			
			a=b;
			b=c;
		}
		
		JOptionPane.showMessageDialog(null,area);
		
	}
}