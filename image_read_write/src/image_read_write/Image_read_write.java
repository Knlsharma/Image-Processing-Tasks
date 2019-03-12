package image_read_write;

/**
 *
 * @author kunal
 */

import java.io.File; 
import java.io.IOException; 
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO; 

public class Image_read_write {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args)throws Exception {
       
        int width = 963;    //width of the image 
        int height = 640;   //height of the image 
  
        // For storing image in RAM 
        BufferedImage image = null; 
  
        // READ IMAGE 
        try
        { 
            File input_file = new File("C:\\Users\\skuna\\Downloads\\k.png"); //image file path 
  
            /* create an object of BufferedImage type and pass 
               as parameter the width,  height and image int 
               type.TYPE_INT_ARGB means that we are representing 
               the Alpha, Red, Green and Blue component of the 
               image pixel using 8 bit integer value. */
            image = new BufferedImage(width, height, 
                                    BufferedImage.TYPE_INT_ARGB); 
  
             // Reading input file 
            image = ImageIO.read(input_file); 
  
            System.out.println("Reading complete."); 
        } 
        catch(IOException e) 
        { 
            System.out.println("Error: "+e); 
        } 
  
        // WRITE IMAGE 
        try
        { 
            // Output file path 
            File output_file = new File("D:\\Out.jpg"); 
  
            // Writing to file taking type and path as 
            ImageIO.write(image, "png", output_file); 
  
            System.out.println("Writing complete."); 
        } 
        catch(IOException e) 
        { 
            System.out.println("Error: "+e); 
        } 
        
    }
    
}
