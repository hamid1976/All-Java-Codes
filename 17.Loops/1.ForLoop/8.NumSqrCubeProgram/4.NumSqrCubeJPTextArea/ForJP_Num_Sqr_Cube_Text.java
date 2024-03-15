import javax.swing.*;
import java.awt.*;
class  ForJP_Num_Sqr_Cube_Text{
    public static void main(String arg[]){
		
		
		String a=JOptionPane.showInputDialog("Enter any No?");
		int anyNo=Integer.parseInt(a);
		TextArea area=new TextArea();
		
		         area.append("Num\tSqr\tCube\n");
		        for(int i=1; i<=anyNo;       i++){
		       area.append((i)+"\t" +(i*i)+ "\t"  +(i*i*i)+"\n");
				}
				JOptionPane.showMessageDialog(null,area);
				
				
	}
}