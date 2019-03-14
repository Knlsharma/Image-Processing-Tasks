
package image_Operations;

/**
 *
 * @author skunal
 */
// For setting color of the watermark text 
import java.awt.Color; 
  
// For setting font of the watermark text 
import java.awt.Font; 
  
import java.awt.Graphics; 
import java.awt.image.BufferedImage; 
import java.io.File; 
import java.io.IOException; 
  
import javax.imageio.ImageIO; 
  
public class WaterMark 
{ 
    public static void main(String[] args) 
    { 
        BufferedImage img = null; 
        File f = null; 
  
        // Read image 
        try
        { 
            f = new File("C:\\Users\\skuna\\Downloads\\k.png"); 
            img = ImageIO.read(f); 
        } 
        catch(IOException e) 
        { 
            System.out.println(e); 
        } 
  
        // create BufferedImage object of same width and 
        // height as of input image 
        BufferedImage temp = new BufferedImage(img.getWidth(), 
                    img.getHeight(), BufferedImage.TYPE_INT_RGB); 
  
        // Create graphics object and add original 
        // image to it 
        Graphics graphics = temp.getGraphics(); 
        graphics.drawImage(img, 0, 0, null); 
  
        // Set font for the watermark text 
        graphics.setFont(new Font("Arial", Font.PLAIN, 80)); 
        graphics.setColor(new Color(255, 0, 0, 40)); 
  
        // Setting watermark text 
        String watermark = "WaterMark generated"; 
  
        // Add the watermark text at (width/5, height/3) 
        // location 
        graphics.drawString(watermark, img.getWidth()/5, 
                                   img.getHeight()/3); 
  
        // releases any system resources that it is using 
        graphics.dispose(); 
  
        f = new File("D:\\watermark_output.png"); 
        try
        { 
            ImageIO.write(temp, "png", f); 
        } 
        catch (IOException e) 
        { 
            System.out.println(e); 
        } 
    } 
} 
