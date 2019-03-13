
package image_Operations;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author skunal
 */
public class RGB_effect {
    
    public static void main(String args[])throws IOException 
    { 
        BufferedImage img = null; 
        File f = null; 
  
        // read image 
        try
        { 
            f = new File("C:\\Users\\skuna\\Downloads\\image.jpg"); 
            img = ImageIO.read(f); 
        } 
        catch(IOException e) 
        { 
            System.out.println(e); 
        } 
  
        // get width and height 
        int width = img.getWidth(); 
        int height = img.getHeight(); 
  
        // convert to red image 
        for (int y = 0; y < height; y++) 
        { 
            for (int x = 0; x < width; x++) 
            { 
                int p = img.getRGB(x,y); 
  
                int a = (p>>24)&0xff; 
             //   int r = (p>>16)&0xff; 
              //  int g = (p>>8)&0xff;
               int b = p&0xff; 
              
                // set new RGB 
                // keeping the r value same as in original 
                // image and setting g and b as 0. 
              //  p = (a<<24) | (r<<16) | (0<<8) | 0; 
              //    p = (a<<24) | (0<<16) | (g<<8) | 0; 
              p = (a<<24) | (0<<16) | (0<<8) | b;
              
                img.setRGB(x, y, p); 
            } 
        } 
  
        // write image 
        try
        { 
            f = new File("D:\\blue_Out.jpg"); 
            ImageIO.write(img, "jpg", f); 
        } 
        catch(IOException e) 
        { 
            System.out.println(e); 
        } 
    } 
    
}
