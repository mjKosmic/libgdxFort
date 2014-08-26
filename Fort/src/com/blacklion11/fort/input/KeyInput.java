package com.blacklion11.fort.input;


import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Gdx;

import com.blacklion11.fort.Window;
import com.blacklion11.fort.world.*;

public class KeyInput
{
	
	World world;

	
	public KeyInput(World world){this.world = world;}
	
	
	public void update()
	{
		if(Gdx.input.isKeyPressed(Keys.ESCAPE))System.exit(0);
		if(Gdx.input.isKeyPressed(Keys.UP))Window.Y -= 10;
		if(Gdx.input.isKeyPressed(Keys.DOWN))Window.Y += 10;
		if(Gdx.input.isKeyPressed(Keys.LEFT))Window.X += 10;
		if(Gdx.input.isKeyPressed(Keys.RIGHT))Window.X -= 10;
	}
	

}