/*
 * In The Name Of God
 * ========================================
 * [] File Name : bigBag.java
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

public class bigBag extends Item {

	public bigBag() {
		name = "bigBag";
	}

	@Override
	public void use(Jumong jumong) {
		jumong.setCap(jumong.getCap() + 10);
	}
}
