
package image_Operations;

/**
 *
 * @author skunal
 */

 import org.opencv.core.*;
import org.opencv.highgui.HighGui;        
import org.opencv.videoio.VideoCapture; 

public class FaceDetector {
    
      
        

    public static void main (String args[]){
        
        
                System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
                Mat mat = Mat.eye(3, 3, CvType.CV_8UC1);
                System.out.println("mat = " + mat.dump());
        }

    
}
