/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jumong;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Elahe Jalalpoor
 */
public class Loose extends JPanel{
    BufferedImage gameover;
    public Loose()
    {
        try {
            gameover=ImageIO.read(new File("why.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(Loose.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    @Override
    
    public void paint(Graphics g) {
//        super.paint(g);
        g.drawImage(gameover,0,0,400,500,null);
    }
    
    
}
