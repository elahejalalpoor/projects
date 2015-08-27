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
package me.elahe.jumong;

import javax.swing.*;

public class Server {
	public Server() {
		Jumong jumong = new Jumong();
		JumongFrame jumongFrame = new JumongFrame(jumong);
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		while (true) {
			if (jumong.getHitPoints() < 0 || jumong.getEnergy() < 0) {
				jumongFrame.dispose();
				frame.setVisible(false);
				frame.setSize(1500, 720);
				Loose l = new Loose();
				frame.add(l);
				l.repaint();
				frame.setVisible(true);
				break;
			}
		}
	}

	public static void main(String[] args) {
		new Server();
	}
}
