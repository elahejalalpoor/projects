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
public class stoneBreaker extends Item{
    
    public stoneBreaker()
    {
        
        s="stoneBreaker";
    }
    @Override
    public void use(Jumong j){
        if(j.getPoint()[Jumong.getX()+1][Jumong.getY()].isIswall())
        {
            j.getPoint()[Jumong.getX()+1][Jumong.getY()].setIswall(false);
            
        }
        if(j.getPoint()[Jumong.getX()-1][Jumong.getY()].isIswall())
        {
            j.getPoint()[Jumong.getX()-1][Jumong.getY()].setIswall(false);
        }
        if(j.getPoint()[Jumong.getX()][Jumong.getY()-1].isIswall())
        {
            j.getPoint()[Jumong.getX()][Jumong.getY()-1].setIswall(false);
        }
        if(j.getPoint()[Jumong.getX()][Jumong.getY()+1].isIswall())
        {
            j.getPoint()[Jumong.getX()][Jumong.getY()+1].setIswall(false);
        }
    }
    
}
