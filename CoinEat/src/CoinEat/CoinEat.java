package CoinEat;

import javax.swing.JFrame;

public class CoinEat extends JFrame {
	
	/**
	 * Simon Chu
	 */
	private static final long serialVersionUID = 1L;

	public CoinEat() {
		setTitle("Coin Eating Game");
		setVisible(true);
		setSize(500, 500);
		setLocationRelativeTo(null); // to make game center of the screen
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // when I press exit button, it becomes true.
	}
	
	public static void main(String[] args) {
		new CoinEat();
		
	}
}
