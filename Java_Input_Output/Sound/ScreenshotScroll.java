
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.*; 
public class ScreenshotScroll{
    // public static final long serialVersionUID = 1L;
   public static void main(String[] args)throws Exception {
		
	
		String path = "E:/Shot.jpg";
		File file=new File(path);
		Robot r = new Robot();
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension d=kit.getScreenSize();
		Rectangle rec=new Rectangle(d);
		BufferedImage Image=r.createScreenCapture(rec);
		ImageIO.write(Image,"jpg",file);
        try {
			//JFrame win=new JFrame();
            //Thread.sleep(120);
			
			ImageIcon icon=new ImageIcon(Image);
			JLabel label=new JLabel(icon);

            JScrollPane scroll=new JScrollPane(label);
			JFrame win=new JFrame();
			
			Container con=win.getContentPane();
			con.setLayout(null);
			
			scroll.setBounds(200,200,d.width/2,d.height/2);
			con.add(scroll);
			win.setBounds(0,0,1500,1000);
			win.show();
            ImageIO.write(Image, "jpg", new File(path));
            System.out.println("Screenshot saved");
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
}