/*
 * In The Name Of God
 * ========================================
 * [] File Name : smallHealthPotion.java
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

public class smallHealthPotion extends Item {
	public smallHealthPotion() {
		name = "smallHealthPotion";
	}

	@Override
	public void use(Jumong jumong) {
		jumong.setHitPoints(jumong.getHitPoints() + 20);
	}
}
