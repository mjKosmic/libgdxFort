package fort.world;

import java.util.ArrayList;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;


public class Tile
{
	/////////  ID STUFFS//////////////////////////////////////////////////////////////////////
	public static final int NUM_TILE_IMAGES = 6;
	
	public static final int AIR = -1;
	public static final int BLANK = 0;
	public static final int DIRT = 1;
	public static final int GRASS = 2;
	public static final int WATER = 3;
	public static final int STONE = 4;
	public static final int SAND = 5; 
	
	public static int ID;
	
	///////// IMAGE STUFFS//////////////////////////////////////////////////////////////////
	private Image image;
	
	
	/////// COLOR STUFFS /////////////////////////////////////////////////////////////////
	public static Color BLACK;
	public static Color WHITE;
	public static Color BLUE;
	public static Color GREEN;
	public static Color GRAY;
	public static Color BROWN;
	public static Color YELLOW;
	
	public Color color; 
	
	
	public Tile()
	{
		setColors();
	}
	
	public Tile(Image image, int id)
	{
		this.image = image;
		this.ID = id;
		setColors();
	}
	
	
	public Tile(Color c, int id)
	{
		this.color = c;
		this.ID = id;
		setColors();
	}
	
	private void setColors()
	{
		BLACK = Color.black;
		WHITE = Color.white;
		BLUE = Color.blue;
		GREEN = Color.green;
		GRAY = Color.gray;
		BROWN = new Color(87,59,12);
		YELLOW = Color.yellow;
	}
	
	
	public void setID(int id){this.ID = id;}
	public void setColor(Color c){this.color = c;}
	public void setImage(Image image){this.image = image;}
	
	public Image getImage(){return this.image;}

	public void render(Graphics g, float x, float y)
	{	
		g.setColor(color);
		g.fillRect(x , y, TileMap.TILESIZE, TileMap.TILESIZE);
	}
}