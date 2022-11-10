package CoinEat;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class CoinEat extends JFrame {
	
	/**
	 * Simon Chu
	 */
	//set path and background image
	private Image backgroundImage = new ImageIcon("C:\\Users\\16082\\eclipse-workspace\\CoinEat\\src\\CoinEat\\동전먹기게임\\gameback.png").getImage();
	private static final long serialVersionUID = 1L;

	public CoinEat() {
		setTitle("Coin Eating Game");
		setVisible(true);
		setSize(500, 500);
		setLocationRelativeTo(null); // to make game center of the screen
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // when I press exit button, it becomes true.
	}
	
	public void paint(Graphics g) {
		g.drawImage(backgroundImage, 0, 0, null); // put background image into game.
		
	}
	
	
	public static void main(String[] args) {
		new CoinEat();
		
	}
}
