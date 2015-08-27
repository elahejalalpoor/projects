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
	public void use(Jumong jumong) {
		int w = jumong.getPoint()[Jumong.getX()][Jumong.getY()].enemies.size();
		jumong.getPoint()[Jumong.getX()][Jumong.getY()].enemies.remove(w - 1);
	}
}
