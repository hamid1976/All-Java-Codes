import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
  
public class Screenshot {
    // public static final long serialVersionUID = 1L;
    public static void main(String[] args){
        try {
            Thread.sleep(120);
            Robot r = new Robot();
  
            // It saves screenshot to desired path
            String path = "E:/Shot.jpg";
  
            // Used to get ScreenSize and capture image
            Rectangle capture =  new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage Image = r.createScreenCapture(capture);
			
			ImageIcon icon=new ImageIcon(Image);
			JLabel label=new JLabel(icon);

            JOptionPane.showMessageDialog(null,label);

            ImageIO.write(Image, "jpg", new File(path));
            System.out.println("Screenshot saved");
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
}