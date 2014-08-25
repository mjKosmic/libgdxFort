package com.blacklion11.fort.world;


import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;

public class Tileset
{
	
	
	ArrayList<Texture> images;
	
	
	
	public Tileset()
	{
		loadTileImages();
	}
	
	private void loadTileset()
	{
	
	}
	
	private void loadTileImages()
	{
		images = new ArrayList<Texture>();
			
		images.add(Tile.BLANK, new Texture("res/black.png"));
		images.add(Tile.DIRT, new Texture("res/dirt.png"));
		images.add(Tile.GRASS, new Texture("res/grass.png"));
		images.add(Tile.WATER, new Texture("res/water.png"));
		
	}

	
	public ArrayList<Texture> getTileTextures(){return this.images;}
	
}