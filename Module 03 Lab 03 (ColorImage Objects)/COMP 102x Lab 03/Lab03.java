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
        
        
          ColorImage imageA = new ColorImage();
          ColorImage imageB = new ColorImage();
          
        //Setting up canvas according to image height and width
        Canvas canvas = new Canvas(imageA.getWidth()*2, imageA.getHeight());
        
        //  load image to canvas
        canvas.add(imageA,0,0);
        canvas.add(imageB,imageA.getWidth(),0);
        
        
        
        
    }
    
    public void imageAddition() 
    {    
        // Please write your code after this line
        ColorImage imageA = new ColorImage();
        ColorImage imageB = new ColorImage();
        ColorImage imageC = imageA.add(imageB);
        
        //Setting up canvas according to image height and width
        Canvas canvas = new Canvas(imageA.getWidth()*3+20, imageA.getHeight());
        
        //  load image to canvas
        canvas.add(imageA,0,0);
        canvas.add(imageB,imageA.getWidth()+10,0);
        canvas.add(imageC,imageB.getWidth()*2+20,0);
        
        
    }
   
    public void imageMultiplication() 
    {
        // Please write your code after this line

        ColorImage imageA = new ColorImage();
        ColorImage imageB = new ColorImage();
        ColorImage imageC = imageA.multiply(imageB);
        
        //Setting up canvas according to image height and width
        Canvas canvas = new Canvas(imageA.getWidth()*3+20, imageA.getHeight());
        
        //  load image to canvas
        canvas.add(imageA,0,0);
        canvas.add(imageB,imageA.getWidth()+10,0);
        canvas.add(imageC,imageB.getWidth()*2+20,0);
        
        
        
    }
    
    public void changeColor()
    {
        ColorImage image = new ColorImage();
        image.increaseRed(40);
        Canvas canvas = new Canvas(image.getWidth(), image.getHeight());
        canvas.add(image);
        
        
        image.increaseGreen(40);
        image.save();
    }
}
