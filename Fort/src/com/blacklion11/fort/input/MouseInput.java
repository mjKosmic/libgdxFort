package com.blacklion11.fort.input;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

import com.blacklion11.fort.world.*;
import com.blacklion11.fort.Window;

public class MouseInput
{
	
	World world;
	
	public MouseInput(World world){this.world = world;}
	
	public void update()
	{
		if(Gdx.input.justTouched())mouseTouched();
	}
	
	private void mouseTouched()
	{
		int x = Gdx.input.getX();
		int y = Gdx.input.getY();
		
		if((x - Window.X) / TileMap.TILESIZE > 0 && x - Window.X < world.tilemap.tiles[0].length * TileMap.TILESIZE)
		{
			if((y + Window.Y) / TileMap.TILESIZE > 0 && y + Window.Y < world.tilemap.tiles.length * TileMap.TILESIZE)
			{
				world.tilemap.tiles[(int)((x - Window.X) / TileMap.TILESIZE)][((int)(y + Window.Y) / TileMap.TILESIZE)] = new Tile(world.tilemap.tileset.getTileTextures().get(Tile.GRASS), Tile.GRASS);
			}
		}
		
	}
	
}