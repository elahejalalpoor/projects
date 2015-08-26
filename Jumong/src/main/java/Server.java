
import jumong.Frame;
import jumong.Jumong;
import jumong.Loose;

import javax.swing.*;

/**
 * @author Elahe Jalalpoor
 */
public class Server {
	public Server() {
		Jumong j = new Jumong();
		Frame f = new Frame(j);
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
