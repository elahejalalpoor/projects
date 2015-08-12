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
public class bigBag extends Item {

    public bigBag() {
        s = "bigBag";
    }
    @Override
    public void use(Jumong j)
    {
        j.setCap(j.getCap()+10);
    }
}
