import javax.swing.*;
import java.awt.*;
class  ForOdd_Text{
    public static void main(String arg[]){
		
		
		String a=JOptionPane.showInputDialog("Enter any No?");
		int num=Integer.parseInt(a);
		TextArea area=new TextArea();
		
		
		
		for(int i=0; i<=num; i++)
			if(i%2!=0)
				area.append(i+"\n");
				JOptionPane.showMessageDialog(null,area);
	}	
}
		