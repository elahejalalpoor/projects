/*
 * In The Name Of God
 * ========================================
 * [] File Name : Jumong.java
 *
 * [] Creation Date : 26-08-2015
 *
 * [] Created By : Elahe Jalalpour (el.jalalpour@gmail.com)
 * =======================================
*/
/**
 * @author Elahe Jalalpour
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.elahe.jumong;

import me.elahe.Map.Item;
import me.elahe.Map.smallArrow;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @elahe
 */
public class Jumong implements Serializable {

	/**
	 * @return the x
	 */
	public static int getX() {
		return x;
	}

	/**
	 * @param aX the x to set
	 */
	public static void setX(int aX) {
		x = aX;
	}

	/**
	 * @return the y
	 */
	public static int getY() {
		return y;
	}

	/**
	 * @param aY the y to set
	 */
	public static void setY(int aY) {
		y = aY;
	}

	/**
	 * @return the gold
	 */
	public static int getGold() {
		return gold;
	}

	/**
	 * @param aGold the gold to set
	 */
	public static void setGold(int aGold) {
		gold = aGold;
	}

	private Point[][] point;
	public HashMap hm;
	private static int x;
	private static int y, gold;
	public ArrayList<Item> inventory;
	private int hitPoints;
	private int energy;
	private int cap;

	public Jumong() {
		hitPoints = 200;
		energy = 100;
		x = y = 0;
		cap = 50;
		point = new Point[23][23];
		hm = new HashMap();
		inventory = new ArrayList<>();

		for (int i = 0; i < 23; i++) {
			for (int j = 0; j < 23; j++) {
				point[i][j] = new Point(i, j);
			}
		}
		point[2][3].setIswall(true);
		point[2][4].setIswall(true);
		point[3][4].setIswall(true);
		point[6][6].setIswall(true);
		point[5][6].setIswall(true);
		point[5][7].setIswall(true);
		point[5][8].setIswall(true);
		point[5][9].setIswall(true);
		point[5][10].setIswall(true);
		point[5][12].setIswall(true);
		point[6][11].setIswall(true);
		point[7][11].setIswall(true);
		point[8][11].setIswall(true);
		point[8][12].setIswall(true);
		point[8][13].setIswall(true);
		point[8][3].setIswall(true);
		point[9][3].setIswall(true);
		point[10][3].setIswall(true);
		point[11][3].setIswall(true);
		point[12][3].setIswall(true);
		point[12][4].setIswall(true);
		point[12][5].setIswall(true);
		point[12][6].setIswall(true);
		point[12][7].setIswall(true);
		point[12][9].setIswall(true);
		point[9][6].setIswall(true);
		point[10][6].setIswall(true);
		point[11][6].setIswall(true);
		point[10][7].setIswall(true);
		point[10][12].setIswall(true);
		point[17][1].setIswall(true);
		point[17][4].setIswall(true);
		point[17][5].setIswall(true);
		point[17][6].setIswall(true);
		point[17][7].setIswall(true);
		point[17][8].setIswall(true);
		point[17][9].setIswall(true);
		point[17][10].setIswall(true);
		point[17][11].setIswall(true);
		point[17][12].setIswall(true);
		point[16][7].setIswall(true);
		point[15][7].setIswall(true);
		point[15][5].setIswall(true);
		point[15][4].setIswall(true);
		point[18][12].setIswall(true);
		point[18][13].setIswall(true);
		point[16][12].setIswall(true);
		point[15][12].setIswall(true);
		point[19][3].setIswall(true);
		point[21][5].setIswall(true);
		point[22][2].setIswall(true);
		point[21][5].setIswall(true);
		point[22][5].setIswall(true);
		point[22][5].setIswall(true);
		point[22][1].setIswall(true);
		point[22][2].setIswall(true);
		point[22][3].setIswall(true);
		point[22][4].setIswall(true);
		point[22][6].setIswall(true);
		point[22][7].setIswall(true);
		point[22][8].setIswall(true);
		point[22][9].setIswall(true);
		point[22][10].setIswall(true);
		point[22][11].setIswall(true);
		point[19][8].setIswall(true);
		point[20][8].setIswall(true);
		point[21][8].setIswall(true);
		point[21][11].setIswall(true);
		point[16][13].destination = true;
		for (int i = 0; i < 23; i++) {
			for (int j = 0; j < 23; j++) {
				if (!point[i][j].isIswall()) {
					point[i][j].setItem();
				}
			}
		}


		for (int i = 0; i < 10; i++) {
			smallArrow a = new smallArrow();
			inventory.add(a);
		}
		point[0][0].items.add(new smallArrow());

	}

	/**
	 * @return the inventory
	 */
	public ArrayList<Item> getInventory() {
		return inventory;
	}


	/**
	 * @return the hitPoints
	 */
	public int getHitPoints() {
		return hitPoints;
	}

	/**
	 * @param hitPoints the hitPoints to set
	 */
	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	/**
	 * @return the energy
	 */
	public int getEnergy() {
		return energy;
	}

	/**
	 * @param energy the energy to set
	 */
	public void setEnergy(int energy) {
		this.energy = energy;
	}

	/**
	 * @return the cap
	 */
	public int getCap() {
		return cap;
	}

	/**
	 * @param cap the cap to set
	 */
	public void setCap(int cap) {
		this.cap = cap;
	}

	/**
	 * @return the point
	 */
	public Point[][] getPoint() {
		return point;
	}

	/**
	 * @param point the point to set
	 */
	public void setPoint(Point[][] point) {
		this.point = point;
	}
}
