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
public class smallHealthPotion extends Item{
    public smallHealthPotion()
    {
        s="smallHealthPotion";
    }
    @Override
    public void use(Jumong j)
    {
        j.setHitpoints(j.getHitpoints() + 20);
    }
}
