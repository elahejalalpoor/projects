/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

import jumong.Jumong;

/**
 *
 * @elahe
 */
public class bigHealthPotion extends Item{
    public bigHealthPotion()
    {
        s="bigHealthPotion";
    }
    @Override
    public void use(Jumong j)
    {
        j.setHitpoints(j.getHitpoints() + 50);
    }
    
}
