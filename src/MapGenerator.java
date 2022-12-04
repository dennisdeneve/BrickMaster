import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

/** 
Java class that contains the map of the game, generated on creation
*/ 
public class MapGenerator 
{
	public int map[][];
	public int brickWidth;
	public int brickHeight;

	/**
	 * Class to generate a map, initialed each entry to 1
	 * @param row
	 * @param col
	 */
	public MapGenerator (int row, int col)
	{
		map = new int[row][col];		
		for(int i = 0; i<map.length; i++)
		{
			for(int j =0; j<map[0].length; j++)
			{
				map[i][j] = 1;
			}			
		}
		// Setting the width and height of the bricks in correspondence
		brickWidth = 540/col;
		brickHeight = 150/row;
	}	
	
	/**
	 * Draw method to draw the bricks onto the screen
	 * @param g
	 */
	public void draw(Graphics2D g)
	{
		for(int i = 0; i<map.length; i++)
		{
			for(int j =0; j<map[0].length; j++)
			{
				if(map[i][j] > 0)
				{
					g.setColor(Color.white);
					g.fillRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);
					
					// this is to show the separate bricks, not entirely needed
					g.setStroke(new BasicStroke(3));
					g.setColor(Color.black);
					g.drawRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);				
				}
			}
		}
	}
	/**
	 * Method to set the value for each brick for the score
	 * @param value
	 * @param row
	 * @param col
	 */
	public void setBrickValue(int value, int row, int col)
	{
		map[row][col] = value;
	}
}
