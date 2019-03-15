package image_Operations;

import org.opencv.core.Core; 
import org.opencv.core.Mat; 
import org.opencv.imgcodecs.Imgcodecs; 
import org.opencv.imgproc.Imgproc; 
  
public class Main 
{ 
    public static void main( String[] args ) 
    { 
        try
        { 
            // For proper execution of native libraries 
            // Core.NATIVE_LIBRARY_NAME must be loaded before 
            // calling any of the opencv methods 
            System.loadLibrary( Core.NATIVE_LIBRARY_NAME ); 
  
            //input image 
            Mat source = Imgcodecs.imread("C:\\Users\\skuna\\Downloads\\image.jpg", 
                           Imgcodecs.CV_LOAD_IMAGE_GRAYSCALE); 
            Mat destination = new Mat(source.rows(), 
                               source.cols(), source.type()); 
  
            // applying histogram equalization 
            Imgproc.equalizeHist(source, destination); 
  
            // writing output image 
            Imgcodecs.imwrite("D:\\oenhancement_utput.png", destination); 
        } 
        catch (Exception e) 
        { 
            System.out.println("error: " + e.getMessage()); 
        } 
    } 
} 