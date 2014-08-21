package fort.world;


import java.util.ArrayList;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Tileset
{
	
	
	ArrayList<Image> images;
	
	
	
	public Tileset()
	{
		loadTileImages();
	}
	
	private void loadTileset()
	{
	
	}
	
	private void loadTileImages()
	{
		images = new ArrayList<Image>();
		try
		{	
			images.add(Tile.BLANK, new Image("res/black.png"));
			images.add(Tile.DIRT, new Image("res/dirt.png"));
			images.add(Tile.GRASS, new Image("res/grass.png"));
			images.add(Tile.WATER, new Image("res/water.png"));
		}catch(SlickException e)
		{
			System.out.println("Error loading tile images");
			e.printStackTrace();
		}
	}

	
	public ArrayList<Image> getTileImages(){return this.images;}
	
}