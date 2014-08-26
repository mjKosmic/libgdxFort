package com.blacklion11.fort.world;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;


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
	private Texture image;
	
	
	/////// COLOR STUFFS /////////////////////////////////////////////////////////////////
	public static Color BLACK;
	public static Color WHITE;
	public static Color BLUE;
	public static Color GREEN;
	public static Color GRAY;
	public static Color BROWN;
	public static Color YELLOW;
	
	public Color color; 
	
	public boolean mouseTouched;
	
	
	public Tile()
	{
		setColors();
	}
	
	public Tile(Texture image, int id)
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
		BLACK = Color.BLACK;
		WHITE = Color.WHITE;
		BLUE = Color.BLUE;
		GREEN = Color.GREEN;
		GRAY = Color.DARK_GRAY;
		BROWN = new Color(87f,59f,12f,0f);
		YELLOW = Color.YELLOW;
	}
	
	
	public void setID(int id){this.ID = id;}
	public void setColor(Color c){this.color = c;}
	public void setTexture(Texture image){this.image = image;}
	
	public Texture getTexture(){return this.image;}

	public void render()
	{	
		
	}
}