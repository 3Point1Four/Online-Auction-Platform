/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineauction2;

/**
 * *
 *
 *      private ImageIcon ViewResizeImage(String imgPath,byte[] imgBytes)
    {
        Approveitems io= new Approveitems();
        int imageX=123;
        int imageY=123;
        io.viewImageLbl.setSize(imageX,imageY);
        ImageIcon myImage=null;
        if(imgPath!=null)
        {
            myImage=new ImageIcon(imgPath);
        }
        else
        {
            myImage=new ImageIcon(imgBytes);
        }
        
        Image img=myImage.getImage();
        Image newImage=img.getScaledInstance(io.viewImageLbl.getWidth(),io.viewImageLbl.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image=new ImageIcon(newImage);

        return image;
    }
 *

 * @author dhyan
 */
public class NewClass {
    
}
