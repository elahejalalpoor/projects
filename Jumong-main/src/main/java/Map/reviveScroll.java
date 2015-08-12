/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

import jumong.Jumong;

/**
 *
 * @author Elahe Jalalpoor
 */
public class reviveScroll extends Item{
    
    public reviveScroll()
    {
        s="reviveScroll";
    }
    @Override
    public void use(Jumong j)
    {
        j.setHitpoints(j.getHitpoints() + 50);
    }
}
