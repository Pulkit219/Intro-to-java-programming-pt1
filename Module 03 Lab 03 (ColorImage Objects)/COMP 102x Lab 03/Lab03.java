import comp102x.ColorImage;
import comp102x.Canvas;

public class Lab03
{  
    
    public void loadAnImage() 
    {
        // Please write your code after this line
        
        //Loading image
        ColorImage image = new ColorImage();
        //Setting up canvas according to image height and width
        Canvas canvas = new Canvas(image.getWidth(), image.getHeight());
        
        //  load image to canvas
        canvas.add(image);
        
        
    }
    
    public void loadTwoImagesOnTheSameCanvas()
    {
        // Please write your code after this line
        
        
        
        
    }
    
    public void imageAddition() 
    {    
        // Please write your code after this line
        
        
        
        
    }
   
    public void imageMultiplication() 
    {
        // Please write your code after this line
        
        
        
        
    }
    
    public void changeColor()
    {
        ColorImage image = new ColorImage();
        image.increaseRed(40);
        Canvas canvas = new Canvas(image.getWidth(), image.getHeight());
        canvas.add(image);
        
        //image.save();
    }
}
