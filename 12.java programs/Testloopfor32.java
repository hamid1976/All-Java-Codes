import java.awt.*;
import javax.swing.*;

class Testloopfor32{
	
	public static void main(String arg[]){
		
		TextArea area=new TextArea();
		
		for(int i=2; i<=20; i+=2)
			
		area.append(i+"\n");
		
		JOptionPane.showMessageDialog(null,area);
		
	}
}