import java.awt.*;
import javax.swing.*;
class ForJPText{
      public static void main(String arg[]){
      TextArea area=new TextArea();
      for(int i=1; i<=50; i++)
           area.append(i+"\n");

      JOptionPane.showMessageDialog(null,area);
	  } 
}	  