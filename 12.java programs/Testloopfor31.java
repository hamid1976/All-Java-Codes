import java.awt.*;
import javax.swing.*;

class Testloopfor31{
	
	public static void main(String arg[]){
		
		TextArea area=new TextArea();
		
		for(int i=0; i<=50; i+=5)
			
		
		area.append(i+"\n");
		
		JOptionPane.showMessageDialog(null,area);
		
	}
}
		
		
		