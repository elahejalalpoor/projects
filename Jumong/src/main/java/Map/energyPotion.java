/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

import jumong.Jumong;

/**
 *
 * @author TehranPardaz
 */
public class energyPotion extends Item{
    public energyPotion()
    {
        s="energyPotion";
    }
    @Override
    public void use(Jumong j)
    {
        j.setEnergy(j.getEnergy() + 10);
    }
}
