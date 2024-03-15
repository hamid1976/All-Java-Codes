import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
  
//public class ScreenshotFor{
    //public static final long serialVersionUID = 1L;
   // public static void main(String[] args){
        //try {
           // Thread.sleep(120);
            // Robot r = new Robot();
            // File file=new File("E:/capture/shot"+(c++)+".jpg");	
            //It saves screenshot to desired path
            //String path = "E:/Shot.jpg";
  
            //Used to get ScreenSize and capture image
            // Rectangle rec =  new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            //BufferedImage Image = r.createScreenCapture(capture);
			
			// ImageIcon icon=new ImageIcon(Image);
			// JLabel label=new JLabel(icon);

            // JOptionPane.showMessageDialog(null,label);

            // ImageIO.write(r.createScreenCapture(rec), "jpg", new file);
            // System.out.println("Screenshot saved");
       //}catch (Exception ex) {
           //System.out.println(ex);
        //}
		class CaptureDemo{
			public static void main(String arg[]){
				new CaptureThread().start();
				try{
					 
				 
           	
          
           
			
		
			JLabel label=new JLabel();

            JOptionPane.showMessageDialog(null,label);

            
            System.out.println("Screenshot saved");
				}catch(Exception e){
				e.printStackTrace();}
			}
		}
		
		
		class CaptureThread extends Thread {

		int c=0;
	    Robot r = new Robot();
		Rectangle capture =  new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		BufferedImage Image = r.createScreenCapture(capture);
	    ImageIcon icon=new ImageIcon(Image);
		File file=new File("E:/capture/shot"+(c++)+".jpg");
		
		
		
			public void run(){
				int d=0;
				try{
				do{
					d++;
					if(d>=100  &&  d<=100)
						ImageIO.write(r.createScreenCapture(capture), "jpg", file);
						Thread.sleep(100);
					System.out.println("ya");
				}while(true);
				}catch(Exception e){e.printStackTrace();}
            }
        }
		