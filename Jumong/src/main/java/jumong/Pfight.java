/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jumong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JList;
import javax.swing.JPanel;


/**
 *
 * @author Elahe Jalalpoor
 */
public class Pfight extends JPanel{
    BufferedImage enemy;
    BufferedImage hero;
    Jumong j;
    
    Pfight(Jumong j)
    {
        
        this.j =j;
        try {
            enemy=ImageIO.read(new File("enemy.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(Panel2.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            hero=ImageIO.read(new File("hero.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(Panel1.class.getName()).log(Level.SEVERE, null, ex);
        }
        setSize(600,600);
        
       setBackground(Color.white); 
    }

    @Override
    public void paint(Graphics g) {
//        super.paint(g);
        g.setColor(Color.WHITE);
        g.fillRect(0,0, 600, 600);
        for(int x= j.getPoint()[Jumong.getX()][Jumong.getY()].enemies.size()-1;x>=0;x--)
        {
            Enemy e=(Enemy) j.getPoint()[Jumong.getX()][Jumong.getY()].enemies.get(x);
        if(e.getX()==0)
        {
            g.drawImage(enemy,200, 80, 100, 100, null);
        }
        if(e.getX()==1)
        {
            g.drawImage(enemy,100, 80, 100, 100, null);
        }
        if(e.getX()==2)
        {
            g.drawImage(enemy,100, 180, 100, 100, null);
        }
    }
        g.drawImage(hero, 400, 400, 100,100,null);
    }
}
