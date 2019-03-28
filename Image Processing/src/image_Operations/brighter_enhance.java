/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package image_Operations;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

/**
 *
 * @author knl
 */

  
public class brighter_enhance { 
   static int width; 
   static int height; 
   static double alpha = 1; 
   static double beta = 50; 
     
   public static void main( String[] args ) { 
     
      try { 
  
         // For proper execution of native libraries 
         // Core.NATIVE_LIBRARY_NAME must be loaded before 
            // calling any of the opencv methods 
         System.loadLibrary( Core.NATIVE_LIBRARY_NAME ); 
  
         // input image 
         Mat source =   
          Imgcodecs.imread("C:\\Users\\knl\\Downloads\\image.jpg", Imgcodecs.CV_LOAD_IMAGE_COLOR); 
         Mat destination = new Mat(source.rows(), source.cols(), source.type()); 
  
         // applying brightness enhacement 
         source.convertTo(destination, -1, 2, 25); 
  
         // output image 
         Imgcodecs.imwrite("D:\\brighter.png", destination); 
           
      } catch (Exception e) { 
         System.out.println("error: " + e.getMessage()); 
      } 
   } 
}
    

