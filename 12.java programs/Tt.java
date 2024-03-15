import javax.swing.*;
import java.awt.*;
class Tt{
	
	public static void main(String arg[]){
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//frame.setSize(450,300);
		//frame.setLocation(500,200);
        frame.setBounds(500,200,450,300);

        frame.setTitle("faizan hussain");
       
         ImageIcon icon = new ImageIcon("wall.JPEG");
		 frame.setIconImage(icon.getImage());

         Container c = frame.getContentPane();
		// Color color = new Color(255,0,0);
		c.setBackground(Color.RED);
  
         frame.setResizable(true);
		 
	}
}

