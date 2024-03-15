import javax.swing.*;
import java.awt.*;
class  ForJP_CounterTable_Text{
    public static void main(String arg[]){
		
		
		String a=JOptionPane.showInputDialog("Enter Table No?");
		int Table=Integer.parseInt(a);
		
		String b=JOptionPane.showInputDialog("Enter Counter No?");
		int CounterNo=Integer.parseInt(b);
		
		TextArea area=new TextArea();
		for(int i=1; i<=CounterNo; i++){
		area.append(Table+"x"+i+"="+(Table*i)+"\n");
		}
		JOptionPane.showMessageDialog(null,area);
		
		
	}
}