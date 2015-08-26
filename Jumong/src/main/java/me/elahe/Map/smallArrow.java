/*
 * In The Name Of God
 * ========================================
 * [] File Name : smallArrow.java
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

public class smallArrow extends Item {
	public smallArrow() {
		name = "smallArrow";
	}

	@Override
	public void use(Jumong j) {
		int w = j.getPoint()[Jumong.getX()][Jumong.getY()].enemies.size();
		j.getPoint()[Jumong.getX()][Jumong.getY()].enemies.remove(w - 1);
	}
}
