/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

import java.util.Iterator;
import jumong.Jumong;

/**
 *
 * @elahe
 */
public class bigArrow extends Item{
    
    public bigArrow()
    {
        s="bigArrow";
    }
    @Override
    public void use(Jumong j)
    {
      Iterator it=j.getPoint()[Jumong.getX()][Jumong.getY()].enemies.iterator();
        while(it.hasNext())
        {
            it.next();
            it.remove();
            
        }
    }
}
