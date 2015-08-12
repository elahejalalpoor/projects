/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

import java.util.Iterator;
import jumong.Jumong;

/**
 *
 * @author TehranPardaz
 */
public class fireArrow extends Item{
    public fireArrow()
    {
        s="fireArrow";
    }
    @Override
    public void use(Jumong j)
    {
//      Iterator it=j.getPoint()[Jumong.getX()][Jumong.getY()].enemies.iterator();
//        while(it.hasNext())
//        {
//            it.next();
//            it.remove();
//            break;
//        }
    
            if(Jumong.getX()>0 && Jumong.getX()<22 && Jumong.getY()>0 && Jumong.getY()<22)
            {
            j.getPoint()[Jumong.getX()+1][Jumong.getY()].setIswall(false);

            j.getPoint()[Jumong.getX()-1][Jumong.getY()].setIswall(false);

            j.getPoint()[Jumong.getX()][Jumong.getY()-1].setIswall(false);

            j.getPoint()[Jumong.getX()][Jumong.getY()+1].setIswall(false);
            }
}
}
