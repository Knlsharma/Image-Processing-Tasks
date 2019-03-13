
package image_Operations;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author skunal
 */
public class mirror_image {
    
     public static void main(String args[])throws IOException 
    { 
        // BufferedImage for source image 
        BufferedImage simg = null; 
  
        // File object 
        File f = null; 
  
        // Read source image file 
        try
        { 
            f = new File("C:\\Users\\skuna\\Downloads\\image.jpg"); 
            simg = ImageIO.read(f); 
        } 
  
        catch(IOException e) 
        { 
            System.out.println("Error: " + e); 
        } 
  
        // Get source image dimension 
        int width = simg.getWidth(); 
        int height = simg.getHeight(); 
  
        // BufferedImage for mirror image 
        BufferedImage mimg = new BufferedImage(width, height, 
                                        BufferedImage.TYPE_INT_ARGB); 
  
        // Create mirror image pixel by pixel 
        for (int y = 0; y < height; y++) 
        { 
            for (int lx = 0, rx = width - 1; lx < width; lx++, rx--) 
            { 
                // lx starts from the left side of the image 
                // rx starts from the right side of the image 
                // lx is used since we are getting pixel from left side 
                // rx is used to set from right side 
                // get source pixel value 
                int p = simg.getRGB(lx, y); 
  
                // set mirror image pixel value 
                mimg.setRGB(rx, y, p); 
            } 
        } 
  
        // save mirror image 
        try
        { 
            f = new File("D:\\mirror_Out.jpg"); 
            ImageIO.write(mimg, "jpg", f); 
        } 
        catch(IOException e) 
        { 
            System.out.println("Error: " + e); 
        } 
    } 
    
}
