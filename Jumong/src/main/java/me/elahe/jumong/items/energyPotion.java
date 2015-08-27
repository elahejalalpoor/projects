/*
 * In The Name Of God
 * ========================================
 * [] File Name : energyPotion.java
 *
 * [] Creation Date : 26-08-2015
 *
 * [] Created By : Elahe Jalalpour (el.jalalpour@gmail.com)
 * =======================================
*/
/**
 * @author Elahe Jalalpour
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.elahe.jumong.items;

import me.elahe.jumong.Jumong;

/**
 *
 * @author TehranPardaz
 */
public class energyPotion extends Item{
    public energyPotion()
    {
        name ="energyPotion";
    }
    @Override
    public void use(Jumong jumong)
    {
        jumong.setEnergy(jumong.getEnergy() + 10);
    }
}
