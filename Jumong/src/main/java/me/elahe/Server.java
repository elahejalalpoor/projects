/*
 * In The Name Of God
 * ========================================
 * [] File Name : Server.java
 *
 * [] Creation Date : 26-08-2015
 *
 * [] Created By : Elahe Jalalpour (el.jalalpour@gmail.com)
 * =======================================
*/
/**
 * @author Elahe Jalalpour
 */
package me.elahe;

import me.elahe.jumong.JumongFrame;
import me.elahe.jumong.Jumong;
import me.elahe.jumong.Loose;

import javax.swing.*;

public class Server {
	public Server() {
		Jumong j = new Jumong();
		JumongFrame f = new JumongFrame(j);
		JFrame fa = new JFrame();
		fa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		while (true) {
			if (j.getHitpoints() < 0 || j.getEnergy() < 0) {
				f.dispose();
				fa.setVisible(false);
				fa.setSize(1500, 720);
				Loose l = new Loose();
				fa.add(l);
				l.repaint();
				fa.setVisible(true);
				break;
			}
		}
	}

	public static void main(String[] args) {
		new Server();
	}
}
