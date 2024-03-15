import java.awt.*;
import javax.swing.*;  
import java.util.*;

public class Screenshot2{
    public static final void makeScreenshot(JFrame argFrame) {
        Rectangle rec = argFrame.getBounds();
        BufferedImage bufferedImage = new BufferedImage(rec.width, rec.height, BufferedImage.TYPE_INT_ARGB);
        argFrame.paint(bufferedImage.getGraphics());

        try {
            // Create temp file
            File temp = File.createTempFile("screenshot", ".png");

            // Use the ImageIO API to write the bufferedImage to a temporary file
            ImageIO.write(bufferedImage, "png", temp);

            // Delete temp file when program exits
            temp.deleteOnExit();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    public static void main(String[] args){
       
    }
}