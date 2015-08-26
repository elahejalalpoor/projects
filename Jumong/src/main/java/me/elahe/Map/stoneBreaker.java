/*
 * In The Name Of God
 * ========================================
 * [] File Name : stoneBreaker.java
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

public class stoneBreaker extends Item {

	public stoneBreaker() {

		name = "stoneBreaker";
	}

	@Override
	public void use(Jumong j) {
		if (j.getPoint()[Jumong.getX() + 1][Jumong.getY()].isIswall()) {
			j.getPoint()[Jumong.getX() + 1][Jumong.getY()].setIswall(false);

		}
		if (j.getPoint()[Jumong.getX() - 1][Jumong.getY()].isIswall()) {
			j.getPoint()[Jumong.getX() - 1][Jumong.getY()].setIswall(false);
		}
		if (j.getPoint()[Jumong.getX()][Jumong.getY() - 1].isIswall()) {
			j.getPoint()[Jumong.getX()][Jumong.getY() - 1].setIswall(false);
		}
		if (j.getPoint()[Jumong.getX()][Jumong.getY() + 1].isIswall()) {
			j.getPoint()[Jumong.getX()][Jumong.getY() + 1].setIswall(false);
		}
	}

}
