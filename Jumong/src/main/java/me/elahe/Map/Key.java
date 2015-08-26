/*
 * In The Name Of God
 * ========================================
 * [] File Name : Key.java
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
package me.elahe.Map;

import java.util.Random;
import me.elahe.jumong.Jumong;

/**
 *
 * @author Elahe Jalalpoor
 */
public class Key extends Item{
    private int number;
    private Random num;
    public Key()
    {
        name ="Key";
        num=new Random();
       
        number=num.nextInt(3);
        switch(number)
        {
            case 0:
                match=0;
                break;
            case 1:
                match=1;
                break;
            case 2:
                match=2;
                break;
            case 3:
                match=3;
                break;
    }
    }
    @Override
    public void use(Jumong j)
    {
        
    }
}
