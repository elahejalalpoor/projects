/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import jumong.Jumong;

/**
 *
 * @author Elahe Jalalpoor
 */
public class Shovel extends Item{
    JFrame f;
    
    public Shovel()
    {
        s="Shovel";
        f=new JFrame();
        f.setLayout(new FlowLayout());
    }
    public void use(Jumong j)
    {
        
    }
}
