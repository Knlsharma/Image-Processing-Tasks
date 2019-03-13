
package image_Operations;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author skunal
 */
public class random_pixel_image 
{
    
public static void main(String args[])throws IOException 
    { 
        // Image file dimensions 
        int width = 640, height = 400; 
  
        // Create buffered image object 
        BufferedImage img = null; 
        img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB); 
  
        // file object 
        File f = null; 
  
        // create random values pixel by pixel 
        for (int y = 0; y < height; y++) 
        { 
            for (int x = 0; x < width; x++) 
            { 
                int a = (int)(Math.random()*256); //generating 
                int r = (int)(Math.random()*256); //values 
                int g = (int)(Math.random()*256); //less than 
                int b = (int)(Math.random()*256); //256 
  
                int p = (a<<24) | (r<<16) | (g<<8) | b; //pixel 
  
                img.setRGB(x, y, p); 
            } 
        } 
  
        // write image 
        try
        { 
            f = new File("D:\\Random_Out.jpg"); 
            ImageIO.write(img, "jpg", f); 
        } 
        catch(IOException e) 
        { 
            System.out.println("Error: " + e); 
        } 
    }     
    
}
