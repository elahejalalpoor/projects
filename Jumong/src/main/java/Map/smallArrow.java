/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

import jumong.Enemy;
import jumong.Jumong;

/**
 *
 * @elahe
 */
public class smallArrow extends Item{
    public smallArrow()
    {
        s="smallArrow";
    }
    @Override
    public void use(Jumong j)
    {
        int w=j.getPoint()[Jumong.getX()][Jumong.getY()].enemies.size();
        for(int index=w-1;index>=0;index--)
        {
            j.getPoint()[Jumong.getX()][Jumong.getY()].enemies.remove(index);
            break;
        }
    }
}
