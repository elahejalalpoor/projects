/*
 * In The Name Of God
 * ========================================
 * [] File Name : bigArrow.java
 *
 * [] Creation Date : 26-08-2015
 *
 * [] Created By : Elahe Jalalpour (el.jalalpour@gmail.com)
 * =======================================
*/
/**
 * @author Elahe Jalalpour
 */
package me.elahe.Map;

import me.elahe.jumong.Jumong;

import java.util.Iterator;

public class bigArrow extends Item {

	public bigArrow() {
		name = "bigArrow";
	}

	@Override
	public void use(Jumong jumong) {
		Iterator it = jumong.getPoint()[Jumong.getX()][Jumong.getY()].enemies.iterator();
		while (it.hasNext()) {
			it.next();
			it.remove();

		}
	}
}
