/*
 * In The Name Of God
 * ========================================
 * [] File Name : reviveScroll.java
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

public class reviveScroll extends Item {

	public reviveScroll() {
		name = "reviveScroll";
	}

	@Override
	public void use(Jumong j) {
		j.setHitpoints(j.getHitpoints() + 50);
	}
}
