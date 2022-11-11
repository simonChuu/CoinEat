package CoinEat;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class CoinEat extends JFrame {
	
	/** Coin Eat Game
	 *  Simon Chu
	 */
	//set path and background image
	private Image backgroundImage = new ImageIcon("C:\\Users\\16082\\eclipse-workspace\\CoinEat\\CoinEat\\\\src\\동전먹기게임\\gameback.png").getImage();
	private Image player = new ImageIcon("C:\\Users\\16082\\eclipse-workspace\\CoinEat\\CoinEat\\\\src\\동전먹기게임\\mario.jpg").getImage();
	private Image coin = new ImageIcon("C:\\Users\\16082\\eclipse-workspace\\CoinEat\\CoinEat\\\\src \\동전먹기게임\\coin.png").getImage();

	//player info
	private int playerX, playerY; // coordinates of player
	private int playerWidth = player.getWidth(null);
	private int playerHeight = player.getHeight(null);
	
	//coin info
	private int coinX, coinY;
	private int coinWidth = coin.getWidth(null);
	private int coinHeight = coin.getHeight(null);
	
	//score
	private int score;
	
	private static final long serialVersionUID = 1L;

	public CoinEat() {
		setTitle("Coin Eating Game");
		setVisible(true);
		setSize(500, 500);
		setLocationRelativeTo(null); // to make game center of the screen
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // when I press exit button, it becomes true.
		init();
	}
	
	public void init() {
		score = 0; // score has to start it with 0.
		
		playerX = (500 - playerWidth) / 2; // to make player comes to the center
		playerY = (500 - playerHeight) / 2; // "
		
		coinX = (int)(Math.random() * (501 - playerWidth));
		coinY = (int)(Math.random() * (501 - playerHeight - 30)) + 30;
		
	}
	
	public void paint(Graphics g) {
		g.drawImage(backgroundImage, 0, 0, null); // put background image into game.
		g.drawImage(coin, coinX, coinY, null); // put coin into the game.
		g.drawImage(player, playerX, playerY, null); // put player into the game.
		g.setColor(Color.white);
		g.setFont(new Font("Arial", Font.BOLD, 40));
		g.drawString("Score: " + score, 30, 80); // show score on the screen.
	}
	
	
	public static void main(String[] args) {
		new CoinEat();
	}
}
