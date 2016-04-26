/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learn;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author msfishe
 */
public class LoadedImage {
    private BufferedImage image;
    
    public LoadedImage(String imageToLoad){
        //Load the image from the file using argument passed to constructor
        if (imageToLoad != null && !imageToLoad.equals(""))
        {
            try{
                image = ImageIO.read(new File(imageToLoad));
            }//end of try block
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }//end of catch block
        }//end of if block verifying argument string
        else
        {
            image = null;
        }//end of else block
    }//end of constructor
    
    public boolean setImage(String filepath){
        boolean returnValue;
        
        if (filepath != null && !filepath.equals(""))
        {
            try{
                image = ImageIO.read(new File(filepath));
                returnValue = true;
            }//end of try block
            catch(IOException ex){
                System.out.println(ex.getMessage());
                returnValue = false;
            }//end of catch block
        }//end of verifying argument contains something
        else
        {
            image = null;
            returnValue = false;
        }//end of else block
        
        return returnValue;    
    }//end of method readImageFromFile()
    
    public BufferedImage getImage(){
        return image;
    }//end of method getImage()
    
} //end of class LoadedImage
