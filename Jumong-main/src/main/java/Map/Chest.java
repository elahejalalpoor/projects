/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

import java.util.Random;
import jumong.Jumong;

/**
 *
 * @elahe
 */
public class Chest extends Item{
    private Random num;
    private int number;
    public Chest()
    {
        s="Chest";
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
        switch(number)
        {
            case 0:
                j.getPoint()[Jumong.getX()][Jumong.getY()].items.add(new Shovel());
                break;
            case 1:
                j.getPoint()[Jumong.getX()][Jumong.getY()].items.add(new energyPotion());
                j.getPoint()[Jumong.getX()][Jumong.getY()].items.add(new fireArrow());
                break;
            case 2:
                j.getPoint()[Jumong.getX()][Jumong.getY()].items.add(new stoneBreaker());
                break;
            case 3:
                j.getPoint()[Jumong.getX()][Jumong.getY()].items.add(new reviveScroll());
                break;
        }
    }
}
