package com.blacklion11.fort.world;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import com.blacklion11.fort.Window;

import java.util.Random;
import java.util.ArrayList;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

public class TileMap
{
	public static int TILESIZE;

	Tile[][] tiles;
	
	Tileset tileset;
	SpriteBatch batch;
	
	public TileMap(int tilesize)
	{
		this.TILESIZE = tilesize;
		tileset = new Tileset();
		batch = new SpriteBatch();
	}
	
	public void setTiles(int[][] map)
	{
		tiles = new Tile[map.length][map[0].length];
		
		for(int i = 0; i < tiles.length; i++)
		{
			for(int j = 0; j < tiles[0].length; j++)
			{	
				if(map[i][j] <= 35)
				{
					tiles[i][j] = new Tile(tileset.getTileTextures().get(Tile.WATER), Tile.WATER);
				}
				if(map[i][j] > 35 && map[i][j] <= 200)
				{
					tiles[i][j] = new Tile(tileset.getTileTextures().get(Tile.DIRT), Tile.DIRT);
				}
				/*if(map[i][j] > 35 && map[i][j] <= 60)
				{
					tiles[i][j] = new Tile(Tile.GREEN, Tile.GRASS);
				}
				if(map[i][j] > 60 && map[i][j] <= 80)
				{
					tiles[i][j] = new Tile(Tile.BROWN, Tile.DIRT);
				}
				if(map[i][j] > 80)
				{
					tiles[i][j] = new Tile(Tile.GRAY, Tile.STONE);
				}
				*/  
			}
		}
	}
	
	public void render()
	{
		/*
		for(int i = (int)Window.X / TILESIZE; i < (Window.X + Window.WIDTH) / TILESIZE; i++)
		{
			for(int j = (int)Window.Y / TILESIZE; j < (Window.Y + Window.HEIGHT) / TILESIZE; j++)
			{
				Texture image = tileset.getTileTextures().get(Tile.BLANK);
				if(i > 0 && i + Window.HEIGHT / TILESIZE< tiles.length)
				{
					if(j > 0 && j + Window.WIDTH / TILESIZE < tiles[0].length)
					{
						image = tiles[i][j].getTexture();
					}
				}
				batch.begin();
				batch.draw(image, (float) i * TILESIZE, (float) j * TILESIZE);
				batch.end();
				//g.drawImage(image, (float)i * TILESIZE - Window.X, (float)j * TILESIZE - Window.Y);
			}
		}
		*/
		
		for(int i = 0; i < tiles.length; i++)
		{
			for(int j = 0; j < tiles[0].length; j++)
			{
				Texture image = tiles[i][j].getTexture();
				batch.begin();
				batch.draw(image, (float) i * TILESIZE + Window.X, (float) j* TILESIZE + Window.Y);
				batch.end();
			}
		}
		
	}


}