import java.awt.Color;

import javax.swing.JFrame;

/**
 * This class is run to start the game, it creates a JFrame with the gameplay class
 */
public class Main {
	public static void main(String[] args) {
		JFrame obj=new JFrame();
		Gameplay gamePlay = new Gameplay();
		
		obj.setBounds(10, 10, 700, 600);
		obj.setTitle("BrickBreaker by Dennis");		
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay);
        obj.setVisible(true);
	}
}
